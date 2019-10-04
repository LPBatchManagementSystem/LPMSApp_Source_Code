package com.virtusa.model;

public class MentorModel {
	private String mentorId;
	private String mentorPassword;
	public String getMentorId() {
		return mentorId;
	}
	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorPassword() {
		return mentorPassword;
	}
	public void setMentorPassword(String mentorPassword) {
		this.mentorPassword = mentorPassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mentorId == null) ? 0 : mentorId.hashCode());
		result = prime * result + ((mentorPassword == null) ? 0 : mentorPassword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MentorModel other = (MentorModel) obj;
		if (mentorId == null) {
			if (other.mentorId != null)
				return false;
		} else if (!mentorId.equals(other.mentorId))
			return false;
		if (mentorPassword == null) {
			if (other.mentorPassword != null)
				return false;
		} else if (!mentorPassword.equals(other.mentorPassword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MentorModel [mentorId=" + mentorId + ", mentorPassword=" + mentorPassword + "]";
	}
	
}
