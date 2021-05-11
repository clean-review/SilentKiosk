package org.judy.silentkiosk.repository;

import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.store.repository.MenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@Log4j2
public class MenuRepositoryTests {

    @Autowired
    MenuRepository menuRepository;

    @Test
    public void getMenuTest(){
        log.info(menuRepository.getStoreMenuBymno(71L));
    }
    @Test
    public void getMenuTest2(){

        Long sno = 73L;

        List<Object[]> result = menuRepository.getStoreMenu(sno);

        result.forEach(arr -> log.info(Arrays.toString(arr)));
    }
}
