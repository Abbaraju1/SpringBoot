package io.aditya.sprintbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//This is the statuc method which tells the springboot application that this 
		// is the class which has main method
		// args variable is just a pass through where we pass args if necessary through 
		//the main method.
		//Spring boot has a inbuilt tomcat server
		
		SpringApplication.run(CourseApiApp.class, args); 
		
		/* What the above line does is
		 * 
		 * -Sets up default configuration - spring does convention over configuration means 
		spring does 80 % of configuration and lets you do 20%
		
		-starts spring application context ( applicationcontext - business layer, services
		layer - spring acts as a container ) every spring has this
		
		-performs class path scan - scans for all the annotation like this is a service, this 
		is a controller etc
		
		-starts tomcat server*/
		
	}

}
