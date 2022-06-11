package org.proxyAOPdemo;

public class CustomerServiceProxy extends CustomerService {

    @Override
    public void doSomething() {
        LoggerAspect loggerAspect = new LoggerAspect();
        loggerAspect.logBefore();

        super.doSomething();

        loggerAspect.logAfter();
    }
}
