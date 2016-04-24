package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.CreditReportRequest;
import com.test.model.CreditReportResponse;

@Controller
public class CreditService {
	
	@RequestMapping(method=RequestMethod.GET,value="/creditscore/{ssn}/{dob}/{fname}") 
	public @ResponseBody CreditReportResponse getCreditReport(@PathVariable("ssn") String ssn,
			@PathVariable("dob") String dob, @PathVariable("fname") String fname){
		//TODO: JDBC
		CreditReportResponse response = new CreditReportResponse(780,7,ssn,dob,fname);
		return response;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/creditscore") 
	public @ResponseBody CreditReportResponse getCreditReport1(@RequestBody CreditReportRequest request){
		//TODO: JDBC
		CreditReportResponse response = new CreditReportResponse(780,7,request.getSsn(),request.getDob(),request.getFname());
		return response;
	}

}
