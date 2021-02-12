package br.com.springbootbasics.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Create by Sanderson for Spring Boot Basics
 * Responsible for started the servlet Container as have configuration the dependencies.
 */
@EnableAutoConfiguration
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class,args);
    }
}
