package com.tcs.nsep.action.account;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccountController
 */
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController() {
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
		//calling doProcess method
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//calling doProcess method
		processRequest(request, response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response){
		// TODO call all the required method according to request URL
		String url=request.getRequestURI();
		url=url.replaceAll("/NSEP/","");
		System.out.println(url);
		switch(ControllerEnum.valueOf(url))
		{
		
		case AccountController:
			System.out.println("hi1");
			break;
			
		case RegisterAccount:
			registorAccount( request, response);
			break;
		
		case StudentAccountDetails:
			studentAccountDetails( request, response);
			break;
		
		case RelatedAccountDetails:
			relatedAccountDetails( request, response);
			break;
		
		case ViewForDefaulter:
			viewForDefaulter( request, response);
			break;
		
		case ViewDefaulterReport:
			viewDefaulterReport( request, response);
			break;
		
		case GenerateMonthlyTopUp:
			generateMonthlyTopUp( request, response);
			break;
		
		case GenerateQuarterlyBonus:
			generateQuarterlyBonus( request, response);
			break;
		
		case GenerateAnnualBonus:
			generateAnnualBonus( request, response);
			break;
		
		case AddMonthlyDeposit:
			addMonthlyDeposit( request, response);
			break;
			
		}
	}
	public void registorAccount(HttpServletRequest request, HttpServletResponse response) {
		// TODO register Account
	}
	public void studentAccountDetails(HttpServletRequest request, HttpServletResponse response){
		// TODO display student details
	}
	public void relatedAccountDetails(HttpServletRequest request, HttpServletResponse response){
		// TODO display related account
	}
	public void viewForDefaulter(HttpServletRequest request, HttpServletResponse response){
		// TODO student views either he is defaulter or not 
	}
	public void viewDefaulterReport(HttpServletRequest request, HttpServletResponse response){
		// TODO administrator view all defaulter
	}
	public void generateMonthlyTopUp(HttpServletRequest request, HttpServletResponse response){
		// TODO administrator will add monthly top up
	}
	public void generateQuarterlyBonus(HttpServletRequest request, HttpServletResponse response){
		// TODO administrator will add quarterly bonus
	}
	public void generateAnnualBonus(HttpServletRequest request, HttpServletResponse response){
		// TODO will add annual bonus 
	}
	public void addMonthlyDeposit(HttpServletRequest request, HttpServletResponse response){
		// TODO will generate monthly  deposit 
	}
	
	
	
	@Override
	public void destroy() {
		// TODO destroy all connections and file streams
		
		super.destroy();
	}

}
