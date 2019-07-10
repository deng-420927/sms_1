package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.StudentCourse;

public interface  StudentCourseDao{

	List<StudentCourse> selectAll();
	void insert(StudentCourse studentCourse);
	void update(StudentCourse studentCourse);
}