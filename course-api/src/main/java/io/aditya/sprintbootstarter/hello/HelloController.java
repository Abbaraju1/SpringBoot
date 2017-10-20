package io.aditya.sprintbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	/*Controller : 
	Java Class marked with annotations and has info about what URL triggers and
	what method to run when accessed*/
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}

}
