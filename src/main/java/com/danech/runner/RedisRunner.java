package com.danech.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.danech.dao.IStudentDao;
import com.danech.model.Student;

@Component
public class RedisRunner implements CommandLineRunner {

	@Autowired
	private IStudentDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		dao.save(new Student(707, "Kuntal Danech", 450.0));
		dao.save(new Student(708, "Test Danech", 450.0));
		dao.save(new Student(709, "Manil Danech", 450.0));
		dao.save(new Student(706, "Jay Danech", 450.0));
		dao.save(new Student(705, "Alkesh Danech", 450.0));
		
		dao.getAll().forEach((k,v)->System.out.println(k+" : "+v));
		
		dao.remove(708);
		
		System.out.println("Removing 708");
		
		dao.getAll().forEach((k,v)->System.out.println(k+" : "+v));
		
	}
}