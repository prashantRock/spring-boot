package com;

import com.service.HelloMessageService;
import com.src.Subscription;
import com.src.SubscriptionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {

    @Autowired
    private HelloMessageService helloService;

    static String[] subscriptionList = {"GOLD", "PLATINUM", "SILVER"};
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }



    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}