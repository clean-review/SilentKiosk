package org.judy.silentkiosk.store.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_store_topping")
@ToString(exclude = "sno")
public class StoreTopping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    private String tPrice;

    private String tImg;

    private String tName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sno")
    private Store sno;
}