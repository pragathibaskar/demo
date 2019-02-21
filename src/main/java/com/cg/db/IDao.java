package com.cg.db;

import java.util.List;

import com.cg.student.Student;

public interface IDao {
	List<Student> getAll();
	Student insert(Student s);

}
