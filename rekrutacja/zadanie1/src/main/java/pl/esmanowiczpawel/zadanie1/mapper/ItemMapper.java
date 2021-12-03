package pl.esmanowiczpawel.zadanie1.mapper;

import org.springframework.stereotype.Service;
import pl.esmanowiczpawel.zadanie1.dto.ItemDto;
import pl.esmanowiczpawel.zadanie1.model.Item;

@Service
public class ItemMapper {

    public static ItemDto toDto(Item item){
        ItemDto itemDto = new ItemDto();
        itemDto.setID_GUID(item.getID_GUID());
        itemDto.setName(item.getName());
        return itemDto;
    }
    static Item toEntity(ItemDto itemDto){
        Item itemEntity = new Item();
        itemEntity.setID_GUID(itemDto.getID_GUID());
        itemEntity.setName(itemDto.getName());
        return itemEntity;
    }



}
