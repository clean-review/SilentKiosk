package org.judy.silentkiosk.store.entity;


import lombok.*;
import org.judy.silentkiosk.common.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Table(name = "tbl_store")
public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sno;

    private String mid;

    private String sname;

    private double lat,lng;

    private String address;

    private String category;

    private String logoImg;

    private boolean enable;

}
