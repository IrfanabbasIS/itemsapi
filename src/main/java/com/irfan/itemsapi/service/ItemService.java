package com.irfan.itemsapi.service;

import com.irfan.itemsapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();

    // Add new item
    public Item addItem(Item item) {
        items.add(item);
        return item;
    }

    // Get item by ID
    public Item getItemById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    // Get all items (optional but useful)
    public List<Item> getAllItems() {
        return items;
    }

    


}
