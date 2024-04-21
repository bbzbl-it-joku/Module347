package dev.joku.m347.devcontainer.service;

import dev.joku.m347.devcontainer.model.Post;
import dev.joku.m347.devcontainer.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public List<Post> getAllPostsOrderByTimeCreatedAsc() {
        return postRepository.findAllByOrderByTimeCreatedAsc();
    }

    public List<Post> getAllPostsOrderByTimeCreatedDesc() {
        return postRepository.findAllByOrderByTimeCreatedDesc();
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    public Post updatePost(Post post) {
        Long postId = post.getId();
        if (postId == null || !postRepository.existsById(postId)) {
            throw new EntityNotFoundException("Post does not exist");
        }
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        if (!postRepository.existsById(id)) {
            throw new EntityNotFoundException("Post does not exist");
        }
        postRepository.deleteById(id);
    }

    public List<Post> findPostsByUserIdOrderByTimeCreatedAsc(Long userId) {
        return postRepository.findByUserIdOrderByTimeCreatedAsc(userId);
    }

    public List<Post> findPostsByUserIdOrderByTimeCreatedDesc(Long userId) {
        return postRepository.findByUserIdOrderByTimeCreatedDesc(userId);
    }

    public List<Post> findPostsByTitleOrderByTimeCreatedAsc(String title) {
        return postRepository.findByTitleOrderByTimeCreatedAsc(title);
    }

    public List<Post> findPostsByTitleOrderByTimeCreatedDesc(String title) {
        return postRepository.findByTitleOrderByTimeCreatedDesc(title);
    }

    public List<Post> findPostsByUserIdAndTitleOrderByTimeCreatedAsc(Long userId, String title) {
        return postRepository.findByUserIdAndTitleOrderByTimeCreatedAsc(userId, title);
    }

    public List<Post> findPostsByUserIdAndTitleOrderByTimeCreatedDesc(Long userId, String title) {
        return postRepository.findByUserIdAndTitleOrderByTimeCreatedDesc(userId, title);
    }
}
