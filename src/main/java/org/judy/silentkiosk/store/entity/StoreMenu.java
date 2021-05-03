package org.judy.silentkiosk.store.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString(exclude = "store")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_store_menu")
public class StoreMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sno")
    private Store store;

    private String menuName;

    private String mPrice,content,mImg;

    private Long cno;
}
