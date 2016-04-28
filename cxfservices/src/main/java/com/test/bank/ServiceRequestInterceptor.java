package com.test.bank;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

import com.test.bankapp.Error;

@Provider
public class ServiceRequestInterceptor implements RequestHandler  {

	public Response handleRequest(Message msg, ClassResourceInfo resourceClass) {
		String params = (String)msg.get(Message.QUERY_STRING);
		/*if(params == null){ // Validation
			System.out.println(" Validation Error ");
			ResponseBuilder rb = Response.status(Response.Status.BAD_REQUEST);
			rb.type(MediaType.APPLICATION_JSON);
			com.test.bankapp.Error error = new Error("Failure", "VAL-ERROR", "Pamramters are null");
			rb.entity(error);
			return rb.build();
		}*/
		System.out.println(" Params  " + params);
		return null; //request processing is completed succesfully.
	}

}
