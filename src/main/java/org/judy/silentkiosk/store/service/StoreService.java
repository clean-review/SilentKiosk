package org.judy.silentkiosk.store.service;

import org.judy.silentkiosk.store.dto.StoreDTO;
import org.judy.silentkiosk.store.dto.StoreMenuDTO;
import org.judy.silentkiosk.store.dto.StoreToppingDTO;
import org.judy.silentkiosk.store.entity.Store;
import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.entity.StoreTopping;

import java.util.List;

public interface StoreService {

        StoreDTO getStoreBySno(Long sno);

        List<StoreToppingDTO> getStoreTopping(Long mno);

        List<StoreMenuDTO> getStoreMenu(Long sno);

        default StoreDTO entityToDTO(Store store){

            StoreDTO dto = StoreDTO.builder()
                    .sno(store.getSno())
                    .mid(store.getMid())
                    .sname(store.getSname())
                    .lat(store.getLat())
                    .lng(store.getLng())
                    .address(store.getAddress())
                    .category(store.getCategory())
                    .logoImg(store.getLogoImg())
                    .enable(store.isEnable())
                    .build();

            return dto;
        }

    default StoreMenuDTO menuEntityToDTO(StoreMenu storeMenu){

        StoreMenuDTO storeMenuDTO = StoreMenuDTO.builder()
                .mno(storeMenu.getMno())
                .sno(storeMenu.getStore().getSno())
                .menuName(storeMenu.getMenuName())
                .mPrice(storeMenu.getMPrice())
                .content(storeMenu.getContent())
                .mImg(storeMenu.getMImg())
                .cno(storeMenu.getCno())
                .build();
        return storeMenuDTO;
    }

        default StoreToppingDTO topEntityToDTO(StoreTopping storeTopping){

            StoreToppingDTO dto = StoreToppingDTO.builder()
                    .tno(storeTopping.getTno())
                    .tPrice(storeTopping.getTPrice())
                    .tImg(storeTopping.getTImg())
                    .tName(storeTopping.getTName())
                    .sno(storeTopping.getStore().getSno())
                    .build();

            return dto;
        }
}
