package com.huashuwa.common.utils.page.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.type.Alias;

/**
 *
 * 类名称：	Page
 * 类描述： 分页数据包装类
 * 创建人：  	江赛
 * 创建时间：	2015-8-27 上午11:17:42
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
@Alias("Page")
public class Page {
	
	private int limit; //每页显示记录数
	private int totalPage;		//总页数
	private int totalResult;	//总记录数
	private int start;	//当前页
	private int currentResult;	//当前记录起始索引
	private boolean entityOrField;	//true:需要分页的地方，传入的参数就是Page实体；false:需要分页的地方，传入的参数所代表的实体拥有Page属性
	private PageData pd = new PageData(); //分页查询参数
	private List<PageData> resultList = new ArrayList<PageData>(); //结果数据集



	public Page(){
		this.limit = 20;
	}
	
	public int getTotalPage() {
		if(totalResult% limit ==0)
			totalPage = totalResult/ limit;
		else
			totalPage = totalResult/ limit +1;
		return totalPage;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public int getTotalResult() {
		return totalResult;
	}
	
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
	
	public int getStart() {
		if(start <=0)
			start = 1;
		if(start >getTotalPage())
			start = getTotalPage();
		return start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	

	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		
		this.limit = limit;
	}
	
	public int getCurrentResult() {
		currentResult = (getStart()-1)* getLimit();
		if(currentResult<0)
			currentResult = 0;
		return currentResult;
	}
	
	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}
	
	public boolean isEntityOrField() {
		return entityOrField;
	}
	
	public void setEntityOrField(boolean entityOrField) {
		this.entityOrField = entityOrField;
	}
	
	public PageData getPd() {
		return pd;
	}

	public void setPd(PageData pd) {
		this.pd = pd;
	}

	public List<PageData> getResultList() {
		return resultList;
	}

	public void setResultList(List<PageData> resultList) {
		this.resultList = resultList;
	}
}
