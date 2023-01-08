package com.in28minutes.learnspringframework;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2: Configure the things that we want Spring to manage -@Configuration
		//HellowWorldConfiguraton - @Configuraton
		//name - @Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person2Parameters"));
		
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));
		
		// Java Function Programming
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
	}

}
