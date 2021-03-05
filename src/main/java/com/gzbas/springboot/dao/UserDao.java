package com.gzbas.springboot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gzbas.springboot.vo.User;

/**
 * 数据访问层
 * @author Administrator
 *
 */


@Repository
public class UserDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Integer add(User user) {
		boolean flag = false;
		String sqlstr = "SELECT * FROM user WHERE userName = ?  and isdele = 0";
		List<User> userList=(List<User>) this.jdbcTemplate.query(sqlstr,userMap(), user.getUserName());
		if (userList != null && userList.size()>0) {
			return 0;
		}
		int result = 0;
		String sql = "INSERT INTO user(uid,userName,userPwd,crea_time,upda_time,crea_user,upda_user,isdele) VALUES(null,?,?,now(),now(),?,?,0)";
		result= this.jdbcTemplate.update(sql,user.getUserName(),user.getUserPwd(),user.getUserName(),user.getUserName());
		if (result == 0) {
			throw new RuntimeException("注册失败......");
		}
		return result;
	}
	
	public User getById(Integer id) {
		String sql = "SELECT * FROM user WHERE id = ?";
		return this.jdbcTemplate.queryForObject(sql, userMap(),id);
		
	}
	
	public List<User> get(){
		String sql = "SELECT * FROM user";
		return this.jdbcTemplate.query(sql, userMap());
	}
	
	//查询用户表信息
	public List<User> queryUser(User user){
		String sql = "SELECT * FROM user WHERE userName = ? and userPwd = ? and isdele = 0";
		return this.jdbcTemplate.query(sql, userMap(),user.getUserName(),user.getUserPwd());
	}
	
	private RowMapper<User> userMap() {
	return	new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs,int rowNull) throws SQLException{
				User user = new User();
				user.setUid(rs.getInt("uid"));
				user.setUserName(rs.getString("userName"));
				user.setUserPwd(rs.getString("userPwd"));
				user.setCrea_time(rs.getString("crea_time"));
				user.setCrea_user(rs.getString("crea_user"));
				user.setUpda_user(rs.getString("upda_user"));
				user.setUpda_time(rs.getString("upda_time"));
				user.setIsdele(rs.getString("isdele"));
				return user;
			}
		};
	}
	
	
}
