package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/save")
    public Map<String, String> saveBlog(@RequestBody Blog blog){
        blogService.saveBlog(blog);
        Map<String, String> map = new HashMap<>();
        map.put(blog.getTitle(), blog.getDescription());
        return map;
    }
}
