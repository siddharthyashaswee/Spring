# Spring
Covers Spring 5 Core, AOP, Spring MVC, Spring Security, Spring REST, Spring Boot 2, Thymeleaf, JPA &amp; Hibernate


## Config
- jdk 1.8
- tomcat 9
- eclipse editor used with tomcat
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
    * destroy-method in case the scope of the bean is prototype.

### spring_demo_annotations

Use the lib folder from the spring_demo_one in eclipse in build path. In this project, Spring configuration with Java Annotations is covered.

* When the config file used is applicationContext.xml:
    * constructor, setter, method, field injection demo.
    * @Autowired, @Qualifier annotations for all above mentioned variants.
    * use of a .properties to file to inject values to class attributes.

* When using the config file beanScope-applicationContext.xml:
    * scope of beans, singleton and prototype.
    * init- and destroy-method of the singleton bean.
    * destroy-method in case the scope of the bean is prototype.


