package com.frank.pojo;

public class Birthday
{
	private String birthday;

	public Birthday(String birthday) {
		super();
		this.birthday = birthday;
	}

	public Birthday() {
		super();
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return this.birthday;
	}
	
}
