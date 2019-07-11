package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.StudentCourse;
import com.briup.apps.sms.service.StudentCourseService;


@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
	@Autowired
	private StudentCourseService studentcourseService;

	//http://localhost:8080/studentcourse/selectAll
	@PostMapping
	public String saveOrUpdate(StudentCourse studentCourse) {
		try {
			studentcourseService.saveOrUpdate(studentCourse);
			return "保存或更新成功";
		} catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	@GetMapping("selectAll")
	public List<StudentCourse> selectAll(){
		return studentcourseService.selectAll();
		
	}
	
	//http://localhost:8080/studentcourse/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			  studentcourseService.deleteById(id);
			  return "删除成功";
		} catch (Exception e) {
			//打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}
}