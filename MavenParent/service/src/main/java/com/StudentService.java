package com;

import com.impl.StudentDaoimpl;

import java.util.List;

public class StudentService {
	private StudentDao studentDao = new StudentDaoimpl();

	public List<Student> getAll(int pageNum,int pageSize){
		return studentDao.getAll(pageNum, pageSize);
	}
}
