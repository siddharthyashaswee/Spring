package com.springtutorial.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	/**
	 * This method shows how to capture a incoming HTTP request and store its data in the Model.
	 * 
	 * @param request - GET or POST that called this method and holds the data as request params
	 * @param model - Model isn’t a normal Spring “bean” that exists all the time, 
	 * it’s created newly per incoming request and passed into the controller method
	 * Anything put in the model becomes variables the JSP can read.
	 * 
	 * @return JSP file
	 */
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("studentName");
		
		model.addAttribute("message", "Yo! "+studentName.toUpperCase());
		
		//the view now gets server computed data directly from the model
		// its not dependent on the request Params
		return "helloworld";
	}
	

//	@RequestMapping("/processFormVersionThree")
//	public String processFormVersionThree(@RequestParam("studentName") String studentName, Model model) {
//		
//		model.addAttribute("message", "Hey! "+studentName.toUpperCase());
//		return "helloworld";
//	}
}
