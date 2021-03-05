package com.gzbas.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 控制器测试
 * 
 * @author Administrator
 *
 */
@RestController
@Controller
public class HelloController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@ResponseBody
	@GetMapping("/query")
	public Map<String,Object> map(){
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM user");
		return list.get(0);
	}
	
}
