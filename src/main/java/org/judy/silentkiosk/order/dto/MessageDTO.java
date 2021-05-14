package org.judy.silentkiosk.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.judy.silentkiosk.order.socket.model.MessageType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {

    private MessageType type;

    private Long orderNum;

    private Long sno;

}
