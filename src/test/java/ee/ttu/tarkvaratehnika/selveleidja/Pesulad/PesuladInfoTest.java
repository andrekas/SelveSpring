package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PesuladInfoTest {
    private PesuladInfo info;
    private List<PesuladInfo> infoList;


    @Before
    public void setUp(){
        info = new PesuladInfo(1, "Jazz", "Tallinn", "0,5€ = 100 sekundit");
        entityManager.merge(info);
        entityManager.flush();
        infoList = infoRepository.findAll();
    }

    @After
    public void tearDown(){
        info = null;
    }

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private InfoRepository infoRepository;

    @Test
    public void getId() {
        PesuladInfo pesuladInfo = new PesuladInfo();
        pesuladInfo.setId(2);
        assertEquals(2,pesuladInfo.id);
    }

    @Test
    public void getName() {
        PesuladInfo name = new PesuladInfo();
        name.setName("Jazz");
        assertEquals("Jazz", name.name);
    }

    @Test
    public void getAddress() {
        PesuladInfo address = new PesuladInfo();
        address.setAddress("Paldiski mnt 98a");
        assertEquals("Paldiski mnt 98a", address.address);
    }

    @Test
    public void getHind() {
        PesuladInfo hind = new PesuladInfo();
        hind.setHind("0.5€ = 50 sekundit");
        assertEquals("0.5€ = 50 sekundit", hind.hind);
    }
}