package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.College;

public interface CollegeDao {
	//查询所有
	List<College> selectAll();
	
	//插入
	void insert(College college);
	
	//更新
	void update(College college);
	
	//通过ID删除
	void deleteById(long id);
}
