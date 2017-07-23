package com.huashuwa.jiang.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huashuwa.common.utils.Log4jUtil;
import com.huashuwa.common.utils.UUIDUtil;
import com.huashuwa.jiang.base.BaseController;
import com.huashuwa.jiang.exception.HswRuntimeException;
import com.huashuwa.jiang.model.Members;
import com.huashuwa.jiang.model.User;
import com.huashuwa.jiang.service.TestService;
import com.huashuwa.jiang.service.impl.TestServiceImpl;

@Controller
public class TestController extends BaseController {
	
	// 实例化Log4j工具类对象
	Log4jUtil log = new Log4jUtil(TestController.class);
	
	@Resource(name = "testService")
	private TestService testService;
	
	/**
	 * index首页
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response){
		return "index";
	}
	
	@RequestMapping("/getUserById")
	@ResponseBody
	public User getUserById(User u, Members m, HttpServletRequest request, HttpServletResponse response){
		System.out.println(u);
		System.out.println(m);
		User user=testService.getUserById(u.getUserId());
		return user;
	}
	
	@RequestMapping("/getMemberByName")
	@ResponseBody
	public Members getMemberByName(Members m, HttpServletRequest request, HttpServletResponse response){
		Members members=testService.getMemberByName(m.getName());
		Logger logger = Logger.getLogger("instanceLogger");
		logger.info("info ");
		logger.error("error");
		logger.warn("warn");
		logger.debug("debug");
		log.selectLogs("查询用户", "me");
		return members;
	}
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public int insertUser(HttpServletRequest request, HttpServletResponse response){
		User user=new User(UUIDUtil.getUUID(),"小强","xiaoqiang","123",new Date(),new Date(),"male","18612341234","xiaoqiang@163.com",true,"beijing");
		int result=testService.insertUser(user);
		return result;
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public int updateUser(User user, HttpServletRequest request, HttpServletResponse response){
		int result=testService.updateUser(user);
		return result;
	}
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public int deleteUser(User user, HttpServletRequest request, HttpServletResponse response){
		int result=testService.deleteUser(user);
		return result;
	}
	
	@RequestMapping("/affairUpdate")
	@ResponseBody
	public Boolean affairUpdate(String userId1, String userId2, HttpServletRequest request, HttpServletResponse response){
		Boolean result=testService.affairUpdate(userId1, userId2);
		return result;
	}
	
}
