package org.judy.silentkiosk.store.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.store.dto.StoreDTO;
import org.judy.silentkiosk.store.dto.StoreMenuDTO;
import org.judy.silentkiosk.store.dto.StoreToppingDTO;
import org.judy.silentkiosk.store.entity.Store;
import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.entity.StoreTopping;
import org.judy.silentkiosk.store.repository.StoreRepository;
import org.judy.silentkiosk.store.repository.ToppingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {

    @Override
    public List<StoreMenuDTO> getStoreMenu(Long sno) {
        List<StoreMenu> storeMenuList = storeRepository.getStoreMenuBySno(sno);
        return storeMenuList.stream().map(storeMenu -> menuEntityToDTO(storeMenu)).collect(Collectors.toList());
    }

    private final StoreRepository storeRepository;

    private final ToppingRepository toppingRepository;

    @Override
    public StoreDTO getStoreBySno(Long sno) {

        Store store =storeRepository.getStoreBySno(sno);

        return entityToDTO(store);
    }

    @Override
    public List<StoreToppingDTO> getStoreTopping(Long mno) {

        List<StoreTopping> storeToppingList = toppingRepository.getStoreTopping(mno);

        return storeToppingList.stream().map(storeTopping -> topEntityToDTO(storeTopping)).collect(Collectors.toList());
    }

}
