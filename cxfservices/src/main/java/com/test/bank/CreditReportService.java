package com.test.bank;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.test.bankapp.CreditReportRequest;
import com.test.bankapp.CreditReportResponse;

@Path("/banking")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public interface CreditReportService {
	
	@POST
	@Path("/creditreport")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	CreditReportResponse getReport(CreditReportRequest request);
	
	@GET
	@Path("/creditreport")
	CreditReportResponse getReportWithQueryParams(@QueryParam("ssn") String ssn,@QueryParam("fname") String fame,@QueryParam("dob") String dob);

}
