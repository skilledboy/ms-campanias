package ec.com.dinersclub.dddmodules.application.events.audit.dto;

import java.util.Date;

public class Auditoria {
	
	private String microservice;
	private String method;
	private String date;
	private String request;
	private String response;
	
	public Auditoria() {
		this.date = new Date().toString();
	}

	public String getDate() {
		return date;
	}

	public String getMicroservice() {
		return microservice;
	}

	public void setMicroservice(String microservice) {
		this.microservice = microservice;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
