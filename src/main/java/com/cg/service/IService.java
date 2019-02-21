package com.cg.service;



import java.util.List;

import com.cg.student.Student;

public interface IService{
	List<Student> getAll();
	Student insert(Student s);

}
