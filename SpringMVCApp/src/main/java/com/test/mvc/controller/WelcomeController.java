package com.test.mvc.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping(method=RequestMethod.GET,value="/welcome") /*/WEB-INF/jsp/welcome.jsp */
	public void welcome(){
		System.out.println(" Spring Controller Method");
		/* return /WEB-INF/jsp/welcome.jsp */
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/showWelcome") 
	public String showWelcome(){
		System.out.println(" Spring Controller Method");
		return "welcome"; // View Name /WEB-INF/jsp/welcome.jsp
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/inputDemo/{sno}/{sname}/{course}") 
	public String acceptInput(@PathVariable("sno") int sno,@PathVariable("sname") String sname,
			@PathVariable("course") String course, String userName,String password){
		System.out.println(" USer Name " + userName + " PAss word " + password + " " + sno + sname + course);
		return "welcome"; // View Name /WEB-INF/jsp/welcome.jsp
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/servletDemo") 
	public String oldWay(HttpServletRequest request,HttpServletResponse response){
		System.out.println(" USer Name " + request.getParameter("userName") + " PAss word " + request.getParameter("password")  + " " );
		return "welcome"; // View Name /WEB-INF/jsp/welcome.jsp
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/inputOutputDemo") 
	public ModelAndView inputOutputDemo(String userName){
		//B.L
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		mv.addObject("date1",new Date().toString());
		mv.addObject("user",userName);
		return mv; 
	}
	
	

}
