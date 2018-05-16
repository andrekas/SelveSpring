package ee.ttu.tarkvaratehnika.selveleidja.Pesulad;

import ee.ttu.tarkvaratehnika.selveleidja.Comment;
import ee.ttu.tarkvaratehnika.selveleidja.CommentRepository;
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
@SpringBootTest
public class CommentTests {
    @RunWith(SpringRunner.class)
    @DataJpaTest
    @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
    public class CommentTest {
        private Comment com;
        private List<Comment> commentList;


        @Before
        public void setUp() {
            com = new Comment("See on kommentaar");
            entityManager.merge(com);
            entityManager.flush();
            commentList = commentRepository.findAll();
        }

        @After
        public void tearDown() {
            com = null;
        }

        @Autowired
        private TestEntityManager entityManager;

        @Autowired
        private CommentRepository commentRepository;

        @Test
        public void textTest() {
            int lenght = commentList.size();
            String content = commentList.get(lenght - 1).content;
            assertEquals(content, com.content);
        }
    }
}