package com.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.user.DAO.UserPersistDb;
import com.user.bean.User;


@Controller
public class RegisterUser {
@RequestMapping("addUser")

public ModelAndView registerUser(HttpServletRequest pRequest,HttpServletResponse pResponse)throws ServletException,IOException{
	
	User user = new User();
	user.setName(pRequest.getParameter("userName"));
	user.setPassWord(pRequest.getParameter("password"));
	user.setPhoneNumber(Integer.parseInt(pRequest.getParameter("phNum")
			.trim()));

	UserPersistDb userDb = new UserPersistDb();
	int lStatus = userDb.insert(user);
	if(lStatus>0){
	  String msg="";	 
      return new ModelAndView("logIn","msg",msg);
	}else{
		String msg="User Registration Failed .. Try Again";
		return new ModelAndView("register","msg",msg);
	}
	}


@RequestMapping("verifyUser")

public ModelAndView verifyUser(HttpServletRequest pRequest,
		HttpServletResponse pResponse) throws ServletException, IOException {
	User user = new User();
	user.setName(pRequest.getParameter("userName"));
	user.setPassWord(pRequest.getParameter("password"));

	UserPersistDb userDb = new UserPersistDb();
	boolean token = userDb.verifyUser(user);
	if (token) {
		String msg = "";
		return new ModelAndView("userRegister", "msg", msg);
	} else {
		String msg = "Wrong User";
		return new ModelAndView("logIn", "msg", msg);
	}

}
}
