package org.proxyAOPdemo;

public class LoggerAspect {
    public void logBefore(){
        System.out.println("logging before method being executed");
    }

    public void logAfter() {
        System.out.println("logging after method execution");
    }
}
