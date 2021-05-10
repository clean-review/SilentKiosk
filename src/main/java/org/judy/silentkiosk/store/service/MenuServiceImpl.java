package org.judy.silentkiosk.store.service;

import lombok.RequiredArgsConstructor;
import org.judy.silentkiosk.store.dto.StoreMenuDTO;
import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.repository.MenuRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

    private final MenuRepository menuRepository;

    @Override
    public StoreMenuDTO getMenu(Long mno) {
        return entityToDTO(menuRepository.getStoreMenuBymno(mno));
    }
}
