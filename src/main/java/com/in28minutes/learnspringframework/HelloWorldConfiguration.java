package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Released in JDK 16, which is a object
record Person (String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Baker Street", "London"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	@Bean
	public Person person2Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
	
	@Bean (name = "address2") // custom Bean name
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
}
