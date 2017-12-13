package com.jnmd.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.jnmd.mybatis.domain.User;

public interface UserMapper {
	
	public List<User> testIftag(Map<String, Object> params);
	public List<User> testTrimPrefix(Map<String, Object> params);
	public void testTrimSuffix(Map<String , Object> params);
	public List<User> testChoose(Map<String, Object> param);
}
