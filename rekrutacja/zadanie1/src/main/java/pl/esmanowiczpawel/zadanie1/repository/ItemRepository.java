package pl.esmanowiczpawel.zadanie1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.esmanowiczpawel.zadanie1.model.Item;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ItemRepository extends CrudRepository<Item, Long> {

}
