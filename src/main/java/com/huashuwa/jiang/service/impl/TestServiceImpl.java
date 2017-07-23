package com.huashuwa.jiang.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huashuwa.jiang.dao.MemberDao;
import com.huashuwa.jiang.dao.TestDao;
import com.huashuwa.jiang.exception.HswRuntimeException;
import com.huashuwa.jiang.model.Members;
import com.huashuwa.jiang.model.User;
import com.huashuwa.jiang.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{

	@Resource(name = "testDao")
	private TestDao testDao;
	
	@Resource(name = "memberDao")
	private MemberDao memberDao;

	@Override
	public User getUserById(String id) {
		User user = testDao.getUserById(id);
		return user;
	}
	
	@Override
	public Members getMemberByName(String name) {
		Members menbers = memberDao.getMemberByName(name);
		return menbers;
	}
	
	@Override
	public int insertUser(User user) {
		return testDao.insertUser(user);
	}

	@Override
	public int updateUser(User user) {
		return testDao.updateUser(user.getUserId());
	}

	@Override
	public int deleteUser(User user) {
		return testDao.deleteUser(user.getUserId());
	}

	/**
	 * 事务测试
	 * 1 回滚： @Transactional(rollbackFor=Exception.class)
	 * 2 不回滚： @Transactional(notRollbackFor=RunTimeException.class)
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED)   
	public Boolean affairUpdate(String userId1, String userId2) {
		testDao.updateUser1(userId1);
		if(true) {
			throw new HswRuntimeException("rollback", "测试回滚");
		}
		testDao.updateUser2(userId2);
		return true;
		
	}
	
}
