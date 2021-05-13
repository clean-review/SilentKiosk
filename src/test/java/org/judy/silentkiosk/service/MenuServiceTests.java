package org.judy.silentkiosk.service;

import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.store.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class MenuServiceTests {

    @Autowired
    MenuService menuService;

    @Test
    public void getMenuToppingTest(){

        log.info(menuService.getMenuTopping(73L));
    }

    @Test
    public void getMenuTest(){

    }
}
