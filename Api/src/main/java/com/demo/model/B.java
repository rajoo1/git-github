package com.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class B {
 @JsonProperty("username")
 private String username;
 @JsonProperty("password")
 private String password;
 @JsonProperty("adrressDetails")
 private String adrressDetails; 
 
public String getAdrressDetails() {
	return adrressDetails;
}
public void setAdrressDetails(String adrressDetails) {
	this.adrressDetails = adrressDetails;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
}