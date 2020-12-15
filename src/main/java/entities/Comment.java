package entities;

import javax.persistence.*;

@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ratting;
    private String author;
    private String feedBack;

    public Comment() {
    }

    public Comment(int ratting, String author, String feedBack) {
        this.ratting = ratting;
        this.author = author;
        this.feedBack = feedBack;
    }

    public Comment(int id, int ratting, String author, String feedBack) {
        this.id = id;
        this.ratting = ratting;
        this.author = author;
        this.feedBack = feedBack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRatting() {
        return ratting;
    }

    public void setRatting(int ratting) {
        this.ratting = ratting;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }
}
