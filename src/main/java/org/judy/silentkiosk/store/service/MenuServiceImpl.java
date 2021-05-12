package org.judy.silentkiosk.store.service;

import lombok.RequiredArgsConstructor;
import org.judy.silentkiosk.store.dto.StoreMenuDTO;
import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.repository.MenuRepository;
import org.judy.silentkiosk.store.repository.ToppingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

    private final MenuRepository menuRepository;
    private final ToppingRepository toppingRepository;

    @Override
    public List<StoreMenuDTO> getMenuTopping(Long mno) {


        return null;
    }

    @Override
    public StoreMenuDTO getMenu(Long mno) {

        return null;
    }
}
