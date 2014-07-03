package com.tcs.nsep.action.session;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.nsep.model.login.Login;


/**
 * Servlet implementation class LoginNSEP
 */
public class SessionNSEP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionNSEP() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	connectDatabase();
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	connectDatabase();
    }
    public void connectDatabase(){
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	public void processRequest(HttpServletRequest request, HttpServletResponse response){
		String url=request.getRequestURI();
		url=url.replaceAll("/NSEP/","");
		System.out.println(url);
		switch(SessionControllerEnum.valueOf(url))
		{
		
		case Login:
			createSession( request, response);
			break;
			
		case Logout:
			closeSession( request, response);
			break;
		}
		
	}
	public void createSession(HttpServletRequest request, HttpServletResponse response){
		// TODO create session object here
		String userName=request.getParameter("useName");
		String password=request.getParameter("password");
		Login login=new Login();
		boolean status=login.checkLogin(userName, password);
		
		if(status=true)
		{
			try 
			{
				request.getRequestDispatcher("success.html").forward(request, response);
			} 
			catch (ServletException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("error");
		}
	}
	public void closeSession(HttpServletRequest request, HttpServletResponse response){
		// TODO destroy session object here
	}
	@Override
	public void destroy() {
		// TODO close connections here
		super.destroy();
	}

}
