package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.User;
import com.briup.apps.sms.dao.UserDao;
import com.briup.apps.sms.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}

	@Override
	public void saveOrUpdate(User user) throws Exception {
		// TODO Auto-generated method stub
		if(user.getId() == null)
		{
			userDao.insert(user);
		}
		else
		{
			userDao.update(user);
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
		
	}


}
