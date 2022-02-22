package com.mondee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	@RequestMapping("/register")
public String register( HttpServletRequest request,HttpServletResponse  response) {
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String phno=request.getParameter("phno");
	request.setAttribute("username",username);
	request.setAttribute("password",password);
	request.setAttribute("email",email);
	request.setAttribute("phno", phno);
		
	return "display.jsp";
}
}