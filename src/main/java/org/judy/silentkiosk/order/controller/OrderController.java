package org.judy.silentkiosk.order.controller;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.order.dto.OrderDTO;
import org.judy.silentkiosk.order.socket.model.ChatMessage;
import org.judy.silentkiosk.order.socket.model.MessageType;
import org.judy.silentkiosk.test.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Log4j2
@RequiredArgsConstructor
public class OrderController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    private final OrderService orderService;

    @PostMapping("/getOrder")
    public ResponseEntity<Long> testOrder(@RequestBody OrderDTO orderDTO){

        log.info(orderDTO);

        Long sno = orderDTO.getSno();

        Gson gson = new Gson();

        String dto = gson.toJson(orderDTO);

        String destination = "/order/public/"+sno;

        Long ordernum = 120L;

        ChatMessage chatMessage = ChatMessage.builder().orderNum(ordernum).sno(sno).dto(dto).type(MessageType.CHAT).build();
        simpMessagingTemplate.convertAndSend(destination, chatMessage);

        return new ResponseEntity<>(ordernum , HttpStatus.OK);
   }
}
