package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.StudentCourse;

public interface  StudentCourseDao{
    //查询所有
	List<StudentCourse> selectAll();
	//插入
	void insert(StudentCourse studentCourse);
	//更新
	void update(StudentCourse studentCourse);
	//通过ID删除
	void deleteById(long id);
}