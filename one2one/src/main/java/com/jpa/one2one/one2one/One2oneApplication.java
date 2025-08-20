package com.jpa.one2one.one2one;

import com.jpa.one2one.one2one.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class One2oneApplication implements CommandLineRunner {

    @Autowired
    AppService appService;

    public static void main(String[] args) {
        SpringApplication.run(One2oneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       appService.saveData();
         //appService.fetchStudent1Record();

    }
}
