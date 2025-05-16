package com.example.Spring;

import com.example.Spring.applicationContext.AppConfig;
import com.example.Spring.beanFactoryTut.Student;
import com.example.Spring.dependencyInjection.Vehicle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.Spring.Annotations.Autowired.Mobile;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.example.Spring")
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

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringTutorialsApplication.class);
		Mobile mobile = context.getBean(Mobile.class);
		mobile.show();



	}
}
