package com.jnmd.mybatis.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.jnmd.mybatis.domain.User;
import com.jnmd.mybatis.mapper.UserMapper;
import com.jnmd.mybatis.util.MyBatisUtil;

public class DynamicSQL {
	public static void main(String[] args) {
		
		SqlSession session = MyBatisUtil.getSession();
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		Map<String , Object> params = new HashMap<String , Object>();
		
		/*List<User> user = userMapper.testIftag(params);
		System.out.println(user);*/
		
		/*List<User> user = userMapper.testTrimPrefix(params);
		System.out.println(user);*/
		
		/*params.put("password", "rrrrrr");
		params.put("uid",1);
		userMapper.testTrimSuffix(params);
		session.commit();
		System.out.println(params);*/
		
		params.put("age", 30);
		params.put("ageValue", 22);
		List<User> users = userMapper.testChoose(params);
		System.out.println(users);
		
		
		MyBatisUtil.closeSession(session);
	}
}
