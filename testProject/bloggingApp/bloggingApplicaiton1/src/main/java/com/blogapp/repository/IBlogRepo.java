package com.blogapp.repository;

import com.blogapp.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepo extends JpaRepository<Blog, Long> {
}
