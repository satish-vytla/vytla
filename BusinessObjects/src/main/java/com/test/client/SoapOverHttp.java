package com.test.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class SoapOverHttp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://www.webservicex.com/globalweather.asmx"); //End Point URL
		
		URLConnection connection = url.openConnection();
		
		HttpURLConnection httpConnection = (HttpURLConnection) connection;
		
		String soapReq = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET\">"+
		   "<soapenv:Header/>"+
		   "<soapenv:Body>"+
		      "<web:GetCitiesByCountry>" +
		         "<web:CountryName>INDIA</web:CountryName>"+
		      "</web:GetCitiesByCountry>"+
		   "</soapenv:Body>"+
		"</soapenv:Envelope>";
		
		httpConnection.setUseCaches(false);
		httpConnection.setDoOutput(true);
		httpConnection.setRequestMethod("POST");
		httpConnection.setDoInput(true);
		
		
		// Prepare Soap Message via Http
		httpConnection.setRequestProperty("Content-Length",String.valueOf(soapReq.length()));
		httpConnection.setRequestProperty("Content-Type","text/xml; charset=utf-8");
		httpConnection.setRequestProperty("SOAPAction","http://www.webserviceX.NET/GetCitiesByCountry");// "http://localhost:7001/HelloWorldImpl/HelloWorldService");
		//httpConnection.setReadTimeout(1); - Time out
		
		// Write to output
		PrintWriter output = new PrintWriter(httpConnection.getOutputStream(),true);
		output.println(soapReq);
		
		
		// Read response
		BufferedReader response = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
		String line;
		StringBuffer ret = new StringBuffer();
		while ((line = response.readLine()) != null) {
			// Logger.debug(line); // DEBUG ONLY
			ret.append(line);
		}

		output.close();
		response.close();

		System.out.println("Ending Public Web Service" + ret);
		
		
		
		

	}

}
