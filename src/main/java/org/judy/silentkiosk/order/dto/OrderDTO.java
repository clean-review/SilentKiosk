package org.judy.silentkiosk.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {

    private Long OrderNum;

    private String serialNum;

    private Long sno;

    private List<OrderMenuDTO> orderMenuDTOList;
}
