package com.jnmd.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	
	private static final String RESOURCE_PATH = "MyBatis.cfg.xml";
	private static SqlSessionFactory factory;
	
	
	static{
		InputStream inputStream;
		
		try {
			inputStream = Resources.getResourceAsStream(RESOURCE_PATH);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static SqlSession getSession(){
		return factory.openSession();
	}
	
	public static void closeSession(SqlSession session){
		if(session != null){
			session.close();
		}
	}
	
}
