package com.v2vcourier.Courier.security;

import com.v2vcourier.Courier.dto.PostDto;
import com.v2vcourier.Courier.exception.PostNotFoundException;
import com.v2vcourier.Courier.model.Post;
import com.v2vcourier.Courier.repository.PostRepository;
import com.v2vcourier.Courier.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class PostService {

    @Autowired
    private AuthService authService;
    @Autowired
    private PostRepository postRepository;

    @Transactional
    public List<PostDto> showAllPosts()
    {
        List<Post> posts=postRepository.findAll();
        return posts.stream().map(this::mapFromPostToDto).collect(toList());
    }

    @Transactional
    public void createPost(PostDto postDto)
    {
        Post post=mapFromDtoToPost(postDto);
        postRepository.save(post);
    }

    private PostDto mapFromPostToDto(Post post)
    {
        PostDto postDto=new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        postDto.setUsername(post.getUsername());
        return postDto;

    }

    private Post mapFromDtoToPost(PostDto postDto)
    {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        User loggedInUser=authService.getCurrentUser().orElseThrow(()->new IllegalArgumentException("User Not Found"));
        post.setUpdatedOn(Instant.now());
        post.setUsername(loggedInUser.getUsername());
        return post;
    }

    @Transactional
    public PostDto readSinglePost(Long id)
    {
        Post post=postRepository.findById(id).orElseThrow(()->new PostNotFoundException("For id"+id));
        return mapFromPostToDto(post);
    }
}
