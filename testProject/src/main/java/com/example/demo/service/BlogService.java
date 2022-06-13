package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.repository.IBlogRepo;
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
