package com.huashuwa.jiang.exception;

/**
 * 类名称：	UnknownException  
 * 类描述：	自定义未知异常
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月22日 下午4:19:34  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
public class UnknownException extends RuntimeException{
	
	private static final long serialVersionUID = -1453453562698088104L;

	public UnknownException(){
		super();
	}
	
	public UnknownException(String message){
		super(message);
	}
	
	public UnknownException(String message,Throwable casue){
		super(message,casue);
	}
}
