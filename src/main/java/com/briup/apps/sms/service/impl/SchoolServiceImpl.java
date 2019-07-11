package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.dao.SchoolDao;
import com.briup.apps.sms.service.SchoolService;
/*
 * 校园管理逻辑处理实现类
 * */
@Service
public class SchoolServiceImpl implements SchoolService{
	
	//依赖注入，实例化，赋值
	@Resource
	private SchoolDao schoolDao;

	@Override
	public List<School> selectAll() {
		// TODO Auto-generated method stub
		return schoolDao.selectAll();
	
	}

	@Override
	public void saveOrUpdate(School school) throws Exception {
		 if(school.getId()== null) {
		 schoolDao.insert(school);}
		 else {
		 schoolDao.update(school);}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		schoolDao.deleteById(id);
		
	}
	
}
