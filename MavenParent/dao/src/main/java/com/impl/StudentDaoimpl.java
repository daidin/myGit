package com.impl;

import com.SqlSessionFactoryUtil;
import com.Student;
import com.StudentDao;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoimpl implements StudentDao {

	public List<Student> getAll(int pageNum,int pageSize) {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
		try {
			StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
			return studentDao.getAll(pageNum,pageSize);
		}finally {
			sqlSession.close();
		}
	}
}
