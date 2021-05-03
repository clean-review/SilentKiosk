package org.judy.silentkiosk.order.entity;

import lombok.*;
import org.judy.silentkiosk.common.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = "serialNum")
@Table(name = "tbl_order")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serialNum")
    private Kiosk serialNum;

    private String totalPrice;

    private boolean cancel;
}
