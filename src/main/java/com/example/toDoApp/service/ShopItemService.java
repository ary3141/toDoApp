package com.example.toDoApp.service;

import com.example.toDoApp.entity.ShopItem;
import com.example.toDoApp.repository.ShopItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopItemService {

    private final ShopItemRepository shopItemRepository;

    public ShopItemService(ShopItemRepository shopItemRepository) {
        this.shopItemRepository = shopItemRepository;
    }

    public ShopItem addItem(ShopItem item) {
        return shopItemRepository.save(item);
    }

    public List<ShopItem> getAllItems() {
        return shopItemRepository.findAll();
    }

    public Optional<ShopItem> getItemById(Long id) {
        return shopItemRepository.findById(id);
    }

    public void deleteItem(Long id) {
        shopItemRepository.deleteById(id);
    }
}
