package dev.joku.m347.devcontainer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private long id;

    @Column(nullable = false, unique = true)
    private String userName;

    public Users() {
    }

    public Users(String userName) {
        this.userName = userName;
    }

    public Users(long id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
