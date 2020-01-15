package anime.chat.animechat.controller;

import anime.chat.animechat.model.ChatMessage;
import anime.chat.animechat.model.VideoMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @MessageMapping("/frame")
    public void sendMessage(@Payload VideoMessage videoMessage){
        messagingTemplate.convertAndSend("/topic/camera/" + videoMessage.getSender(), videoMessage);
    }

    @MessageMapping("/textchat")
    public void sendText(@Payload ChatMessage chatMessage){
        messagingTemplate.convertAndSend("/topic/textchat", chatMessage);
    }

    @MessageMapping("/textchat.addUser")
    @SendTo("/topic/textchat")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor){
        //Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
}
