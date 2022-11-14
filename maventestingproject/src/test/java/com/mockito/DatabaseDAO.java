package com.mockito;

public class DatabaseDAO {
	public Object save(String fileName) {
		System.out.println("Saved in database");
		return this;
	}
}


