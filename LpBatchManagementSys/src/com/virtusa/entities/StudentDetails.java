package com.virtusa.entities;

public class StudentDetails {
	private int studentDetailsId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	public int getStudentDetailsId() {
		return studentDetailsId;
	}
	public void setStudentDetailsId(int studentDetailsId) {
		this.studentDetailsId = studentDetailsId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentDetails [studentDetailsId=" + studentDetailsId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
}
