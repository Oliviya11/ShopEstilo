package com.users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull
	private long buyerId;

	@NotNull
	@Size(min = 4, max = 40)
	private String name;

	@NotNull
	@Size(max = 100)
	private String addreess;

	@NotNull
	@Size(max = 25)
	private String mobilePhone;

	@NotNull
	@Email
	private String email;

	@NotNull
	@Size(min = 6)
	private String password;

	public Customer(String name, String mobilePhone, String address) {
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.addreess = address;
	}

	public Customer(@NotNull long buyerId, @NotNull String name, @NotNull String mobilePhone,
				 @NotNull String address, @NotNull String email, @NotNull String password) {
		this.buyerId = buyerId;
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.addreess = address;
		this.email = email;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Buyer [name=" + name + ", addreess=" + addreess + ", mobilePhone=" + mobilePhone + "]";
	}
}