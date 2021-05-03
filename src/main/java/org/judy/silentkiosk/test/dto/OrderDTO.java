package org.judy.silentkiosk.test.dto;

import lombok.*;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class OrderDTO {

    private Long sno;
    private String menu;
    private Long price;
    private Long qty;
}
