package org.judy.silentkiosk.order.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class OrderRepositoryTests {

    @Autowired
    OrderRepository orderRepository;

    @Test
    public void orderNumTest(){

        Long sno = 20L;

        log.info(orderRepository.getOrderNum(sno));

    }

}
