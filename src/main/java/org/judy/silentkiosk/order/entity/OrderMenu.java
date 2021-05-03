package org.judy.silentkiosk.order.entity;

import lombok.*;
import org.judy.silentkiosk.store.entity.StoreMenu;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"ono","mno"})
@Getter
@Table(name = "tbl_order_menu")
public class OrderMenu{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long omno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mno")
    private StoreMenu mno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ono")
    private Order ono;

    private Long qty;


}
