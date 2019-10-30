(async function () {
    const video = document.querySelector('video');
    const canvas = document.querySelector('canvas');
    const img = document.querySelector('img');
    const context = canvas.getContext('2d');
    const sound = document.querySelector('audio');

    const socket = new SockJS('/camera');
    let stompClient = null;

    setInterval(main,16);

    function main() {
        if (socket.readyState === 1) {
            drawCanvas();
            readCanvas();
        } else {
            onOpen();

        }
    }

    function onOpen() {
        stompClient = Stomp.over(socket);
        stompClient.debug = null;
        stompClient.connect({}, function () {
            stompClient.subscribe('/topic/camera/' + 'othertest', getCanvasFromServer);
        });
    }

    const constraintsVideo = {
        video: true,
        audio: false
    };

    navigator.mediaDevices.getUserMedia(constraintsVideo).then(function(stream){
        video.srcObject=stream;
        video.play();
    }).catch(function(err){

    });

    const contraintsAudio = {
        video: false,
        audio: true
    };

    navigator.mediaDevices.getUserMedia(contraintsAudio).then(function(stream){
        sound.srcObject=stream;
        sound.play();
    }).catch(function(err){

    });

    function drawCanvas() {
        context.drawImage(video, 0, 0, canvas.width, canvas.height);
    }

    function readCanvas() {
        const canvasdata = canvas.toDataURL('image/webp').split(',')[1];

        const chatMessage = {
            content: canvasdata,
            sender: 'othertest'
        };

        stompClient.send("/api/frame", {}, JSON.stringify(chatMessage));
    }

    function getCanvasFromServer(payload) {
        img.setAttribute('src', 'data:image/webp;base64, ' + JSON.parse(payload.body).content);
    }
})();