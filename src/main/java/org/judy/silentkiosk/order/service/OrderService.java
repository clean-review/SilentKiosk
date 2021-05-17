package org.judy.silentkiosk.order.service;

import org.judy.silentkiosk.order.dto.OrderDTO;
import org.judy.silentkiosk.order.entity.Kiosk;
import org.judy.silentkiosk.order.entity.Order;
import org.judy.silentkiosk.store.entity.Store;

public interface OrderService {

    public Long getOrderNum(Long sno);

    public String getStoreName(Long sno);

    public void insertOrder(Order order);

    default Order DTOtoEntity(OrderDTO orderDTO){

        Store store = Store.builder().sno(orderDTO.getSno()).build();

        return Order.builder().serialNum(Kiosk.builder().serialNum(orderDTO.getSerialNum()).sno(store).build())
        .totalPrice(orderDTO.getTotalPrice()).build();

    }
}
