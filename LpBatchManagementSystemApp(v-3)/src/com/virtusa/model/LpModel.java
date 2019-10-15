package com.virtusa.model;

public class LpModel {
	private static  String lpId;
	private String lpPassword;
	
	public static String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getLpPassword() {
		return lpPassword;
	}
	public void setLpPassword(String lpPassword) {
		this.lpPassword = lpPassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lpId == null) ? 0 : lpId.hashCode());
		result = prime * result + ((lpPassword == null) ? 0 : lpPassword.hashCode());
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
		LpModel other = (LpModel) obj;
		if (lpId == null) {
			if (other.lpId != null)
				return false;
		} else if (!lpId.equals(other.lpId))
			return false;
		if (lpPassword == null) {
			if (other.lpPassword != null)
				return false;
		} else if (!lpPassword.equals(other.lpPassword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LpModel [lpId=" + lpId + ", lpPassword=" + lpPassword + "]";
	}
	
}
