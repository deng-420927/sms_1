package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.School;

public interface SchoolDao {
	
	//选择全部
	List<School> selectAll();
	//插入
	void insert(School school);
	//更新
	void update(School school);
	//通过ID删除
	void deleteById(long id);
}
