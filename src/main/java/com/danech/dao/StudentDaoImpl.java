package com.danech.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Component;

import com.danech.model.Student;

@Component
public class StudentDaoImpl implements IStudentDao {
	@Resource(name="rt")
	private HashOperations<String, Integer, Student> hash;
	private static final String HASH = "Student";
	@Override
	public void save(Student student) {
		hash.putIfAbsent(HASH, student.getStdId(), student);
	}
	@Override
	public Map<Integer, Student> getAll() {
		return hash.entries(HASH);
	}
	@Override
	public Long remove(Integer id) {
		return hash.delete(HASH, id);
	}
}
