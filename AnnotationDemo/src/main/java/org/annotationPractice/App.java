package org.annotationPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // using java config file
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        SMSService obj =  context.getBean("mybean",SMSService.class);

//        obj.sendMessage("miu@edu.com", "Hello");

        // using xml configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("springannotation.xml");
        SMSService obj = context.getBean("mybean", SMSService.class);

        obj.sendMessage("miu@edu.com", "Hello");
    }
}
