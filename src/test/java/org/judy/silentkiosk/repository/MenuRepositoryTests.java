package org.judy.silentkiosk.repository;

import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.store.repository.MenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;

@SpringBootTest
@Log4j2
public class MenuRepositoryTests {

    @Autowired
    MenuRepository menuRepository;

    @Transactional
    @Commit
    @Test
    public void testGetMenu(){

        Long mno = 27L;

        log.info(menuRepository.getStoreMenu(mno));

    }
}
