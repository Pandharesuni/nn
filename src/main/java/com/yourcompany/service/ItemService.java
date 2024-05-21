package com.yourcompany.service;

import com.yourcompany.model.Item;
import com.yourcompany.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item createItem(Item item) {
        // Your business logic for creating an item
        return itemRepository.save(item);
    }

    // Other methods for item operations
}
