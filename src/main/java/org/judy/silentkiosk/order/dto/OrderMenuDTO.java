package org.judy.silentkiosk.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderMenuDTO {

    private Long mno;

    private String mName,mPrice;

    private Long mqty;

    private List<ToppingDTO> toppingDTOList;
}
