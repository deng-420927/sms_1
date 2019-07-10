package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.College;

public interface CollegeDao {
	List<College> selectAll();
	void insert(College college);
	void update(College college);
}
