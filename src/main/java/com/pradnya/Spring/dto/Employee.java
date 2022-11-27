package com.pradnya.Spring.dto;

public class Employee {
	 private String name ;
	 private String mob;
	 private String dept;
	
	 public Employee(String name,String mob,String dept) {
		 System.out.println("Invoking parametrised constructor");
		 this.name = name;
		 this.mob =mob;
		 this.dept = dept;
	 }

	public String getName() {
		return name;
	}

		public String getMob() {
		return mob;
	}

	public String getDept() {
		return dept;
	}
	
}
