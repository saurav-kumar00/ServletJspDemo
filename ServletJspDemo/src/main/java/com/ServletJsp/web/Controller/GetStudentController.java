package com.ServletJsp.web.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ServletJsp.web.Dao.StudentDao;
import com.ServletJsp.web.Model.Student;

/**
 * Servlet implementation class GetStudentController
 */
public class GetStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		StudentDao sd = new StudentDao();
		Student s1 = sd.getStudent(rollno);
		
		request.setAttribute("Student", s1);
		RequestDispatcher rd = request.getRequestDispatcher("Student.jsp");
		rd.forward(request, response);
		
	}

}
