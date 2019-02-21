package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.IService;
import com.cg.student.Student;

@RestController
public class Controller {
	@Autowired
	IService service;
   @GetMapping("/get")
  String send()
  {
	return "Hello Docker";
	   
  }
   @PostMapping
   Student receive(@RequestBody Student s)
   {
	   service.insert(s);
	   return s;
   }
}
