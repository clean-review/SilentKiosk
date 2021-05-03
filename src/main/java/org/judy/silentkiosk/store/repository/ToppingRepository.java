package org.judy.silentkiosk.store.repository;

import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.entity.StoreTopping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ToppingRepository extends JpaRepository<StoreTopping, Long> {

    @Query("select st, mt from MenuTopping mt " +
            "left join StoreTopping st on mt.storeTopping = st " +
            "where mt.storeMenu.mno = :mno")
    List<StoreTopping> getStoreTopping(Long mno);
}
