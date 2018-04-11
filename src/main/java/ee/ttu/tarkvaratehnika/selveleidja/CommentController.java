package ee.ttu.tarkvaratehnika.selveleidja;
//import org.springframework.web.bind.annotation.*;


import java.util.Collection;
//import java.util.List;
import java.util.stream.Collectors;

//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

/*    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping(value="/comments/add", method=RequestMethod.POST,
            consumes = "application/json")
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @RequestMapping(value="/comments", method=RequestMethod.GET)
    public List<Comment> getAllUsers() {
        return commentService.getAllComments();
    }

   }*/


    private CommentRepository repository;

    public CommentController(CommentRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/comments", method = {RequestMethod.GET, RequestMethod.POST})
    public Collection<Comment> comments() {
        return repository.findAll().stream().collect(Collectors.toList());
    }
}

