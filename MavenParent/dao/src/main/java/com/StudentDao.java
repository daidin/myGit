package com;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
	/**
	 * getAll
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<Student> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
}
