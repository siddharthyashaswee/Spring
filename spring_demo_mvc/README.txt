Configure the Spring Dispatcher Servlet using all Java Code (no xml)
Question:


For Spring MVC, all Java config (no xml) is also covered later.

1. Delete the files: web.xml file and spring-mvc-demo-servlet.xml files

2. Create a new Java package: com.springtutorial.springdemo.config

3. Add the following Java files in the package

File: DemoAppConfig.java

package com.springtutorial.springdemo.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.springtutorial.springdemo")
public class DemoAppConfig {
 
	// define a bean for ViewResolver
 
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
}
---

File: MySpringMvcDispatcherServletInitializer.java

package com.springtutorial.springdemo.config;
 
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
 
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { DemoAppConfig.class };
	}
 
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
 
}
4. Test the app

