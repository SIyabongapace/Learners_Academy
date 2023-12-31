package com.operations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.AllDetails.TeacherDetails;
import com.util.Util;

@WebServlet("/add-teacher")
public class CreateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("add-teacher.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("Kisha");
		String Subject = request.getParameter("math");
		String Class = request.getParameter("room1");
		
		try {
			SessionFactory factory = Util.buildConnection();
			
			Session session = factory.openSession();
			
			TeacherDetails teacherdetails = new TeacherDetails(name, Subject, Class);
			
			Transaction tx = session.beginTransaction();
			
			session.save(teacherdetails);
			
			tx.commit();
			
			if(session != null) {
				out.println("<div align='center'><h2 style='color:green'>TEACHER ADDED SUCCESSFULLY!</h2>"
						+ "<a href='admin-page.html'>RETURN To MainMenu</a>"
						+ "</div>");
			}
			session.close();
		} catch (Exception e) {
			out.println("<div align='center'><h2 style='color:red'>TRY AGAIN! OPERATION FAILED...</h2></div>");
		}
	}

}
