package org.judy.silentkiosk.store.service;

import org.judy.silentkiosk.store.dto.StoreMenuDTO;
import org.judy.silentkiosk.store.dto.StoreToppingDTO;
import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.entity.StoreTopping;

import java.util.List;

public interface MenuService {

    StoreMenuDTO getMenu(Long mno);

    List<StoreToppingDTO> getMenuTopping(Long mno);

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

    default StoreToppingDTO entityToTopDTO (StoreTopping topping){
        StoreToppingDTO storeToppingDTO = StoreToppingDTO.builder()
                .tno(topping.getTno())
                .tPrice(topping.getTPrice())
                .tImg(topping.getTImg())
                .tName(topping.getTName())
                .build();
        return storeToppingDTO;
    }
}
