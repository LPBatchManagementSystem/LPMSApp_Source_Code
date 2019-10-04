package com.virtusa.entities;

public class LpBatchs {
	private String batch_Id;
	private String batch_name;
	private int batch_Capacity;
	private String batch_Mentor_Id;
	private String batch_Venue_Id;
	private String batch_StartDate;
	private int batch_Status;
	public String getBatch_Id() {
		return batch_Id;
	}
	public void setBatch_Id(String batch_Id) {
		this.batch_Id = batch_Id;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public int getBatch_Capacity() {
		return batch_Capacity;
	}
	public void setBatch_Capacity(int batch_Capacity) {
		this.batch_Capacity = batch_Capacity;
	}
	public String getBatch_Mentor_Id() {
		return batch_Mentor_Id;
	}
	public void setBatch_Mentor_Id(String batch_Mentor_Id) {
		this.batch_Mentor_Id = batch_Mentor_Id;
	}
	public String getBatch_Venue_Id() {
		return batch_Venue_Id;
	}
	public void setBatch_Venue_Id(String batch_Venue_Id) {
		this.batch_Venue_Id = batch_Venue_Id;
	}
	public String getBatch_StartDate() {
		return batch_StartDate;
	}
	public void setBatch_StartDate(String batch_StartDate) {
		this.batch_StartDate = batch_StartDate;
	}
	public int getBatch_Status() {
		return batch_Status;
	}
	public void setBatch_Status(int batch_Status) {
		this.batch_Status = batch_Status;
	}
	@Override
	public String toString() {
		return "LpBatchs [batch_Id=" + batch_Id + ", batch_name=" + batch_name + ", batch_Capacity=" + batch_Capacity
				+ ", batch_Mentor_Id=" + batch_Mentor_Id + ", batch_Venue_Id=" + batch_Venue_Id + ", batch_StartDate="
				+ batch_StartDate + ", batch_Status=" + batch_Status + "]";
	}
	
}
