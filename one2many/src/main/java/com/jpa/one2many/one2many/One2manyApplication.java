package com.jpa.one2many.one2many;

import com.jpa.one2many.one2many.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class One2manyApplication implements CommandLineRunner {

	@Autowired
	AppService appService;

	public static void main(String[] args) {

		SpringApplication.run(One2manyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		appService.saveData();
	}
}
