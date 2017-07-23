package com.huashuwa.jiang.service;

import com.huashuwa.jiang.model.Members;
import com.huashuwa.jiang.model.User;

public interface TestService {

	User getUserById(String id);
	
	int insertUser(User user);
	
	Members getMemberByName(String name);

	int updateUser(User user);

	int deleteUser(User user);

	Boolean affairUpdate(String userId1, String userId2);

}
