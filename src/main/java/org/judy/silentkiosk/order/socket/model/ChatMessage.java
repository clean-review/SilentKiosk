package org.judy.silentkiosk.order.socket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.judy.silentkiosk.test.dto.OrderDTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    //임시
    private OrderDTO orderDTO;
}
