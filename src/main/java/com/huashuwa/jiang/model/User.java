package com.huashuwa.jiang.model;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 类名称：	User  
 * 类描述：	用户
 * 创建人：  	姜宝俊
 * 创建时间：	2017年7月23日 上午10:41:23  
 * 修改人：
 * 修改时间：
 * @version 1.0.0
 */
@Alias("user")
public class User {

	private String userId;
	private String name;
	private String userName;
	private String password;
//	该注解需要引入jackson包
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")  
	private Date birthday;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
	private Date createTime;
	private String sex;
	private String phone;
	private String email;
	private Boolean active;
	private String address;
	
	public User() {
		super();
	}

	public User(String userId, String name, String userName, String password, Date birthday, Date createTime,
			String sex, String phone, String email, Boolean active, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.createTime = createTime;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.active = active;
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", birthday=" + birthday + ", createTime=" + createTime + ", sex=" + sex + ", phone=" + phone
				+ ", email=" + email + ", active=" + active + ", address=" + address + "]";
	}

}
