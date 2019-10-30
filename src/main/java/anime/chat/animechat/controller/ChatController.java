package anime.chat.animechat.controller;

import anime.chat.animechat.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @MessageMapping("/frame")
    public void sendMessage(@Payload ChatMessage chatMessage){
        messagingTemplate.convertAndSend("/topic/camera/" + chatMessage.getSender(), chatMessage);
    }
}
