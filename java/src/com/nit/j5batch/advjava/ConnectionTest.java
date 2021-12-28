package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	

	public static void main(String[] args) {
		//try with resources so weno needto close the stream
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu")){
			System.out.println("Connection Established to Oracle DataBase");
		} catch (Exception e) {
			System.out.println("Connection not established to DataBase");
			e.printStackTrace();
		}//catch
	}//main
}//class
