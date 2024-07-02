package cz.upol.pja.lecture05.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@NamedQueries({
    @NamedQuery(
            name = "allPosts",
            query = "select posts from Post posts"),
    @NamedQuery(
            name = "participatedDiscs",
            query = "SELECT DISTINCT p.discussion FROM Post p WHERE p.firstName = :postAuthor"
    )
})

@Entity
@Table(name = "lec05_posts")
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "discussion_id")
    private Discussion discussion;

    @Column(name = "author")
    private String firstName;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "content")
    private String content;

    public Post() {
    }

    public Post(Discussion discussion, String content, String firstName, Date date) {
        this.discussion = discussion;
        this.firstName = firstName;
        this.date = date;
        this.content = content;
    }

    // <editor-fold defaultstate="collapsed" desc="getters, setters, equals & hashCode ">
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        return this.id == other.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // </editor-fold>
}
