package com.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.DAO.UserPersistDb;
import com.user.bean.User;

/**
 * Servlet implementation class UserController
 */

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		User user = new User();
		user.setName(request.getParameter("userName"));
		user.setPassWord(request.getParameter("password"));
		user.setPhoneNumber(Integer.parseInt(request.getParameter("phNum")
				.trim()));

		UserPersistDb userDb = new UserPersistDb();
		int lStatus = userDb.insert(user);
		if (lStatus > 0) {
			System.out.print("Inserted");
			response.sendRedirect("logIn.jsp");
		} else {
			out.println("User Value is not Inserted ..Pls Try Again");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
		User user = new User();
		user.setName(request.getParameter("userName"));
		user.setPassWord(request.getParameter("password"));

		UserPersistDb userDb = new UserPersistDb();
		boolean token=userDb.verifyUser(user);
		if(token){
			RequestDispatcher rd = request.getRequestDispatcher("userRegister.jsp");
			rd.forward(request, response);
		
		}else{
			out.println("Wrong User");
			RequestDispatcher rd = request.getRequestDispatcher("logIn.jsp");
			rd.include(request, response);
		}
	}

}
