package org.judy.silentkiosk.store.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreMenuDTO {

    private Long mno;

    private Long sno;

    private String menuName;

    private String mPrice,content,mImg;

    private Long cno;

    private StoreToppingDTO toppingDTO;
}