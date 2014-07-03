package com.tcs.nsep.action.loan;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoanController
 */
public class LoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoanController() {
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
		// Process request here
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// process request here
		processRequest(request,response);
	}
	public void processRequest(HttpServletRequest request, HttpServletResponse response){
		// TODO processing request here
		String url=request.getRequestURI();
		url=url.replaceAll("/NSEP/","");
		switch(LoanControllerEnum.valueOf(url))
		{
		
		case LoanController:
			System.out.println("hi1");
			break;
			
		case LoanRequest:
			loanRequest( request, response);
			break;
		
		case ChangeLoanParameter:
			changeLoanParameter( request, response);
			break;
		
		case LoanStatus:
			loanStatus( request, response);
			break;
		case ChangeStatus:
			changeStatus( request, response);
			break;
		case ViewLoanStatus:
			viewLoanStatus( request, response);
			break;
		case ViewApplication:
			viewApplication( request, response);
			break;
		case GenerateCertificate:
			GenerateCertificate( request, response);
			break;
		}	
	}
	
	public void loanRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	public void changeLoanParameter(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	public void loanStatus(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	public void changeStatus(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	public void viewLoanStatus(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	public void viewApplication(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	public void GenerateCertificate(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	
	
	@Override
	public void destroy() {
		// TODO destroy all connections and file streams
		
		super.destroy();
	}

}
