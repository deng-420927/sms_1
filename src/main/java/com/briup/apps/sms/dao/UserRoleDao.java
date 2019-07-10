package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.UserRole;

public interface UserRoleDao {
	List<UserRole> selectAll();
	void insert(UserRole userRole);
	void update(UserRole userRole);
}
