package org.autowiringexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");
//        Employee employee = (Employee) context.getBean("empbean");

        // to avoid type casting you can pass second parameter like below
        Employee employee = context.getBean("empbean", Employee.class);

        System.out.println(employee);
    }
}
