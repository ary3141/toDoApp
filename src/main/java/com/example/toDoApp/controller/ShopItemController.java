package com.example.toDoApp.controller;

import com.example.toDoApp.entity.ShopItem;
import com.example.toDoApp.service.ShopItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shop")
public class ShopItemController {

    private final ShopItemService shopItemService;

    public ShopItemController(ShopItemService shopItemService) {
        this.shopItemService = shopItemService;
    }

    @PostMapping
    public ResponseEntity<ShopItem> addItem(@RequestBody ShopItem item) {
        return ResponseEntity.ok(shopItemService.addItem(item));
    }

    @GetMapping
    public ResponseEntity<List<ShopItem>> getAllItems() {
        return ResponseEntity.ok(shopItemService.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShopItem> getItemById(@PathVariable Long id) {
        return shopItemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        shopItemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}
