package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.service.ClazzService;

@RestController
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private ClazzService clazzService;
	
	@PostMapping
	public String saveOrUpdate(Clazz clazz)
	{
		try {
			clazzService.saveOrUpdate(clazz);
			return "更新数据成功";
		}catch(Exception e)
		{
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	@GetMapping("selectAll")
	public List<Clazz> selectAll()
	{
		return clazzService.selectAll();
	}
	

@GetMapping("deleteById")
public String deleteById(long id) {
	try {
		clazzService.deleteById(id);
		return"删除成功";
		
	}catch(Exception e) {
		e.printStackTrace();
		return e.getMessage();
	}
}
}