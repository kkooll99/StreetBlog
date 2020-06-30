package com.streetblog.blog.repo;

import com.streetblog.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository <Post, Long> {
    
}
