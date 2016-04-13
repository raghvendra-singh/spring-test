package com.test;

import com.example.Employee;
import com.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Employee employee = (Employee) context.getBean("emp");
        employee.showEmployeeDetails();
    }
}
