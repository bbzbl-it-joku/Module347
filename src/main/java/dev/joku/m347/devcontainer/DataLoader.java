package dev.joku.m347.devcontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import dev.joku.m347.devcontainer.model.Post;
import dev.joku.m347.devcontainer.model.Users;
import dev.joku.m347.devcontainer.repository.PostRepository;
import dev.joku.m347.devcontainer.repository.UserRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if users data is already present
        if (userRepository.count() == 0) {
            // Load user data if it doesn't exist
            userRepository.save(new Users(1L, "JOSH"));
            userRepository.save(new Users(2L, "SETH"));
            userRepository.save(new Users(3L, "SIMON"));
            userRepository.save(new Users(4L, "DAVE"));
        }

        // Check if posts data is already present
        if (postRepository.count() == 0) {
            // Load post data if it doesn't exist
            postRepository.save(new Post(1L, "Exploring the Benefits of Microservices", "This article discusses how microservices architecture can improve scalability and agility in software development.", userRepository.findById(1L).get(), Timestamp.valueOf("2024-04-20 08:00:00")));
            postRepository.save(new Post(2L, "Getting Started with Kubernetes", "An introduction to Kubernetes, including key concepts and steps to deploy your first application.", userRepository.findById(2L).get(), Timestamp.valueOf("2024-04-20 09:00:00")));
            postRepository.save(new Post(3L, "Best Practices for REST API Design", "Learn how to design robust and efficient REST APIs for your web applications.", userRepository.findById(3L).get(), Timestamp.valueOf("2024-04-20 10:00:00")));
            postRepository.save(new Post(4L, "An Overview of DevOps", "Discover the principles of DevOps and how it can streamline your development and deployment processes.", userRepository.findById(4L).get(), Timestamp.valueOf("2024-04-20 11:00:00")));
            postRepository.save(new Post(5L, "The Future of Artificial Intelligence", "This post explores current trends and potential future applications of artificial intelligence in various industries.", userRepository.findById(1L).get(), Timestamp.valueOf("2024-04-20 12:00:00")));
            postRepository.save(new Post(6L, "Introduction to Blockchain Technology", "An overview of blockchain technology and its use cases beyond cryptocurrencies.", userRepository.findById(2L).get(), Timestamp.valueOf("2024-04-20 13:00:00")));
            postRepository.save(new Post(7L, "Cloud Computing: Trends and Challenges", "An in-depth look at the latest trends in cloud computing and the challenges faced by the industry.", userRepository.findById(3L).get(), Timestamp.valueOf("2024-04-20 14:00:00")));
            postRepository.save(new Post(8L, "The Role of Cybersecurity in Modern IT", "An analysis of the importance of cybersecurity in today's technology landscape and best practices for securing your systems.", userRepository.findById(4L).get(), Timestamp.valueOf("2024-04-20 15:00:00")));
            postRepository.save(new Post(9L, "Machine Learning Basics", "This post introduces the fundamental concepts of machine learning and its applications in various domains.", userRepository.findById(1L).get(), Timestamp.valueOf("2024-04-20 16:00:00")));
            postRepository.save(new Post(10L, "Data Science with Python", "An overview of data science techniques and tools using Python, including data cleaning, analysis, and visualization.", userRepository.findById(2L).get(), Timestamp.valueOf("2024-04-20 17:00:00")));
            postRepository.save(new Post(11L, "Understanding Continuous Integration and Deployment", "This post explains the concepts of CI/CD and how they can improve the software development process.", userRepository.findById(3L).get(), Timestamp.valueOf("2024-04-20 18:00:00")));
            postRepository.save(new Post(12L, "Virtual Reality: The Next Frontier", "An exploration of virtual reality technology, its applications, and the potential it holds for the future.", userRepository.findById(4L).get(), Timestamp.valueOf("2024-04-20 19:00:00")));
            postRepository.save(new Post(13L, "Introduction to Agile Methodology", "Learn the principles of agile methodology and how they can help your team work more efficiently.", userRepository.findById(1L).get(), Timestamp.valueOf("2024-04-20 20:00:00")));
            postRepository.save(new Post(14L, "Getting Started with Docker", "A beginner's guide to Docker, including installation, usage, and benefits for software development.", userRepository.findById(2L).get(), Timestamp.valueOf("2024-04-20 21:00:00")));
            postRepository.save(new Post(15L, "Introduction to GraphQL", "This article explains the basics of GraphQL and how it differs from RESTful APIs.", userRepository.findById(3L).get(), Timestamp.valueOf("2024-04-20 22:00:00")));
            postRepository.save(new Post(16L, "The Internet of Things: Opportunities and Challenges", "An overview of IoT technology and its impact on various industries, as well as potential challenges.", userRepository.findById(4L).get(), Timestamp.valueOf("2024-04-20 23:00:00")));
        
        }
    }
}
