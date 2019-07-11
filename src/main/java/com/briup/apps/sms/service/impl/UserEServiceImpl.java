package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.briup.apps.sms.bean.UserE;
import com.briup.apps.sms.dao.UserEDao;
import com.briup.apps.sms.service.UserEService;

@Service
public class UserEServiceImpl implements UserEService{
	
	@Resource
	private UserEDao userEDao;

	@Override
	public List<UserE> selectAll() {
		// TODO Auto-generated method stub
		return userEDao.selectAll();
	}





}
