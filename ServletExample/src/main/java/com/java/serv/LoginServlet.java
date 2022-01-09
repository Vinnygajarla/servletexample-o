package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username,password;
		username=request.getParameter("username");
		password=request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(username.equals("Mphasis")&& password.equals("Mphasis")) {
			//out.println("Correct Credentials");
			RequestDispatcher disp = request.getRequestDispatcher("Menu.html");
			disp.forward(request, response);
		
		}else
		{
			//out.println("Invalid Credentials");
			RequestDispatcher disp = request.getRequestDispatcher("login.html");
			disp.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
