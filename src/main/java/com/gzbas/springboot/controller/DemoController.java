package com.gzbas.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gzbas.springboot.service.UserService;
import com.gzbas.springboot.vo.User;

/**
 * 
 * 控制器层
 * @author Administrator
 *
 */

@RestController
@Controller
public class DemoController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/add")
	public Integer add(User user) {
		return userService.add(user);
	}
	
	@RequestMapping("/getById")
	public User getById(Integer id) {
		return userService.getById(id);
		
	}
	
	@RequestMapping("/get")
	public List<User> get(){
		return userService.get();
	}
	
	@RequestMapping("/queryUser")
	public List<User> queryUser(User user){
		return userService.queryUser(user);
	}
	
}
