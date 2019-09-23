package com.virtusa.exception;

import com.virtusa.loginUI.UserLogin;

public class UserException extends Exception {
	private String message;
	public UserException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
}
