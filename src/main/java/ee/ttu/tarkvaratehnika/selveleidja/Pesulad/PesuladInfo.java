package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PesuladInfo {
    @Id
    @GeneratedValue
    long id;
    String name;
    String address;
    String hind;

    public PesuladInfo(){}

    public PesuladInfo(long id, String name, String address, String hind){
        this.id = id;
        this.name = name;
        this.address = address;
        this.hind = hind;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHind(String hind){ this.hind = hind; }

    public String getHind() {
        return hind;
    }

    @Override
    public String toString() {
        return "PesuladInfo{" +
                "id=" + id +
                ", name='" + name +
                ", address=" + address +
                ", hind=" + hind + '\'' +
                '}';
    }
}


