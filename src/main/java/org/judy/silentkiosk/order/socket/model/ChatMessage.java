package org.judy.silentkiosk.order.socket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    private Long sno;
    //임시
    private String dto;

    private MessageType type;

}
