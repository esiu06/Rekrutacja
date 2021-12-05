package pl.esmanowiczpawel.zadanie1.controller;

import org.springframework.web.bind.annotation.*;
import pl.esmanowiczpawel.zadanie1.dto.ItemDto;
import pl.esmanowiczpawel.zadanie1.model.Item;
import pl.esmanowiczpawel.zadanie1.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public Iterable<Item> GetItem(){
        return  itemService.findAll();
    }
    @PostMapping
    public Item AddItem(@RequestBody ItemDto itemDto){
        return itemService.save(itemDto);
    }
}
