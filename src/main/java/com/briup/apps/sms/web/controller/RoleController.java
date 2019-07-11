package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@PostMapping
	public String saveOrUpdate(Role role)
	{
		try {
			roleService.saveOrUpdate(role);
			return "更新数据成功";
		}catch(Exception e)
		{
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	@GetMapping("selectAll")
	public List<Role> selectAll()
	{
		return roleService.selectAll();
	}
	

@GetMapping("deleteById")
public String deleteById(long id) {
	try {
		roleService.deleteById(id);
		return"删除成功";
		
	}catch(Exception e) {
		e.printStackTrace();
		return e.getMessage();
	}
}
}

	