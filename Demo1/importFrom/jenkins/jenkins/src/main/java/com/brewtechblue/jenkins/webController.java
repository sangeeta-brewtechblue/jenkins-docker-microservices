package com.brewtechblue.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class webController {
	
	 @GetMapping("hello") 
	public String sayHello() {
		return "Hello Jenkins world";
	}
	

}
