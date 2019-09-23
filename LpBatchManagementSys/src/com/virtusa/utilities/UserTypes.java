package com.virtusa.utilities;

public enum UserTypes {
	STUDENT("STUDENT");
	private String val;
	private UserTypes(String val) {
		this.val=val;
	}
	public String getVal() {
		return val;	
	}
}
