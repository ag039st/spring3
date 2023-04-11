package com.apress.myblog.services;

import com.apress.myblog.domain.Post;

import java.util.Set;

public interface PostService {
    boolean postExistsWithTitle(String title);
    void addPost(Post post);
    Set<Post> findAllPosts();
}
