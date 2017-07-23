package com.huashuwa.jiang.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
/**
 * 类名称:	PropertiesUtils  
 * 类描述:	读取properties工具类
 * 创建人:	姜宝俊
 * 创建时间:	2017年5月31日 下午3:39:26  
 * 修改人:	
 * 修改时间：
 * @version 1.0.0
 */
public class PropertiesUtils
{

    private Properties props;
    
    private String fileName;
    
	/**
	 * 
	 * 创建一个新的实例 PropertiesUtils.   
	 *   
	 * @param fileName
	 */
    public PropertiesUtils(String fileName)
    {
        this.fileName = fileName;
        readProperties(fileName);
    }
    /**
     * 
     * 载入properties文件
     * @param fileName  void   
     * @exception (标注Runtime异常)
     * @throws (标注非Runtime异常)
     * @since  1.0.0
     */
    private void readProperties(String fileName)
    {
        try
        {
            props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream(fileName));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * 根据key值，获得value值
     * @param key
     * @return  String   
     * @exception (标注Runtime异常)
     * @throws (标注非Runtime异常)
     * @since  1.0.0
     */
    public String getProperty(String key)
    {
        return props.getProperty(key);
    }
    /**
     * 获得所有key-value键值对，封装到map集合返回
     * @return  Map   
     * @exception (标注Runtime异常)
     * @throws (标注非Runtime异常)
     * @since  1.0.0
     */
    public Map<String, String> getAllProperty()
    {
        Map<String, String> map = new HashMap<String, String>();
        String key;
        String value;
        for(Enumeration enu = props.propertyNames(); enu.hasMoreElements(); map.put(key, value))
        {
            key = (String)enu.nextElement();
            value = props.getProperty(key);
        }

        return map;
    }

    /**
     * 
     * 逐条输出properties文件内容（默认控制台，有其他需求改源码） 
     * @exception (标注Runtime异常)
     * @throws (标注非Runtime异常)
     * @since  1.0.0
     */
    public void printProperties()
    {
        props.list(System.out);
    }
    
    public void writeProperties(String key, String value)
    {
        try
        {
            java.io.OutputStream fos = new FileOutputStream(fileName);
            props.setProperty(key, value);
            props.store(fos, (new StringBuilder("『comments』Update key：")).append(key).toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
