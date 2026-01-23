package com.springtutorial.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //inherits from @Component so included in component scan
public class HomeController {

	@RequestMapping("/") // will handle all requests, basically the main controller
	public String showPage() { //name of the method is irrelevant
		return "main-menu"; //name of the view that will be shown (with suffix ".jsp") 
	}
}
