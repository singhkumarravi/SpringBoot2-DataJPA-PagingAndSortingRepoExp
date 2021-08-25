package com.olive.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.olive.model.Student;

public interface StudentRepositiory extends PagingAndSortingRepository<Student, Integer>{

}
