package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteQueryFromUser {

	public static void main(String[] args) {
		
		//getting the Scanner,Connection,Statement object
		try(Scanner scn=new Scanner(System.in);
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				Statement statement=connection.createStatement()) {
			//geetting the query from user
			System.out.println("Enter the query :: ");
			String query=scn.nextLine();
			
			//execute the query througn execute() method
			
			boolean result=statement.execute(query);
			
			ResultSet rs=null;
			if (result==true) {
				System.out.println("Executed the SELECT QUERY ");
				rs= statement.getResultSet();
				if (rs!=null) {
					while(rs.next()) {
						System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));	
					}
				}//if
			} else {
				int count=statement.getUpdateCount();
				System.out.println("the no of  row affected is :: " +count);
			}
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
