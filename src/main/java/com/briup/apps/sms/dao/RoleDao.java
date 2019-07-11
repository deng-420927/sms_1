package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Role;

public interface RoleDao {
	List<Role> selectAll();
	void insert(Role role);
	void update(Role role);
	void deletById(long Id);

	
	}
