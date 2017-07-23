package com.huashuwa.common.utils;

import org.apache.log4j.Logger;

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
	private String userLogsStr = "userId:";
	
	/**logger对象*/
	private Logger logger = null;
	
	/**
	 * Log4jUtil(创建一个新的实例 Log4jUtil)
	 * @param 			ubsClass 			logger记录class
	 * @param 			userId 				用户ID
	 * @since  1.0.0
	 */
	public Log4jUtil(Class<?> ubsClass){
		logger=Logger.getLogger(ubsClass);
	}
	
	/**
	 * 
	 * selectLogs(查询操作时记录必要敏感数据)
	 * @param 			selestInfo  		必要敏感数据      
	 * @param			userId				用户ID
	 * @exception    
	 * @since  1.0.0
	 */
	public void selectLogs(String selestInfo, Object userId){
		if(VerifyHandler.INSTANCE.isVerify(userId)){
			logger.info(userLogsStr + userId + ",查询内容:" + selestInfo);
		}else{
			logger.info("查询内容:" + selestInfo);
		}
	}
	
	/**
	 * 
	 * updateLogs(修改操作时记录必要非敏感数据)
	 * @param 			updateInfo  		必要敏感数据   
	 * @param			userId				用户ID 
	 * @exception    
	 * @since  1.0.0
	 */
	public void updateLogs(String updateInfo, Object userId){
		if(VerifyHandler.INSTANCE.isVerify(userId)){
			logger.info(userLogsStr + userId + ",修改数据: " + updateInfo);
		}else{
			logger.info("修改数据: " + updateInfo);
		}
	}
	
	/**
	 * 
	 * deleteLogs(删除操作时记录必要非敏感数据) 
	 * @param 			deleteInfo  		必要非敏感数据     
	 * @param			userId				用户ID 
	 * @exception    
	 * @since  1.0.0
	 */
	public void deleteLogs(String deleteInfo, Object userId){
		if(VerifyHandler.INSTANCE.isVerify(userId)){
			logger.info(userLogsStr + userId + ",删除数据:" + deleteInfo);
		}else{
			logger.info("删除数据:" + deleteInfo);
		}
	}
	
	/**
	 * 
	 * insertLogs(插入操作时记录必要非敏感数据 )
	 * @param 			insertInfo  		必要非敏感数据   
	 * @param			userId				用户ID 
	 * @exception    
	 * @since  1.0.0
	 */
	public void insertLogs(String insertInfo, Object userId){
		logger.info(userLogsStr + userId + ",插入数据:" + insertInfo);
	}
	
	/**
	 * errorLogs(用户操作异常)
	 * @param 			e 					异常信息
	 * @param 			userId 				用户Id
	 */
	public void errorLogs(Exception e, Object userId){
		logger.error(userLogsStr + userId, e);
	}
	
	/**
	 * errorLogsMsg(用户操作异常信息)
	 * @param 			e 					异常
	 * @param 			msg 				解释异常信息
	 * @param 			userId 				用户ID
	 */
	public void errorLogsMsg(Exception e,String msg, Object userId){
		logger.error(userLogsStr + userId + ",error msg:" + msg, e);
	}
}
