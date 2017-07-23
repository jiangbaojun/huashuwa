package com.huashuwa.common.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 类名称：	VerifyHandler  
 * 类描述：	数据有效性判断
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月22日 下午4:20:41  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
@SuppressWarnings("rawtypes")
public enum VerifyHandler {
	
	/**
	 * 验证辅助类实例
	 */
	INSTANCE;
	
	/**
	 * 校验字符串是否正确 
	 * @param strValue 被校验的字符串
	 * @return  boolean   返回boolean
	 * @exception (标注Runtime异常)
	 * @throws (标注非Runtime异常)
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public boolean isVerify(String strValue){
		
		return strValue == null || "".equals(strValue) ? false : true;
	}
	
	/**
	 * 校验Map是否正确 
	 * @param mapValue 被校验的map
	 * @return  boolean    返回boolean
	 * @exception (标注Runtime异常)
	 * @throws (标注非Runtime异常)
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public boolean isVerify(Map mapValue){
		
		return mapValue == null || mapValue.isEmpty() ? false : true;
	}
	/**
	 * 校验对象是否正确 
	 * @param obj 被校验的对象
	 * @return  boolean    返回boolean
	 * @exception (标注Runtime异常)
	 * @throws (标注非Runtime异常)
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public boolean isVerify(Object obj){
		
		return obj == null ? false : true;
	}
	
	/**
	 * 校验对象数组是否正确，非null判断和内容非空判断
	 * @param objArray 被校验的数组
	 * @return  boolean   
	 * @exception (标注Runtime异常)
	 * @throws (标注非Runtime异常)
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public boolean isVerify(Object[] objArray){
		
		return (objArray == null || objArray.length <= 0) ? false : true;
	}
	
	/**
	 * 校验集合是否正确 
	 * @param coll 被校验的集合
	 * @return  boolean   
	 * @exception (标注Runtime异常)
	 * @throws (标注非Runtime异常)
	 * @author 姜宝俊
	 * @since  1.0.0
	 */
	public boolean isVerify(Collection coll){
		
		return coll == null || coll.isEmpty() ? false : true;
	}
}
