package com.lmg.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}
	
	@Autowired
	private BCryptPasswordEncoder passwordEnconder;

	@Override
	public void run(String... args) throws Exception {	
//		System.out.println("BCRYPT = " + passwordEnconder.encode("123456"));
	}

}
