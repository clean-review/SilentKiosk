package org.judy.silentkiosk.store.service;

import org.judy.silentkiosk.store.dto.StoreMenuDTO;
import org.judy.silentkiosk.store.entity.StoreMenu;

public interface MenuService {

    StoreMenuDTO getMenu(Long mno);

    default StoreMenuDTO entityToDTO(StoreMenu storeMenu) {
        StoreMenuDTO storeMenuDTO = StoreMenuDTO.builder()
                .mno(storeMenu.getMno())
                .sno(storeMenu.getStore().getSno())
                .cno(storeMenu.getCno())
                .menuName(storeMenu.getMenuName())
                .mPrice(storeMenu.getMPrice())
                .content(storeMenu.getContent())
                .mImg(storeMenu.getMImg())
                .build();
        return storeMenuDTO;
    }
}
