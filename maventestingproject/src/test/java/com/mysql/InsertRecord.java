package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=null;
			c=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","Amru@4685");
		    Statement stmt=c.createStatement();
		    System.out.println("Inserting records into the table...");
		    String sql="INSERT INTO EMP2 VALUES (62,'Ammu','Arul', 32)";
		    stmt.executeUpdate(sql);
		    
		    System.out.println("Insert records into the table...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}



