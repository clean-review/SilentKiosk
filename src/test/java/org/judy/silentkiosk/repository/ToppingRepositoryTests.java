package org.judy.silentkiosk.repository;

import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.repository.ToppingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;

@SpringBootTest
@Log4j2
public class ToppingRepositoryTests {

    @Autowired
    ToppingRepository toppingRepository;


    @Test
    public void testGetMenu(){

        Long mno = 76L;

        log.info(toppingRepository.getStoreTopping(mno));

    }
}
