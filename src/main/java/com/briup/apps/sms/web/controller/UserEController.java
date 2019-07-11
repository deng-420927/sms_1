package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.briup.apps.sms.bean.UserE;
import com.briup.apps.sms.service.UserEService;

@RestController
@RequestMapping("/usere")
public class UserEController {
	
	@Autowired
	private UserEService userESerrvice;
	
	@GetMapping("selectAll")
	public List<UserE> selectAll()
	{
		return userESerrvice.selectAll();
	}
}
