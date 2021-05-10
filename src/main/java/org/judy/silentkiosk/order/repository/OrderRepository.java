package org.judy.silentkiosk.order.repository;

import org.judy.silentkiosk.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("select count(od) as cnt from Kiosk ki " +
            "left join Order od on od.serialNum = ki.serialNum " +
            "where ki.sno.sno= :sno and " +
            "function('date_format', od.regDate, '%Y%m%d') = function('DATE_FORMAT', current_date , '%Y%m%d') " +
            "group by function('DATE_FORMAT', od.regDate, '%Y%m%d') ")
    public Long getOrderNum(Long sno);

}
