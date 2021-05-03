package org.judy.silentkiosk.order.entity;

import lombok.*;
import org.judy.silentkiosk.store.entity.Store;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "sno")
@Table(name = "tbl_kiosk")
public class Kiosk {

    @Id
    private String serialNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sno")
    private Store sno;

    private LocalDateTime kStartDate;

    private LocalDateTime kEndDate;
}
