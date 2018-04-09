package ee.ttu.tarkvaratehnika.selveleidja;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class PesuladInfo {
    @Id
    @GeneratedValue
    long id;
    String name;
    String address;
    String hind;
    String kommentaar;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public String getHind() {
        return hind;
    }

    public void setHind(String hind) {
        this.hind = hind;
    }

    public String getKommentaar() {
        return kommentaar;
    }

    public void setKommentaar(String kommentaar) {
        this.kommentaar = kommentaar;
    }
}

