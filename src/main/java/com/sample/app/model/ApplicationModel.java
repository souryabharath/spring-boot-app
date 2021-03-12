package com.sample.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="user_details")
public class ApplicationModel {

	@JsonProperty("userName")
	@Id
	private String userName;
	
	@JsonProperty("organization")
	private String organization;
	
	@JsonProperty("address")
	private String address;

	public String getUserName() { return userName; }
	public ApplicationModel setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getOrganization() { return organization; }
	public ApplicationModel setOrganization(String organization) {
		this.organization = organization;
		return this;
	}

	public String getAddress() { return address; }
	public ApplicationModel setAddress(String address) {
		this.address = address;
		return this;
	}
	
	@Override
	public String toString() {
		return "ApplicationModel [userName=" + userName + ", organization=" + organization + ", address=" + address
				+ "]";
	}

}
