package com.tcs.nsep.action.registration;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.nsep.model.registration.Bank;
import com.tcs.nsep.model.registration.College;


/**
 * Servlet implementation class RegistrationController
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	connectToDatabase();
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	
    	super.init(config);
    	connectToDatabase();
    }
    private void connectToDatabase() {
		// TODO connect to the database 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// calling doProcess method
		processRequest( request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// calling doProcess method
		processRequest(request,response);
	}
	public void processRequest(HttpServletRequest request, HttpServletResponse response){
		// TODO call all the required method according to request URL
		String url=request.getRequestURI();
		url=url.replaceAll("/NSEP/","");
		//System.out.println(url);
		switch(RegistrationControllerEnum.valueOf(url))
		{
				
		case StudentRegistration:
			studentRegistration( request, response);
			break;
		
		case CollegeRegistration:
			collegeRegistration( request, response);
			break;
		
		case BankRegistration:
			bankRegistration( request, response);
			break;
		case MeetSPOC:
			meetSPOC( request, response);
			break;
		}	
		
	}
	
	
	
	
	
	@Override
	public void destroy() {
		// TODO destroy all connections and file streams
		
		super.destroy();
	}
	public void studentRegistration(HttpServletRequest request, HttpServletResponse response){
		// TODO register the student
	}
	public void collegeRegistration(HttpServletRequest request, HttpServletResponse response){
		// TODO register college
		String CollegeName=request.getParameter("CollegeName");
		String UniversityName=request.getParameter("UniversityName");
		String CollegeAddress=request.getParameter("CollegeAddress");
		String SPOCName=request.getParameter("SpocName");
		String SPOCContactNumber=request.getParameter("SpocContactNumber");
		String SPOCEmailId=request.getParameter("SpocEmailId");
		String City=request.getParameter("City");
		String State=request.getParameter("State");
		
		
		College c=new College();
		boolean status=c.insertCollegeDetails(CollegeName,UniversityName,CollegeAddress,SPOCName,SPOCContactNumber,SPOCEmailId,City,State);
		if(status=true)
		{
			try {
			
				request.getRequestDispatcher("success.html").forward(request,response);
			} catch (ServletException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void bankRegistration(HttpServletRequest request, HttpServletResponse response){
		// TODO register bank
		String BankName= request.getParameter("BankName");
		String BranchLoc= request.getParameter("BranchLoc");
		String SPOCName= request.getParameter("SPOCName");
		String SPOCContact= request.getParameter("SPOCContact");
		
		Bank b=new Bank();
		boolean status=b.insertBankDetails(BankName,BranchLoc,SPOCName,SPOCContact);
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
	}
	public void meetSPOC(HttpServletRequest request, HttpServletResponse response){
		// TODO meet the SPOC
	}

}
