package org.javaConfigDemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Customer {

    public Customer() {
        System.out.println("default constructor called of Customer");
    }

    @PostConstruct
    public void customInit() {
        System.out.println("custom init inside Customer");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("custom destroy...");
    }
}
