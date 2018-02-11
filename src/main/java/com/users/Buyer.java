package com.users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Buyer {
	@NotNull
	@Size(min = 4, max = 40)
	private String name;
	@NotNull
	@Size(max = 100)
	private String addreess;
	@NotNull
	@Size(max = 25)
	private String mobilePhone;
	@Email
	private String email;

	public Buyer(String name, String mobilePhone, String address) {
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.addreess = address;
	}

	public Buyer(String name, String mobilePhone, String address, String email) {
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.addreess = address;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddreess() {
		return addreess;
	}

	public void setAddreess(String addreess) {
		this.addreess = addreess;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Buyer [name=" + name + ", addreess=" + addreess + ", mobilePhone=" + mobilePhone + "]";
	}
}
