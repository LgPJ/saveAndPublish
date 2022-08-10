package com.siif;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.siif.configuration.JobrunrConfig;
import com.siif.service.JobrunrService;

@SpringBootApplication
@Import(JobrunrConfig.class)
public class SaveAndPublishApplication {

	@Autowired
	JobrunrService jobrunrService;
	
	public static void main(String[] args) {
		SpringApplication.run(SaveAndPublishApplication.class, args);
	}
	
	@PostConstruct
	public void run() {
		jobrunrService.execute();
	}

}
