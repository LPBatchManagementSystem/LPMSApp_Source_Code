package com.virtusa.entities;

public class Lp {
	private String first_Name;
	private String last_Name;
	private int DOB;
	private long phone_number;
	private String email_Id;
	private String role_type;
	private String batch_name;
	
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getRole_type() {
		return role_type;
	}
	public void setRole_type(String role_type) {
		this.role_type = role_type;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	@Override
	public String toString() {
		return "Lp [first_Name=" + first_Name + ", last_Name=" + last_Name + ", DOB=" + DOB + ", phone_number="
				+ phone_number + ", email_Id=" + email_Id + ", role_type=" + role_type + ", batch_name=" + batch_name
				+ "]";
	}
	
}
