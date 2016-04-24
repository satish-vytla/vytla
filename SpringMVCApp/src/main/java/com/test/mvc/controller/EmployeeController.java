package com.test.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeValidator empValidator; 
	
	@InitBinder("employee")
	public void initBinder(WebDataBinder binder){
		binder.setValidator(empValidator);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/showinputpage") 
	public ModelAndView showEmployeeInputPage(){
		//Model
		Employee emp = new Employee();
		emp.setSalary(5000);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		mv.addObject("employee", emp);
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/saveEmployee") 
	public ModelAndView saveEmployee(@Validated Employee emp,BindingResult result){
		System.out.println(" Employee " + emp);
		ModelAndView mv = new ModelAndView();
		
		if(result.hasErrors()){
			mv.addObject("employee", emp);
			mv.setViewName("register");
		}else{
			//B.L
			//output
			mv.setViewName("welcome");
		}
		return mv;
	}
	
	
}
