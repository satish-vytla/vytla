package com.test.bank;

import com.test.bankapp.Address;
import com.test.bankapp.CreditReportRequest;
import com.test.bankapp.CreditReportResponse;


public class CreditReportServiceImpl  implements CreditReportService{

	public CreditReportResponse getReport(CreditReportRequest request) {
		//JDBC Logic
		return buildMockObject(request);
	}
	
	private CreditReportResponse buildMockObject(CreditReportRequest request){
		CreditReportResponse respone = new CreditReportResponse();
		respone.setSsn(request.getSsn());
		respone.setFname(request.getFname());
		respone.setNoOfAccounts(5);
		respone.setScore(780);
		respone.setDob(request.getDob());
		
		Address address1 = new Address("Plymouth", "45677");
		Address address2 = new Address("Xenium Line", "12345");
		respone.getAddress().add(address1);
		respone.getAddress().add(address2);
		return respone;
	}

	public CreditReportResponse getReportWithQueryParams(String ssn,
			String fname, String dob) {
		return getReport(new CreditReportRequest(ssn, fname, dob));
	}
}
