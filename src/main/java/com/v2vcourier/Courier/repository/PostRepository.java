package com.v2vcourier.Courier.repository;

import com.v2vcourier.Courier.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
