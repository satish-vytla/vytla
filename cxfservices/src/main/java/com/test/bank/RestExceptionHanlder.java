package com.test.bank;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RestExceptionHanlder implements ExceptionMapper<Exception> {

	public Response toResponse(Exception exp) {
		exp.printStackTrace();
		ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		rb.type(MediaType.APPLICATION_JSON);
		com.test.bankapp.Error error = new com.test.bankapp.Error("FAILED", "SERVER-ERROR", "Sorry !! We are unable to process your request. Please try again.");
		rb.entity(error);
		return rb.build();
	}

}
