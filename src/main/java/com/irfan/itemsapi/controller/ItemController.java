package com.irfan.itemsapi.controller;

import com.irfan.itemsapi.model.Item;
import com.irfan.itemsapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Add new item
    @PostMapping
public Object addItem(@RequestBody Item item) {

    if (item.getId() <= 0) {
        return "Item id must be greater than 0";
    }
    

    if (item.getName() == null || item.getName().trim().isEmpty()) {
        return "Item name is required";
    }

    if (item.getDescription() == null || item.getDescription().trim().isEmpty()) {
        return "Item description is required";
    }

    return itemService.addItem(item);
}


    // Get item by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemService.getItemById(id);
    }
}
