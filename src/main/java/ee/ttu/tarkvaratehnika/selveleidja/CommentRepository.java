package ee.ttu.tarkvaratehnika.selveleidja;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
    @Override
    public List<Comment> findAll();

    Comment findOne(long commentId);
}

*/



@RepositoryRestResource
interface CommentRepository extends JpaRepository<Comment, Long> {
}

