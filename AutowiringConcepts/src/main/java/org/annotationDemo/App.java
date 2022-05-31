package org.annotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
        Employee employee = (Employee) context.getBean("empbean");

        System.out.println(employee);
    }
}
