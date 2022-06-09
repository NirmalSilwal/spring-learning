package org.awareInterfacePractice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
     private String firstName;

    public Customer() {
        System.out.println("customer's default constructor");
    }

    public Customer(String firstName) {
        System.out.println("customer's parameterized constructor with firstname " + firstName);
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("at setter method with firstname " + firstName);
        this.firstName = firstName;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("inside setbeanname... " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("inside setBeanFactory checking isSingleton... " + beanFactory.isSingleton("cust"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("inside setApplicationContext checking isPrototype... " + applicationContext.isPrototype("cust"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet");
        this.firstName = "changed Nirmal in afterPropertiesSet";
    }

    @PostConstruct
    public void customInit() {
        System.out.println("custominit...");
        this.firstName = "changed Nirmal in customInit";
    }
}
