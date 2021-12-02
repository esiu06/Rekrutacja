package pl.esmanowiczpawel.zadanie1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_GUID;
    private String Name;

    // for hibernate
    public Item() {
    }

    public Item(String name) {
        Name = name;
    }

    public Long getID_GUID() {
        return ID_GUID;
    }

    public void setID_GUID(Long ID_GUID) {
        this.ID_GUID = ID_GUID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
