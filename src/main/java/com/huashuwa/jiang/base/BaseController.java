package com.huashuwa.jiang.base;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.huashuwa.common.utils.Log4jUtil;
import com.huashuwa.common.utils.VerifyHandler;
import com.huashuwa.common.utils.page.model.Page;
import com.huashuwa.common.utils.page.model.PageData;
import com.huashuwa.jiang.exception.ExceptionTypeDefine;
import com.huashuwa.jiang.exception.HswRuntimeException;
import com.huashuwa.jiang.model.User;

/**
 * 类名称：	BaseController  
 * 类描述：	基础controller
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月22日 下午4:18:16  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
public class BaseController {
	// 实例化Log4j工具类对象
	Log4jUtil log = new Log4jUtil(BaseController.class);
	
	/**
	 * 
	 * getRequest(得到request对象)  
	 * @return  		HttpServletRequest  Http请求对象 
	 * @throws 			HswRuntimeException UBS运行时期异常  
	 * @since  1.0.0
	 */
	public HttpServletRequest getRequest() throws HswRuntimeException {
		try{
			return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}catch (HswRuntimeException e) {
			log.errorLogsMsg(e, this.getClass() + "获取HttpServletRequest时发生异常", null);
			throw new HswRuntimeException(ExceptionTypeDefine.JAVA_CLASS_CASH, e);
		}
	}
		
	/**
	 *
	 * getPageData(获取页面上的分页查询参数)
	 * @return          getPageData         封装好的分页查询参数对象
	 * @throws 			HswRuntimeException UBS运行时期异常  
	 * @since  1.0.0
	 */
	public PageData getPageData() throws HswRuntimeException {
		try{
			return new PageData(this.getRequest());
		}catch (HswRuntimeException e) {
			log.errorLogsMsg(e, this.getClass() + "获取PageData时发生异常", null);
			throw new HswRuntimeException(ExceptionTypeDefine.JAVA_PAGEDATA_VALID, e);
		}
	}
	
	/**
	 *
	 * getPage(将分页查询参数放到page里)
	 * @return          Page          		分页对象
	 * @throws 			HswRuntimeException UBS运行时期异常  
	 * @since  1.0.0
	 */
	public Page getPage() throws HswRuntimeException {
		try{
			Page page = new Page();
			// 获取前台参数，传到page中
			page.setPd(this.getPageData());
			// 设置页面显示最大条数
			page.setLimit(Integer.parseInt((String) this.getPageData().get("limit")));
			// 设置页面显示的起始页
			page.setStart(Integer.parseInt((String) this.getPageData().get("page")));
			return page;
		}catch (HswRuntimeException e) {
			log.errorLogsMsg(e, this.getClass() + "发生未知异常", null);
			throw new HswRuntimeException(ExceptionTypeDefine.UBS_OTHER_ERROR, e);
		}
	}
	
	/**
	 * 
	 * getSession(获取Session)  
	 * @return  		HttpSession   		返回Session
	 * @throws 			HswRuntimeException UBS运行时期异常   
	 * @since  1.0.0
	 */
	public HttpSession getSession() throws HswRuntimeException {
		try{
			return this.getRequest().getSession();
		}catch (HswRuntimeException e) {
			log.errorLogsMsg(e, this.getClass() + "获取HttpSession发生未知异常", null);
			throw new HswRuntimeException(ExceptionTypeDefine.JAVA_NULL_POINT, e);
		}
	}
	
	/**
	 * 
	 * getUser(获取用户对象)  
	 * @return			User				返回用户对象
	 * @throws 			HswRuntimeException UBS运行时期异常  
	 * @since  1.0.0
	 */
	public User getUser() throws HswRuntimeException{
		try{
			Object obj = this.getSession().getAttribute("user");
			// 判断获取User是否正确
			if(VerifyHandler.INSTANCE.isVerify(obj)){
				return (User)obj;
			}
			return null;
		}catch (HswRuntimeException e) {
			log.errorLogsMsg(e, this.getClass() + "获取用户对象时发生异常", null);
			throw new HswRuntimeException(ExceptionTypeDefine.JAVA_CLASS_CASH, e);	
		}
	}
}
