var vm = new Vue({
    el: "#app",
    mounted: function(){
        this.$nextTick(function() {
            // var socket = new SockJS('/camera');
            // stompClient = Stomp.over(socket);
            // stompClient.debug = null;
            // stompClient.connect({}, function(){
            //     stompClient.subscribe('/topic/camera/' + 'othertest', getCanvasFromServer);
            // });
        })
    }
});