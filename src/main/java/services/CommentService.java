package services;

import entities.Comment;

import java.util.List;

public interface CommentService {
    void create(Comment comment);

    List<Comment> findAll();

    Comment findOne(int id);

    Comment save(Comment comment);

    List<Comment> save(List<Comment> comments);

    boolean exists(int id);

    List<Comment> findAll(List<Long> ids);

    long count();

    void delete(int id);

    void delete(Comment product);

    void delete(List<Comment> products);

    void deleteAll();
}
