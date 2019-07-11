package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Clazz;

public interface ClazzDao {
	List<Clazz> selectAll();
	void insert(Clazz clazz);
	void update(Clazz clazz);
	void deleteById(long id);
}
