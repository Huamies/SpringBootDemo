package com.gzbas.springboot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gzbas.springboot.dao.UserDao;
import com.gzbas.springboot.vo.User;

/**
 * 
 * 
 * @author Administrator
 *
 */

@Service
public class UserService {

	@Resource
	private UserDao userDao;
	
	public Integer add(User user) {
		return userDao.add(user);
	}
	
	public User getById(Integer id) {
		return userDao.getById(id);
	}
	
	public List<User> get(){
		return userDao.get();
	}
	
	//查询用户表信息
	public List<User> queryUser(User user){
		return userDao.queryUser(user);
	}
	
}
