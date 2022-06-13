package com.blogapp.service;

import com.blogapp.model.Blog;
import com.blogapp.repository.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    private IBlogRepo iBlogRepo;

    public void saveBlog(Blog blog){
        iBlogRepo.save(blog);
    }
}
