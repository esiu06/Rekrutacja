package pl.esmanowiczpawel.zadanie1.service;

import org.springframework.stereotype.Service;
import pl.esmanowiczpawel.zadanie1.model.Item;
import pl.esmanowiczpawel.zadanie1.repository.ItemRepository;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Iterable<Item> findAll(){
        return itemRepository.findAll();
    }

    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
