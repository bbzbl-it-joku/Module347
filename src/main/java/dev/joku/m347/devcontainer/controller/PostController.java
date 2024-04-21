package dev.joku.m347.devcontainer.controller;

import dev.joku.m347.devcontainer.model.Post;
import dev.joku.m347.devcontainer.service.PostService;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // Get all posts
    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts(
            @RequestParam(required = false) Long userId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false, defaultValue = "desc") String order) {
        List<Post> posts;
        // Determine which service method to call based on the presence of userId and title
        if (userId != null && title != null) {
            if (order.equalsIgnoreCase("asc")) {
                posts = postService.findPostsByUserIdAndTitleOrderByTimeCreatedAsc(userId, title);
            } else {
                posts = postService.findPostsByUserIdAndTitleOrderByTimeCreatedDesc(userId, title);
            }
        } else if (userId != null) {
            if (order.equalsIgnoreCase("asc")) {
                posts = postService.findPostsByUserIdOrderByTimeCreatedAsc(userId);
            } else {
                posts = postService.findPostsByUserIdOrderByTimeCreatedDesc(userId);
            }
        } else if (title != null) {
            if (order.equalsIgnoreCase("asc")) {
                posts = postService.findPostsByTitleOrderByTimeCreatedAsc(title);
            } else {
                posts = postService.findPostsByTitleOrderByTimeCreatedDesc(title);
            }
        } else {
            if (order.equalsIgnoreCase("asc")) {
                posts = postService.getAllPostsOrderByTimeCreatedAsc();
            } else {
                posts = postService.getAllPostsOrderByTimeCreatedDesc();
            }
        }
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    // Create a new post
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post createdPost = postService.createPost(post);
        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    }

    // Read post by ID
    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        Optional<Post> post = postService.getPostById(id);
        if (post.isPresent()) {
            return new ResponseEntity<>(post.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Update post
    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post post) {
        post.setId(id);
        try {
            Post updatedPost = postService.updatePost(post);
            return new ResponseEntity<>(updatedPost, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete post by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        try {
            postService.deletePost(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
