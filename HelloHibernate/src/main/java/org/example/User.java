package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

   public  String name;
    @Id
     public int id;
    public int age;

    public User() {
    }

    public User(String name, int id, int age) {

        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
