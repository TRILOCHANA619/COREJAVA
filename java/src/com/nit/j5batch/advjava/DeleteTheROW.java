package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteTheROW {

	//Delete Query
	private static final String DELETE_QUERY="DELETE FROM EMPLOYEE4 WHERE USERNAME=? AND PASSWORD=?";
	
	public static void main(String[] args) {
		
		//getting Conneion, Prepared statement, and Scanner Object
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(DELETE_QUERY);
				Scanner scn=new Scanner(System.in)){
			
			//taking the value from user
			System.out.println("Connection Established to Oracle DataBase");
			System.out.println("Enter the User id :: ");
			String username=scn.nextLine().toLowerCase();     
			System.out.println("Enter the password :: ");
			String password=scn.nextLine();

			//set the parameter
			ps.setString(1, username);
			ps.setString(2, password);

			//execute the query

			int result=ps.executeUpdate();
			
			/*
			 * if (result==0) { System.out.println("invalid userid and password"); } else {
			 * System.out.println("Data deleted"); }
			 */
			
			//validaing the result
			System.out.println( result==0 ? "Invalid userid and password" :"Data deleted");
			
		} catch (Exception e) {
			//shows the exception
			e.printStackTrace();
		}//catch
	}//main
}//class
