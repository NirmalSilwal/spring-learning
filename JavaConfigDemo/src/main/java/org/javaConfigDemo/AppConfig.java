package org.javaConfigDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// using annotation
@Configuration
@ComponentScan("org.javaConfigDemo")
public class AppConfig {

    // using bean
//    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
//    public Customer customer() {
//        return new Customer();
//    }
}
