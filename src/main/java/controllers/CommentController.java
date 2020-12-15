package controllers;

import entities.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.CommentService;

import java.util.List;

@Controller
@RequestMapping("/nasa")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/home")
    public String home(){
        return "nasa";
    }
    @GetMapping("/comment")
    public String comment(Model model){
        model.addAttribute("comment",new Comment());
        return "comment";
    }
    @PostMapping("/comment")
    public String comment(@ModelAttribute("comment")Comment comment){
        commentService.create(comment);
        return "nasa";
    }
    @GetMapping("/listcomment")
    public String listComment(Model model){
        List<Comment> commentList = commentService.findAll();
        model.addAttribute("commentList",commentList);
        return "listcomment";
    }
    @PostMapping("/like")
    public String likes(@ModelAttribute("comment")Comment comment,Model model){
        commentService.save(comment);


        List<Comment> commentList = commentService.findAll();
        model.addAttribute("commentList",commentList);
        return "listcomment";

    }
}
