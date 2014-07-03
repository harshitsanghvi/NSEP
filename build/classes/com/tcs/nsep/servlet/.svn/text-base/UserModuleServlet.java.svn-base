package com.tcs.nsep.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserModuleServlet
 */
public class UserModuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserModuleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getParameter("studentName");
		request.getParameter("CollegeName");
		request.getParameter("BankName");
		String str=request.getRequestURI();
		PrintWriter out=response.getWriter();
		out.println("<html><body>Thank you");
		if(str.contains("CollegeUserModule"))
		{
		out.println(request.getParameter("CollegeName"));
		out.println("</body></html>");
		}
		if(str.contains("MemberUserModule"))
		{
		out.println(request.getParameter("studentName"));
		out.println("</body></html>");
		}
		if(str.contains("BankUserModule"))
		{
		out.println(request.getParameter("BankName"));
		out.println("</body></html>");
		}
		//request.getRequestDispatcher("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
