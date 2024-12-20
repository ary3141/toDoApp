package com.example.toDoApp.repository;

import com.example.toDoApp.entity.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopItemRepository extends JpaRepository<ShopItem, Long> {
}
