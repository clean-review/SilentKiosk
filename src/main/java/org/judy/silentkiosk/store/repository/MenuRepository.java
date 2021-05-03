package org.judy.silentkiosk.store.repository;

import org.judy.silentkiosk.store.entity.StoreMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface MenuRepository extends JpaRepository<StoreMenu, Long> {

    @Query("select m from StoreMenu m where m.mno=:mno")
    StoreMenu getStoreMenu(Long mno);
}
