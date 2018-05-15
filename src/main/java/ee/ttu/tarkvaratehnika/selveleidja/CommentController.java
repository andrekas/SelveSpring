package ee.ttu.tarkvaratehnika.selveleidja;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value="/comments/add", method = RequestMethod.POST, consumes = "application/json")
    public Comment addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }

    @RequestMapping(value="/comments", method=RequestMethod.GET)
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @RequestMapping(value = "/comments/{id}", method=RequestMethod.GET)
    public Comment getComment(@PathVariable("id") long commentId) {
        return commentService.getCommentById(commentId);
    }
}

