package com.pack.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	System.out.println("**********************");
    	Emp emp=context.getBean("emp",Emp.class);
    	emp.empInfo();
    	
    	Student student = context.getBean("student",Student.class);
    	student.StudentInfo();
    }
}
