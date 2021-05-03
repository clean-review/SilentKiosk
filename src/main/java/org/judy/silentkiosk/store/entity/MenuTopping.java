package org.judy.silentkiosk.store.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "tbl_menu_topping")
public class MenuTopping{

    @Id
    @Column(name = "mno")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mno")
    private StoreMenu mno;

    @Id
    @Column(name = "tno")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tno")
    private StoreTopping tno;
}
