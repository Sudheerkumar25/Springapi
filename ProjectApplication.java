package com.example.demo;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class ProjectApplication {
	@GetMapping("/datetime")
	public String getMapping(){
		Date date = new Date();
	    String strDateFormat = "yyyy/MM/dd HH:mm:ss";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    String formattedDate= dateFormat.format(date);
	    
	    return "Present  time of the day using Date - 12 hour format: " + formattedDate;
	    
		
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
