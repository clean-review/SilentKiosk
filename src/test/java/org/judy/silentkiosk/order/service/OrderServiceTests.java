package org.judy.silentkiosk.order.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class OrderServiceTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void getOrderTest(){

        Long sno = 20L;

        log.info(orderService.getOrderNum(sno));

    }

}
