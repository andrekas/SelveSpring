package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PesuladInfoTests {
    @Test
    public void getId() {
        PesuladInfo pesuladInfo = new PesuladInfo(name, address, hind, kommentaar);
        pesuladInfo.setId(2);
        assertEquals(2,pesuladInfo.id);
    }

    @Test
    public void getName() {
        PesuladInfo name = new PesuladInfo(name, address, hind, kommentaar);
        name.setName("Jazz");
        assertEquals("Jazz", name.name);
    }

    @Test
    public void getAddress() {
        PesuladInfo address = new PesuladInfo(name, address, hind, kommentaar);
        address.setAddress("Paldiski mnt 98a");
        assertEquals("Paldiski mnt 98a", address.address);
    }

    @Test
    public void getHind() {
        PesuladInfo hind = new PesuladInfo(name, address, hind, kommentaar);
        hind.setHind("0.5€ = 50 sekundit");
        assertEquals("0.5€ = 50 sekundit", hind.hind);
    }

    @Test
    public void getKommentaar() {
        PesuladInfo kommentaar = new PesuladInfo(name, address, hind, kommentaar);
        kommentaar.setKommentaar("Parim pesula!!");
        Assert.assertEquals("Parim pesula!", kommentaar.kommentaar);
    }
}