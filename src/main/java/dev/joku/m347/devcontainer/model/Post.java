package dev.joku.m347.devcontainer.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp timeCreated;
    @Column
    private Boolean edited;
    @ManyToOne
    private Users user;


    public Post() {
    }


    public Post(String title, String content, Users user, Timestamp timeCreated) {
        this.title = title;
        this.content = content;
        this.timeCreated = timeCreated;
        this.edited = false;
        this.user = user;
    }


    public Post(long id, String title, String content, Users user, Timestamp timeCreated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.timeCreated = timeCreated;
        this.edited = false;
        this.user = user;
    }
}
