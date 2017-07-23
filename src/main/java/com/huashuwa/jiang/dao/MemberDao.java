package com.huashuwa.jiang.dao;

import org.apache.ibatis.annotations.Param;

import com.huashuwa.jiang.model.Members;

public interface MemberDao {

	Members getMemberByName(@Param("name")String name);
}
