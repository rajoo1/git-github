package com.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class A {
 @JsonProperty("Command")
 private String Command;
 @JsonProperty("uid")
 private String uid;
 @JsonProperty("B")
 B BObject;
 @JsonProperty("address")
 private String address;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCommand() {
	return Command;
}
public void setCommand(String command) {
	Command = command;
}
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public B getBObject() {
	return BObject;
}
public void setBObject(B bObject) {
	BObject = bObject;
}


 }