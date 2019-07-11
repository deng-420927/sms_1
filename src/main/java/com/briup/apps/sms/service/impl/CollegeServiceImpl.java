package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.College;
import com.briup.apps.sms.dao.CollegeDao;
import com.briup.apps.sms.service.CollegeService;
@Service
public class CollegeServiceImpl implements CollegeService {
	@Resource
	private CollegeDao collegeDao;
	@Override
	public List<College> selectAll() {
		// TODO Auto-generated method stub
		return collegeDao.selectAll();
	}

	@Override
	public void saveOrUpdate(College college) throws Exception {
		// TODO Auto-generated method stub
		if(college.getId() == null)
		{
			collegeDao.insert(college);
		}
		else
		{
			collegeDao.update(college);
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		collegeDao.deleteById(id);
	}
}
