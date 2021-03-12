package com.sample.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionModel {

	@JsonProperty("status")
	private String status;

	@JsonProperty("cause")
	private String cause;
	
	public ExceptionModel(String cause) {
		this.status = "EXCEPTION";
		this.cause = cause;
	}

	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }

	public String getCause() { return cause; }
	public void setCause(String cause) { this.cause = cause; }

}
