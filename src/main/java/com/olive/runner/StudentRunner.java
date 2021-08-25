package com.olive.runner;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.olive.model.Student;
import com.olive.repo.StudentRepositiory;
//@Component
public class StudentRunner implements CommandLineRunner {
    @Autowired
	private StudentRepositiory repo;
    
    @Override
    public void run(String... args) throws Exception {
    	      repo.saveAll(Arrays.asList(
    			new Student(10, "AA", 10.0, "HYD"),
    			new Student(20, "BBB", 0.0, "Hyd"),
    			new Student(30, "CCC", 20.0, "HYD"),
    			new Student(5, "MMM", 20.0, "HYD"),
    			new Student(40, "DDD", 30.0, "HYD"),
    			new Student(50, "EEE", 40.0, "HYD"),
    			new Student(60, "FFF", 50.0, "HYD")
    			));
    	    //  Sort s1 = Sort.by("name");//default order asc
    	   //   Sort s1 = Sort.by(Direction.DESC,"name","sal");
    	        Sort s1 = Sort.by(Order.asc("name"),Order.desc("sal"));
    	        repo.findAll(s1).forEach(System.out::println);
    	              
    }
    
}