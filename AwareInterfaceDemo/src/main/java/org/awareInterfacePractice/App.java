package org.awareInterfacePractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        String fname = context.getBean("cust", Customer.class).getFirstName();
        System.out.println("inside main fname is: " + fname);
    }
}
