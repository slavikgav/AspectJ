package com.aspectexample.startup;

import com.aspectexample.codder.Codder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AspectExample.xml");

		Codder codder = (Codder) appContext.getBean("coder");

		codder.createRepository("AspectJ");
		codder.getLastRepository();
		codder.createRepositoryAround("AspectJ");

		//codder.throwRepositoryExist();
	
	}
}