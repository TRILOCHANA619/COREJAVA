package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CheckUserNameAndPassword {

	public static final String SELECT_QUERY="SELECT USERNAME,PASSWORD FROM EMPLOYEE4 WHERE USERNAME=?";
	public static void main(String[] args) {
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(SELECT_QUERY);
				Scanner scn=new Scanner(System.in)){
			System.out.println("Connection Established to Oracle DataBase");
			System.out.println("Enter the User id :: ");
			String username=scn.nextLine().toLowerCase();     
			System.out.println("Enter the password :: ");
			String password=scn.nextLine();

			//set the parameter
			ps.setString(1, username);

			//execute the query

			ResultSet rs=ps.executeQuery();

			boolean valid=false;

			if (rs!=null) {
				if(rs.next()) {
					if (rs.getString(1).equalsIgnoreCase(username) && rs.getString(2).equals(password)) {
						valid=true;
					}
					/*
					 * if (valid) System.out.println("Valid Creentioal"); else
					 * System.out.println("Invalid Password");
					 */
					System.out.println(valid? "Valid Creentioal":"Invalid Password");
				}else {
					System.out.println("Invalid UserId");
				}
				
					
					
				
			}


		} catch (Exception e) {

			e.printStackTrace();
		}//catch

	}

}
