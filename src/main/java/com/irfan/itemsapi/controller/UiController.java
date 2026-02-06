package com.irfan.itemsapi.controller;

import com.irfan.itemsapi.model.Item;
import com.irfan.itemsapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UiController {

    @Autowired
    private ItemService itemService;

    

    // Handle add item from UI
    @PostMapping("/ui/add")
    public String addItem(
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam String description,
            Model model) {

        if (id <= 0 || name.trim().isEmpty() || description.trim().isEmpty()) {
            model.addAttribute("error", "All fields are required and ID must be > 0");
            return "index";
        }

        Item item = new Item(id, name, description);
        itemService.addItem(item);
        model.addAttribute("item", item);

        return "index";
    }

    // Handle get item by id from UI
    @GetMapping("/ui/get")
    public String getItem(@RequestParam int id, Model model) {

        Item item = itemService.getItemById(id);

        if (item == null) {
            model.addAttribute("error", "Item not found");
        } else {
            model.addAttribute("item", item);
        }

        return "index";
    }
}
