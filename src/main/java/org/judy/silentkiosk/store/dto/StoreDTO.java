package org.judy.silentkiosk.store.dto;

import lombok.*;
import org.judy.silentkiosk.store.entity.StoreMenu;

import javax.persistence.Column;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreDTO {

    private Long sno;

    private String mid;

    private String sname;

    private double lat,lng;

    private String address;

    private String category;

    private String logoImg;

    private boolean enable;

    private StoreMenuDTO menuList;

}
