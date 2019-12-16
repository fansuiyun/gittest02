package com.it.test;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GitApp {

    public static void main(String[] args) {
    		new SpringApplicationBuilder(GitApp.class).web(true).build().run();
    }

}
