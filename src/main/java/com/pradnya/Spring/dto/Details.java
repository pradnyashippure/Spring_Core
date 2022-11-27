package com.pradnya.Spring.dto;

public class Details {
	private int id;
	private String name;
	private String email;
	
	public Details() {
		System.out.println("Invoking"+this.getClass().getSimpleName()+"constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Details [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
