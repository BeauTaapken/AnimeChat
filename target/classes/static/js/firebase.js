// Your web app's Firebase configuration
var firebaseConfig = {
    apiKey: "AIzaSyCDmDYxwlofI1H-0hRbdONDQhLr9v8_0Xo",
    authDomain: "animechat-45181.firebaseapp.com",
    databaseURL: "https://animechat-45181.firebaseio.com",
    projectId: "animechat-45181",
    storageBucket: "animechat-45181.appspot.com",
    messagingSenderId: "287685805323",
    appId: "1:287685805323:web:3cfcd532f2e72d80f50e0e",
    measurementId: "G-RFTWMBEE35"
};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);
firebase.analytics();

var provider = new firebase.auth.GoogleAuthProvider();

firebase.auth().signInWithPopup(provider).then(function(result) {
    // This gives you a Google Access Token. You can use it to access the Google API.
    var token = result.credential.accessToken;
    console.log(token);
    // The signed-in user info.
    // ...
}).catch(function(error) {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;
    // The email of the user's account used.
    var email = error.email;
    // The firebase.auth.AuthCredential type that was used.
    var credential = error.credential;
    // ...
});