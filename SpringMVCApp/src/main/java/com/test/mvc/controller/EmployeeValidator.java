package com.test.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	//@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.isAssignableFrom(clazz);
	}

	//@Override
	public void validate(Object target, Errors errors) {
		Employee emp = (Employee) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "eno", "eno.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ename", "ename.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ssn", "ssn.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "salary", "salary.required");
		
		if(emp.getEno() !=null && emp.getEno() <= 0)
		{
			errors.rejectValue("eno", "eno.must.greaterthen.zero"); //error key "fee.min
		}
	}

}
