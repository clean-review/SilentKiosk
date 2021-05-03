package org.judy.silentkiosk.order.entity;

import lombok.*;
import org.judy.silentkiosk.store.entity.MenuTopping;
import org.judy.silentkiosk.store.entity.StoreTopping;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = {"omno","tno"})
@Table(name = "tbl_order_topping")
public class OrderTopping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long otno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "omno")
    private OrderMenu omno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tno")
    private StoreTopping tno;

    private Long tqty;
}
