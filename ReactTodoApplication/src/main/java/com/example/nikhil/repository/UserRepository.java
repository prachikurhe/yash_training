package com.example.nikhil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.nikhil.entities.User;


@Repository
public interface UserRepository   extends JpaRepository<User, Integer> {
   
	  @Query("select u from User u where u.age>:age")
	  List<User>   findByAgeGreaterThan(@Param("age")   int age);
	  
	  
	  @Query("select u.name from User u where u.name like :s||'%' ")
	  List<String>   findNamesStratingWith(@Param("s") String s);
	  
	  
}
