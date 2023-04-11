package com.apress.myblog.services;

import com.apress.myblog.domain.Post;
import com.apress.myblog.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public boolean postExistsWithTitle(String title) {
        return postRepository.findAll().stream().anyMatch(post -> post.getTitle().equals(title));
    }

    @Override
    public void addPost(Post post) {
      postRepository.addPost(post);
    }

    @Override
    public Set<Post> findAllPosts() {
        return postRepository.findAll();
    }
}
