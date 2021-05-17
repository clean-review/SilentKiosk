package org.judy.silentkiosk.order.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.order.entity.Order;
import org.judy.silentkiosk.order.repository.OrderRepository;
import org.judy.silentkiosk.store.entity.Store;
import org.judy.silentkiosk.store.repository.StoreRepository;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    private final StoreRepository storeRepository;

    @Override
    public Long getOrderNum(Long sno) {
        return orderRepository.getOrderNum(sno);
    }

    @Override
    public String getStoreName(Long sno) {
        Store store = storeRepository.getStoreBySno(sno);

        return store.getSname();

    }

    @Override
    public void insertOrder(Order order) {

        orderRepository.save(order);
    }

}
