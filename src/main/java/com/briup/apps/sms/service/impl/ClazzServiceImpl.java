package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.dao.ClazzDao;
import com.briup.apps.sms.service.ClazzService;
@Service
public class ClazzServiceImpl implements ClazzService{

	@Resource
	private ClazzDao clazzDao;
	@Override
	public List<Clazz> selectAll() {
		// TODO Auto-generated method stub
		return clazzDao.selectAll();
	}

	@Override
	public void saveOrUpdate(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		if(clazz.getId() == null)
		{
			clazzDao.insert(clazz);
		}
		else
		{
			clazzDao.update(clazz);
		}
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		clazzDao.deleteById(id);
		
	}
	

	

}
	 
