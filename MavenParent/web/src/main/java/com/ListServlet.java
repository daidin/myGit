package com;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService studentService = new StudentService();

		Integer pageNum = Integer.valueOf(req.getParameter("pageNo") == null ? "1" : req.getParameter("pageNo"));

		Page<Student> studentPage = (Page<Student>) studentService.getAll(pageNum,4);
		PageInfo<Student> studentPageInfo = new PageInfo<Student>(studentPage, 9);

		req.setAttribute("List",studentPageInfo);
		req.getRequestDispatcher("index.jsp").forward(req,resp);
	}
}
