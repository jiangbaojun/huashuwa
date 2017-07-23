package com.huashuwa.jiang.model;

import org.apache.ibatis.type.Alias;

/**
 * 类名称：	Members  
 * 类描述：	成员
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月23日 上午10:41:06  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
@Alias("members")
public class Members {

	private String id;
	private String parentId;
	private String name;
	private String className;
	private String description;
	private String parentNodeSymbol;
	private int orderNum;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParentNodeSymbol() {
		return parentNodeSymbol;
	}

	public void setParentNodeSymbol(String parentNodeSymbol) {
		this.parentNodeSymbol = parentNodeSymbol;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "Members [id=" + id + ", parentId=" + parentId + ", name=" + name + ", className=" + className
				+ ", description=" + description + ", parentNodeSymbol=" + parentNodeSymbol + ", orderNum=" + orderNum
				+ "]";
	}

}
