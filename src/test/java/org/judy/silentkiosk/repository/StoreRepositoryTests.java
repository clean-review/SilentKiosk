package org.judy.silentkiosk.repository;

import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.store.repository.StoreRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class StoreRepositoryTests {

    @Autowired
    private StoreRepository storeRepository;

    @Test
    public void testGetStore(){
        Long sno = 34L;
        log.info(storeRepository.getStoreBy(sno));
    }

}
