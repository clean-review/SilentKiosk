package org.judy.silentkiosk.store.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.store.dto.StoreMenuDTO;
import org.judy.silentkiosk.store.dto.StoreToppingDTO;
import org.judy.silentkiosk.store.entity.StoreMenu;
import org.judy.silentkiosk.store.entity.StoreTopping;
import org.judy.silentkiosk.store.repository.MenuRepository;
import org.judy.silentkiosk.store.repository.ToppingRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2
public class MenuServiceImpl implements MenuService{

    private final MenuRepository menuRepository;
    private final ToppingRepository toppingRepository;

    @Override
    public List<StoreToppingDTO> getMenuTopping(Long mno) {

        List<StoreTopping> toppingList = toppingRepository.getStoreTopping(mno);

        return toppingList.stream().map(topping -> entityToTopDTO(topping)).collect(Collectors.toList());
    }

    @Override
    public StoreMenuDTO getMenu(Long mno) {

        return entityToDTO(menuRepository.getStoreMenuBymno(mno));
    }
}
