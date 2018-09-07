package com;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {
	private static final String RESOURCE = "config.xml";
	private static final SqlSessionFactory FACTORY;

	static {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(RESOURCE);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("load resource exception...");
		}
		FACTORY = new SqlSessionFactoryBuilder().build(inputStream);
	}
	public static SqlSessionFactory getFactory(){
		return FACTORY;
	}

	public static SqlSession getSqlSession(boolean autocommit){
		return FACTORY.openSession(autocommit);
	}
}
