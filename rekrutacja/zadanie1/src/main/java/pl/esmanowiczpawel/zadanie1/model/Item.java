package pl.esmanowiczpawel.zadanie1.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_GUID;
    private String Name;

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
