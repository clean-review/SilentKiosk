package org.judy.silentkiosk.order.repository;

import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.order.entity.Kiosk;
import org.judy.silentkiosk.order.entity.Order;
import org.judy.silentkiosk.store.entity.Store;
import org.judy.silentkiosk.store.repository.StoreRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class OrderRepositoryTests {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    StoreRepository storeRepository;

    @Test
    public void orderNumTest(){

        Long sno = 20L;

        log.info(orderRepository.getOrderNum(sno));

    }

    @Test
    public void insertOrder(){

        Store store = storeRepository.getStoreBySno(53L);

        Kiosk kiosk = Kiosk.builder().serialNum("kyg").sno(store).build();

        Order order = Order.builder().serialNum(kiosk).totalPrice("7000").cancel(false).build();

        orderRepository.save(order);


    }

}
