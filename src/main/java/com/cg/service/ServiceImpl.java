package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.db.IDao;
import com.cg.student.Student;
@Service
public class ServiceImpl implements IService {
    @Autowired
    IDao db;
	@Override
	public List<Student> getAll() {
		return db.getAll();
	}

	@Override
	public Student insert(Student s) {
		return db.insert(s);
		
	}

}
