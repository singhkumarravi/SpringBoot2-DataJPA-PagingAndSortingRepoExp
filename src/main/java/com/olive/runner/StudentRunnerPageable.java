package com.olive.runner;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.olive.model.Student;
import com.olive.repo.StudentRepositiory;
@Component
public class StudentRunnerPageable implements CommandLineRunner {
    @Autowired
	private StudentRepositiory repo;
    
    @Override
    public void run(String... args) throws Exception {
    	     repo.save(new Student(10, "WWW", 10.2, "HYD"));
    	     repo.save(new Student(11, "ghc", 10.2, "HYD"));
    	     repo.save(new Student(12, "jkkl", 10.2, "HYD"));
    	     repo.save(new Student(13, "jll", 10.2, "HYD"));
    	     repo.save(new Student(14, "WWW", 10.2, "HYD"));
    	     repo.save(new Student(15, "WWW", 10.2, "HYD"));
    	     repo.save(new Student(16, "AAA", 10.2, "HYD"));
    	     repo.save(new Student(17, "WWW", 10.2, "HYD"));
    	     repo.save(new Student(18, "WWW", 10.2, "HYD"));
    	     repo.save(new Student(19, "XXX", 10.2, "HYD"));
    	     repo.save(new Student(20, "WWW", 10.2, "HYD"));
    	     repo.save(new Student(21, "UUU", 10.2, "HYD"));
    			
    	      PageRequest pageable = PageRequest.of(111, 1);  
    	      Page<Student> page = repo.findAll(pageable);
    	      List<Student> content = page.getContent();
    	     content.forEach(System.out::println);
    	     
    	   //meta data
    	     System.out.println(" Is Empty Page? " +
    	     page.isEmpty());
    	     System.out.println(" Is First Page? " +
    	     page.isFirst());
    	     System.out.println(" Is Last Page? " +page.isLast());
    	     System.out.println(" Next Page? " +page.hasNext());
    	     System.out.println(" Previous Page? "
    	     +page.hasPrevious());
    	     System.out.println(" Total Pages? "
    	     +page.getTotalPages());
    	     System.out.println(" Current Page Number? "
    	     +page.getNumber());
    	     System.out.println(" Page Size? " + page.getSize());
    		                  
    	              
    }
    
}