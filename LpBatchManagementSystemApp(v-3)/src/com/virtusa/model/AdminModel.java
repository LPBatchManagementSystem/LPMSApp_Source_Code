package com.virtusa.model;

public class AdminModel {
	private static String adminId;
	private String AdminPassword;
	public static String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AdminPassword == null) ? 0 : AdminPassword.hashCode());
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
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
		AdminModel other = (AdminModel) obj;
		if (AdminPassword == null) {
			if (other.AdminPassword != null)
				return false;
		} else if (!AdminPassword.equals(other.AdminPassword))
			return false;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AdminModel [adminId=" + adminId + ", AdminPassword=" + AdminPassword + "]";
	}
	
}
