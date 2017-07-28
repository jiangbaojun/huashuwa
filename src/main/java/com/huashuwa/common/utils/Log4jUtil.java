package com.huashuwa.common.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/**
 * 类名称：	Log4jUtil  
 * 类描述：	log4j日志工具
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月22日 下午4:27:10  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
public class Log4jUtil {

	/** 操作用户ID*/
	private String userLogsStr = "操作用户:";
	
	/**logger对象*/
	private Logger logger = null;
	
	/** 初始logger类 */
	private Class<?> oldClass = null;
	
	/**
	 * Log4jUtil(创建一个新的实例 Log4jUtil)
	 * @param 			ubsClass 			logger记录class
	 * @since  1.0.0
	 */
	public Log4jUtil(Class<?> logClass){
		oldClass = logClass;
		logger=Logger.getLogger(logClass);
	}
	
	/**
	 * 查询操作记录
	 * @param selestInfo 查询内容
	 * @param userId 操作用户
	 * @param loggerName  日志输出的定义的logger，在配置文件中定义的，如（log4j.logger.reportLogger）
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public void selectLogs(String selestInfo, Object userId, String loggerName){
		setLogger(loggerName);
		if(VerifyHandler.INSTANCE.isVerify(userId)){
			logger.info(userLogsStr + userId + ",查询内容:" + selestInfo);
		}else{
			logger.info("查询内容:" + selestInfo);
		}
		restoreLogger();
	}
	
	/**
	 * 更新操作记录
	 * @param updateInfo 更新内容
	 * @param userId 操作用户
	 * @param loggerName  logger名称
	 * @name	updateLogs 
	 * @createTime	2017年7月24日 上午9:13:16  
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public void updateLogs(String updateInfo, Object userId, String loggerName){
		setLogger(loggerName);
		if(VerifyHandler.INSTANCE.isVerify(userId)){
			logger.info(userLogsStr + userId + ",修改内容: " + updateInfo);
		}else{
			logger.info("修改内容: " + updateInfo);
		}
		restoreLogger();
	}

	/**
	 * 删除操作记录
	 * @param updateInfo 删除内容
	 * @param userId 操作用户
	 * @param loggerName  logger名称
	 * @createTime	2017年7月24日 上午9:16:31  
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public void deleteLogs(String deleteInfo, Object userId, String loggerName){
		setLogger(loggerName);
		if(VerifyHandler.INSTANCE.isVerify(userId)){
			logger.info(userLogsStr + userId + ",删除内容:" + deleteInfo);
		}else{
			logger.info("删除内容:" + deleteInfo);
		}
		restoreLogger();
	}
	
	/**
	 * 插入操作记录
	 * @param updateInfo 插入内容
	 * @param userId 操作用户
	 * @param loggerName  logger名称
	 * @createTime	2017年7月24日 上午9:17:41  
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public void insertLogs(String insertInfo, Object userId, String loggerName){
		setLogger(loggerName);
		logger.info(userLogsStr + userId + ",插入数据:" + insertInfo);
		restoreLogger();
	}
	
	/**
	 * 操作出现异常日志
	 * @param e 异常
	 * @param msg 异常信息内容
	 * @param userId 操作用户
	 * @param loggerName  logger名称
	 * @createTime	2017年7月24日 上午9:21:05  
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public void errorLogsMsg(Exception e,String msg, Object userId, String loggerName){
		setLogger(loggerName);
		logger.error(userLogsStr + userId + ",errorMsg:" + msg, e);
		restoreLogger();
	}
	
	/**
	 * 获得logger对象，供调用原始log4j方法
	 * @return  Logger
	 * @createTime	2017年7月24日 上午9:47:31  
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public Logger getLogger(){
		return logger;
	}

	/**
	 * 还原logger对象   
	 * @name	restoreLogger
	 * @createTime	2017年7月24日 上午9:07:57  
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	private void restoreLogger() {
		if(VerifyHandler.INSTANCE.isVerify(oldClass)){
			logger=Logger.getLogger(oldClass);
		}else {
			logger=Logger.getLogger(this.getClass());
		}
	}
	
	/**
	 * 设置logger
	 * @param loggerName  日志输出的定义的logger，在配置文件中定义的，如（log4j.logger.reportLogger）
	 * @name	setLogger
	 * @createTime	2017年7月24日 上午9:10:10  
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	private void setLogger(String loggerName) {
		if(VerifyHandler.INSTANCE.isVerify(loggerName)){
			logger=Logger.getLogger(loggerName);
		}
	}
	
	
	
}
