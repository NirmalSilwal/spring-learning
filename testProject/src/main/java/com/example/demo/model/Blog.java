package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String category;
    private Date date;
    private String description;
    private String content;
    private UUID user_id;
    private boolean isActive;

    public Blog() {
    }

    public Blog(long id, String title, String category, Date date, String description, String content, UUID user_id, boolean isActive) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.date = date;
        this.description = description;
        this.content = content;
        this.user_id = user_id;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", user_id=" + user_id +
                ", isActive=" + isActive +
                '}';
    }
}
