package org.judy.silentkiosk.store.repository;

import org.judy.silentkiosk.store.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StoreRepository extends JpaRepository<Store,Long> {

    @Query("select s from Store s where s.sno = :sno")
    public Store getStoreBy(Long sno);

}
