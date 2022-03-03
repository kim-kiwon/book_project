package com.book.springboot.web.Repository;

import com.book.springboot.web.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
