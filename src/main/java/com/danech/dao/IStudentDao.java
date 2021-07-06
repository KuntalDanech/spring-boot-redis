package com.danech.dao;

import java.util.Map;

import com.danech.model.Student;

public interface IStudentDao {
	public void save(Student student);
	public Map<Integer, Student> getAll();
	public Long remove(Integer id);
}
