package com.cg.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.cg.student.Student;
@Repository
public class DaoImpl implements IDao{
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Student> getAll() {
		return mongoTemplate.findAll(Student.class);
	}

	@Override
	public Student insert(Student s) {
		mongoTemplate.save(s);
		return s;
	}

}
