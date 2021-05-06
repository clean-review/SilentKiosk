package org.judy.silentkiosk.store.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreToppingDTO {

    private Long tno;

    private Long sno;

    private String tPrice;

    private String tImg;

    private String tName;
}
