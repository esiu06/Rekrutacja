package pl.esmanowiczpawel.zadanie1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.esmanowiczpawel.zadanie1.model.Item;
import pl.esmanowiczpawel.zadanie1.repository.ItemRepository;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Iterable<Item> GetItem(){
        return  itemRepository.findAll();
    }

    @PostMapping
    public Item AddItem(@RequestBody Item item){
        return itemRepository.save(item);
    }
}
