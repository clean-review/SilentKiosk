package org.judy.silentkiosk.store.repository;

import org.judy.silentkiosk.store.entity.StoreMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<StoreMenu,Long> {

    @Query("select m from StoreMenu m where m.mno = :mno")
    StoreMenu getStoreMenuBymno(Long mno);

    @Query("select sm, st from MenuTopping mt " +
            "left join StoreTopping st on mt.storeTopping.tno = st.tno " +
            "left join StoreMenu sm on sm.mno = mt.storeMenu.mno " +
            "where mt.storeMenu.mno = :mno")
    List<Object[]> getStoreMenu(Long mno);
}
