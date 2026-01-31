# Spring
Covers Spring 5 Core, AOP, Spring MVC, Spring Security, Spring REST, Spring Boot 2, Thymeleaf, JPA &amp; Hibernate


## Config
- jdk 1.8
- tomcat 9
- eclipse editor used with tomcat, set compliance to java 1.8
- Spring 5.3.9

## Chronological order of folder commit:

### spring_demo_one

Create a lib folder in spring_demo_one and then copy jars from the lib folder of the Spring framework library into this new lib folder. In this project, XML file is used for setting up the Spring configuration.

* When the config file used is applicationContext.xml:
    * constructor and setter injection demo
    * use of a .properties to file to inject values to class attributes.

* When using the config file beanScope-applicationContext.xml:
    * scope of beans, singleton and prototype.
    * init- and destroy-method of the singleton bean.
    * destroy-method in case the scope of the bean is prototype with MyCustomBeanProcessor.

### spring_demo_annotations

Use the lib folder from the spring_demo_one in eclipse in build path/libraries. In this project, Spring configuration with Java Annotations is covered.

* When the config file used is applicationContext.xml:
	* Beans are created using the @Component scanning method.
    * constructor, setter, method, field injection demo.
    * @Component, @Autowired, @Qualifier, @Value annotations used in above mentioned variants.
    * use of a .properties to file to inject values to class attributes.

* Lifecycle scope of beans is demonstrated with annotations itself. 
	* Config file is still applicationContext.xml (since annotations take care of scope)
	* See @Scope annotation in the class TennisCoach.java.
    * scope of beans, singleton and prototype.
    * @PostConstruct and @PreDestroy (similar to init- and destroy-method in XML) of the singleton bean.
    * destroy-method in case the scope of the bean is prototype with MyCustomBeanProcessor.
	
* Pure java config (no XML) is demonstrated in SportConfig.java:
	* Here @Component scanning is done. Main app: AnnotationJavaConfigApp.java
	* A simple TennisCoach.java instance demonstrates this method.
	* Additionally reading properties from a file is shown with SwimCoachProperties.java
	
* Pure java config (no XML) with NO @Component scanning is demonstrated in SportConfigNoComponentScan.java:
	* SwimCoach.java demonstrates this above method. Main App: AnnotationJavaConfigNoComponentScanApp.java
	* Pure Java classes can be wrapped into a bean in a spring application using this.

### spring_demo_mvc
Three extra JARs are required: commons-logging-1.2.jar, javax.servlet.jsp.jstl-1.2.1.jar, javax.servlet.jsp.jstl-api-1.2.1.jar. Put these inside lib folder inside WEB-INF. Additionally also put all jars from the Spring framework into /WEB-INF/lib otherwise it will not work.

In this project, Spring configuration with MVC webapp is covered. 

* config present in /WEB-INF/web.xml and /WEB-INF/spring-mvc-demo-servlet.xml
	* web.xml has config for the Spring MVC DispatcherServlet.
	* spring-mvc-demo-servlet.xml defines component-scan and properties for views.
	* access static resources(images, css, JavaScript files etc.), see WebContent/resources/ and config in spring-mvc-demo-servlet.xml mvc:resources.
	* deployment as a WAR in tomcat, see README_WAR_deployment.txt.

* The following topics have been covered in HelloWorldController:
	* @Controller and @RequestMapping to handle requests, main Controller is HomeController.
	* Basic JSP form with a GET request to say hello (/processForm) in HelloWorldController.
	* Basic JSP form which gets its params from the model (/processFormVersionTwo) in HelloWorldController.
	
	
	






