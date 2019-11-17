package com.record;

import com.record.entity.User;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserBaseApplication.class, args);
    }
}
