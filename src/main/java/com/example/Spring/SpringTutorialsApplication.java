package com.example.Spring;

import com.example.Spring.Annotations.ContextConfiguration.Configuration.Property;
//import com.example.Spring.Annotations.DependencyInjection.Autowired.UnsatisfiedDependencyProblem.Invoice;
//import com.example.Spring.Annotations.DependencyInjection.Autowired.UnsatisfiedDependencyProblem.Iphone;
import com.example.Spring.Annotations.DependencyInjection.Autowired.UnsatisfiedDependencyProblem.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@ComponentScan(basePackages = "com.example.Spring")
@EnableAsync
public class SpringTutorialsApplication {
	public static void main(String[] args) {

		//load content from bean factory.
//		BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
//		Student student = (Student) factory.getBean("student");
//
//		System.out.println(student);

		//Application context
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Student student = context.getBean(Student.class);
//
//		System.out.println(student);

		//Constructor dependency injection
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
////		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
////		vehicle.info();
//
//		//setter and constructor both
//		Mobile mobile = (Mobile) context.getBean("mobileCDI");
//		mobile.show();

		//ApplicationContext context = new AnnotationConfigApplicationContext(SpringTutorialsApplication.class);


//		Mobile mobile = context.getBean(Mobile.class);
//		mobile.show();
		//bean and value
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//
//		MyService myservice = context.getBean(MyService.class);
//		myservice.myService();
//		myservice.printService();

		//Lazy.
//		ApplicationContext context2 = new AnnotationConfigApplicationContext(SpringTutorialsApplication.class);
//		HeavyService service = context2.getBean(HeavyService.class);
//		service.doSomething();
//		// scope -> singleton and prototype
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringTutorialsApplication.class);
//
//		Book b1 = context.getBean(Book.class);
//		Book b2 = context.getBean(Book.class);
//
//		System.out.println(b1 == b2);

		//this is configuration
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringTutorialsApplication.class);
//
//		Property property = context.getBean(Property.class);
//		property.getProperty();


		//Run spring Server
		 ApplicationContext context = SpringApplication.run(SpringTutorialsApplication.class,args);

//		Invoice invoice = context.getBean(Invoice.class);
//		Iphone iphone = context.getBean(Iphone.class);
//		iphone.getPhone();
//		invoice.printPhone();



	}
}
