package org.proxyAOPdemo;

public class FancyBeanFactory {

    public Object getBean(String beanName) {
        if ("customerService".equals(beanName))
            return new CustomerServiceProxy();
        return null;
    }

}
