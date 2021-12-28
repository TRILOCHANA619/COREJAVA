package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddTwoColumnInEmployee {

	private static final String ALTER_QUERY="ALTER TABLE EMPLOYEE4 ADD (USERNAME VARCHAR2(20),PASSWWORD VARCHAR2(20))";
	public static void main(String[] args) {
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(ALTER_QUERY);){
			
			int result=ps.executeUpdate();
			System.out.println("column added");
		}catch (Exception e) {
		e.printStackTrace();
		}

	
		}

}
