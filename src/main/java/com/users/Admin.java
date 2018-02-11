package com.users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Admin {
	@NotNull
	@Size(min = 4, max = 40)
	private String name;
	@NotNull
	@Email
	private String email;

	public Admin(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", email=" + email + "]";
	}
}
