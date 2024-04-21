package dev.joku.m347.devcontainer.repository;

import dev.joku.m347.devcontainer.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByTimeCreatedAsc();
    List<Post> findAllByOrderByTimeCreatedDesc();
    List<Post> findByUserIdOrderByTimeCreatedAsc(Long userId);
    List<Post> findByUserIdOrderByTimeCreatedDesc(Long userId);
    List<Post> findByTitleOrderByTimeCreatedAsc(String title);
    List<Post> findByTitleOrderByTimeCreatedDesc(String title);
    List<Post> findByUserIdAndTitleOrderByTimeCreatedAsc(Long userId, String title);
    List<Post> findByUserIdAndTitleOrderByTimeCreatedDesc(Long userId, String title);
}
