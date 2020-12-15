package services;

import entities.Comment;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import java.util.List;

public class CommentServiceImp implements CommentService{
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void create(Comment comment) {
        Session session = sessionFactory.openSession();
        session.save(comment);
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public Comment findOne(int id) {
        return null;
    }

    @Override
    public Comment save(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> save(List<Comment> comments) {
        return null;
    }

    @Override
    public boolean exists(int id) {
        return false;
    }

    @Override
    public List<Comment> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(Comment product) {

    }

    @Override
    public void delete(List<Comment> products) {

    }

    @Override
    public void deleteAll() {

    }
}
