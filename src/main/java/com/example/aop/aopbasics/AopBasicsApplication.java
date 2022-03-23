package com.example.aop.aopbasics;

import com.example.aop.aopbasics.business.Business;
import com.example.aop.aopbasics.business.Business2;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 public class AopBasicsApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(AopBasicsApplication.class);
	@Autowired
	Business business;

	@Autowired
	Business2 business2;
	public static void main(String[] args) {
		SpringApplication.run(AopBasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business.calculateSomething());
		logger.info(business2.calculateSomething());
		logger.info("{}","kanishka");
	}
}
