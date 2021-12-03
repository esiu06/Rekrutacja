package pl.esmanowiczpawel.zadanie1.dto;

public class ItemDto {

    private Long ID_GUID;
    private String Name;

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
