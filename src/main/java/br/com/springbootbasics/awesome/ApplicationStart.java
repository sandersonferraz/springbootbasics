package br.com.springbootbasics.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by Sanderson for Spring Boot Basics
 * Responsible for started the servlet Container as have configuration the dependencies.
 */

@SpringBootApplication // The same thing @Configuration - Uses the classes defined as configuration. @ComponentScan - Scans components in the application. @EnableAutoConfiguration - Automatically configure an application according to dependencies.
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class,args);
    }
}
