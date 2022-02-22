package com.mondee;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
	@RequestMapping("/register")
public ModelAndView register( HttpServletRequest request,HttpServletResponse  response) {
		
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String phno=request.getParameter("phno");
	ModelAndView mv=new ModelAndView();
	mv.addObject("username",username);
	mv.addObject("password",password);
	mv.addObject("email",email);
	mv.addObject("phno", phno);
		mv.setViewName("display");
	return mv;
}
}