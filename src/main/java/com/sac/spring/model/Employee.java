package com.sac.spring.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class Employee implements Serializable {

	private static final long serialVersionUID = -7788619177798333712L;

	private int id;
	private String name;
	private String lastName;

	public Employee(int id, String name, String lastName) {

		this.id = id;
		this.name = name;
		this.lastName = lastName;
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

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
	}

}
