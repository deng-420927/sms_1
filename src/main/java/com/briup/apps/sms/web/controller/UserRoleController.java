package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.UserRole;
import com.briup.apps.sms.service.UserRoleService;

@RestController
@RequestMapping("/userrole")
public class UserRoleController {
	@Autowired
	private UserRoleService userRoleService;
	
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(UserRole userRole)
	{
		try {
			userRoleService.saveOrUpdate(userRole);
			return "更新成功";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "更新失败";
		}
	}
	@GetMapping("selectAll")
	public List<UserRole> selectAll()
	{
		return userRoleService.selectAll();
	}
	@GetMapping("deleteById")
	public String deleteById(long id)
	{
		try {
			userRoleService.deleteById(id);
			return "删除成功";
		}catch(Exception e)
		{
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
