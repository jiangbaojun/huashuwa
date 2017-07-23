package com.huashuwa.jiang.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.huashuwa.jiang.model.User;

public interface TestDao {

	User getUserById(@Param("userId")String userId);

	int insertUser(User user);

	int updateUser(@Param("userId")String userId);

	int deleteUser(@Param("userId")String userId);
	
	int updateUser1(@Param("userId1")String userId1);
	int updateUser2(@Param("userId2")String userId2);

}
