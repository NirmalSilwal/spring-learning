package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    private static EntityManagerFactory myfactory;

    public static void main(String[] args) {
        myfactory = Persistence.createEntityManagerFactory("nirmalsilwal");
        EntityManager manager = myfactory.createEntityManager();

        manager.getTransaction().begin();

        User my_user = new User("prabash", 100, 28);

        manager.persist(my_user);
        manager.getTransaction().commit();

        manager.close();


    }
}
