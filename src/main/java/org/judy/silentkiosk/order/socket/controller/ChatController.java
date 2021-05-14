package org.judy.silentkiosk.order.socket.controller;

import org.judy.silentkiosk.order.dto.MessageDTO;
import org.judy.silentkiosk.order.dto.OrderDTO;
import org.judy.silentkiosk.order.socket.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChatController{

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat.sendMessage")
    public MessageDTO sendMessage(@Payload @RequestBody MessageDTO messageDTO) {
        System.out.println(messageDTO);
        Long sno = messageDTO.getSno();
        System.out.println("sno:" + sno);
        String destination = "/order/public/"+sno;
        simpMessagingTemplate.convertAndSend(destination, messageDTO);
        return messageDTO;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/order/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("sno", chatMessage.getSno());

        return chatMessage;
    }
}
