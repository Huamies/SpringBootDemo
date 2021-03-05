package com.gzbas.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller ： 可以返回html页面
 * RestController ： 返回json数据
 * 
 * @author Administrator
 *
 */

@Controller
public class DemosController {
	
	ModelAndView mav = new ModelAndView();
	
	//测试页
	@RequestMapping("/page1")
	public ModelAndView page1() {
		 mav = new ModelAndView("page1");
		return mav;
		
	}
	
	//测试页demo
	@RequestMapping("/demo")
	public ModelAndView demo() {
		 mav = new ModelAndView("demo");
		return mav;
		
	}
	
	//主页
	@RequestMapping("/index")
	public ModelAndView index() {
		 mav = new ModelAndView("index");
		return mav;
		
	}
	
	//登录页
	@RequestMapping("/Login")
	public ModelAndView Login() {
		 mav = new ModelAndView("Login");
		return mav;
		
	}
	
	//注册页
	@RequestMapping("/Register")
	public ModelAndView Register() {
		mav = new ModelAndView("Register");
		return mav;
		
	}
}
