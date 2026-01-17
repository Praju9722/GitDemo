package com.Exponent.UserManagement.Entity;

public class User {
	String Uid;
	String Uname;
	String Uadress;
	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		Uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUadress() {
		return Uadress;
	}
	public void setUadress(String uadress) {
		Uadress = uadress;
	}
	@Override
	public String toString() {
		return "User [Uid=" + Uid + ", Uname=" + Uname + ", Uadress=" + Uadress + "]";
	}

}
