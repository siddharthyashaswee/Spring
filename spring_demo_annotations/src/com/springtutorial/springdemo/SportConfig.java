package com.springtutorial.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Setup with pure java config for spring beans
 * Analogous to applicationContext.xml
 * In this case easy setup with @Component scan is used
 * also reads properties from a file: coach.properties
 */
@Configuration //marker that this is a configuration file
@ComponentScan("com.springtutorial.springdemo")//similar to component scan in XML
// @ComponentScan is optional, can also define beans with @Bean, see SportConfigNoComponentScan.java
@PropertySource("classpath:coach.properties") //can inject properties as such, not used here
public class SportConfig {

}
