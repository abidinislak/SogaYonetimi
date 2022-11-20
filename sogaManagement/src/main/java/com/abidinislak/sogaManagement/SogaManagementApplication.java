package com.abidinislak.sogaManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@Configuration
@EnableJpaRepositories
@ComponentScan
public class SogaManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SogaManagementApplication.class, args);
    }

}
