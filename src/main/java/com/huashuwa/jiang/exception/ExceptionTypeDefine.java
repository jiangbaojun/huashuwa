package com.huashuwa.jiang.exception;

/**
 * 类名称：	ExceptionTypeDefine  
 * 类描述：	定义异常类型
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月22日 下午4:18:53  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
public class ExceptionTypeDefine {
	
	   public static final String FILE_NOTEXIST 		    = "FILE_NOTEXIST:FILE01:文件不存在";
	   public static final String FILE_OPEN_ERROR 		    = "FILE_OPEN_ERROR:FILE02:打开文件时错误";
	   public static final String FILE_READERROR 		    = "FILE_READERROR:FILE03:读取文件错误";
	   public static final String FILE_WRITEERROR 		    = "FILE_WRITEERROR:FILE04:写文件错误";
	   public static final String FILE_ISNULL 			    = "FILE_ISNULL:FILE05:文件名称是空";
	   public static final String FILE_DOWNLOAD_ERROR 	    = "FILE_DOWNLOAD_ERROR:FILE06:下载文件错误";
	   public static final String FILE_DELETE_ERROR 	    = "FILE_DELETE_ERROR:FILE07:删除文件时错误";
	   public static final String FILE_CREATE_ERROR 	    = "FILE_CREATE_ERROR:FILE08:创建文件时错误";
	   public static final String FILE_CLOSE_ERROR 		    = "FILE_CLOSE_ERROR:FILE09:关闭文件错误";
	   public static final String FILE_ALREADY_EXIST 	    = "FILE_ALREADY_EXIST:FILE10:文件已经存在";
	   public static final String FILE_CREATEPATH_ERROR     = "FILE_CREATEPATH_ERROR:FILE11:创建目录时错误";
	   public static final String FILE_PATH_NOTFOUND	    = "FILE_PATH_NOTFOUND:FILE12:目录不存在";
	   public static final String FILE_RENAME_ERROR 	    = "FILE_RENAME_ERROR:FILE13:修改文件名称时错误";
	   public static final String FILE_CREATE_EXCEL_ERROR   = "FILE_CREATE_EXCEL_ERROR:FILE15:生成EXCEL文档时错误";
	   public static final String FILE_TYPE_ERROR 	        = "FILE_TYPE_ERROR:FILE16:文件类型错误";

	   public static final String JTA_CONTEXT_ERROR 	    = "JTA_CONTEXT_ERROR:102111:生成JTA的上下文时错误";
	   public static final String JTA_JNDI_NOTFOUND 	    = "JTA_JNDI_NOTFOUND:102112:取JTA事务时错误";
	   public static final String JTA_BEGIN_ERROR		    = "JTA_BEGIN_ERROR:102113:启动JTA事务时错误";
	   public static final String JTA_COMMIT_ERROR		    = "JTA_COMMIT_ERROR:102114:处理JTA事务时错误";
	   
	   public static final String JAVA_METHOD_NOTFOUND   	= "JAVA_METHOD_NOTFOUND:103101:类中没有找到该方法";
	   public static final String JAVA_CLASS_NOTFOUND 	    = "JAVA_CLASS_NOTFOUND:103102:类没有定义";
	   public static final String JAVA_METHOD_NOTIMPL 	    = "JAVA_METHOD_NOTIMPL:103106:类中该方法没有实现";
	   public static final String JAVA_CLASS_NOTINSTANCE    = "JAVA_CLASS_NOTINSTANCE:103103:类不能被实例化";
	   public static final String JAVA_ACCESS_LIMIT 	    = "JAVA_ACCESS_LIMIT:103104:没有存取权限";
	   public static final String JAVA_INVOCATE_EXCEPTION   = "JAVA_INVOCATE_EXCEPTION:103105:调用目标异常";
	   public static final String JAVA_THREAD_INTERRUPTED   = "JAVA_THREAD_INTERRUPTED:103110:JAVA线程被中断";
	   public static final String JAVA_OTHER_ERROR 		    = "JAVA_OTHER_ERROR:103111:调用JAVA服务时异常错误";
	   public static final String JAVA_COMPILE_EXCEPTION    = "JAVA_COMPILE_EXCEPTION:103201:编译组件时错误";
	   public static final String JAVA_PARSER_ERROR 	    = "JAVA_PARSER_ERROR:103202:解析JAVA源文件时错误";
	   public static final String JAVA_OUT_MEMORY 		    = "JAVA_OUT_MEMORY:103203:内存溢出";
	   public static final String JAVA_PARAMETER_ERROR 	    = "JAVA_PARAMETER_ERROR:103204:生成输入参数时错误";
	   public static final String JAVA_FORMAT_ERROR		    = "JAVA_FORMAT_ERROR:103205:转换时错误";
	   public static final String JAVA_NULL_POINT		    = "JAVA_NULL_POINT:103206:空指针错误";
	   public static final String JAVA_CLASS_CASH		    = "JAVA_CLASS_CASH:103207:类型转换错误";
	   
	   public static final String IO_INPUT		            = "IO_INPUT:104101:IO输入流异常";
	   public static final String IO_OUTPUT		            = "IO_OUTPUT:104102:IO输出流异常";
	   public static final String VALID_VALUE_ISNULL 	    = "VALID_VALUE_ISNULL:100401:数据为空";
	   public static final String VALID_VALUE_TOLONG 	    = "VALID_VALUE_TOLONG:100402:数据太长";
	   public static final String VALID_FORMAT_ERROR 	    = "VALID_FORMAT_ERROR:100403:数据内容格式错误";
	   public static final String DATABUS_OUTOFBOUNDS 	    = "DATABUS_OUTOFBOUNDS:100405:数组下标越界";
	   public static final String BUSINESS_ERROR 			= "BUSINESS_ERROR:100406:业务流程错误";
	   
	   public static final String JAVA_DAO_DATAHANDLE 	    = "JAVA_DAO_HANDLEDATA:105101:数据操作出错";
	   public static final String JAVA_DAO_DATAFILTER 	    = "JAVA_DAO_DATAFILTER:105102:数据条件操作出错";
	   public static final String JAVA_DAO_DATAQUERY	    = "JAVA_DAO_DATAQUERY:105103:数据查询出错";
	   public static final String JAVA_DAO_DATAINSERT	    = "JAVA_DAO_DATAINSERT:105104:数据插入出错";
	   public static final String JAVA_DAO_DATAUPDATE	    = "JAVA_DAO_DATAUPDATE:105105:数据更新出错";
	   public static final String JAVA_DAO_DATADELETE	    = "JAVA_DAO_DATADELETE:105106:数据删除出错";
	
	   public static final String ACTIVITI_FLOW_ERROR   	= "ACTIVITI_FLOW_ERROR:106001:工作流操作时发生异常";
	   public static final String NO_RECEVIE_USER   		= "NO_RECEVIE_USER:106002:没有找到待办人";
	   public static final String EXCEL_IMPORT_ERROR   		= "EXCEL_IMPORT_ERROR:106003:EXCEL导入错误";

	   public static final String JAVA_STRING_DECODE 		= "JAVA_STRING_DECODE:107101:字符串解码出错";
	   public static final String JAVA_STRING_ENCODE 		= "JAVA_STRING_DECODE:107102:字符串编码出错";
	   
	   public static final String DATABASE_SQL_VALID        = "DATABASE_SQL_VALID:108101:SQL语句不合法";

	   public static final String JAVA_PAGEDATA_VALID       = "JAVA_PAGEDATA_VALID:109101:获取PAGEDATA出错";
	   
	   public static final String UBS_OTHER_ERROR			= "UBS_OTHER_ERROR:999999:未知的错误";
}
