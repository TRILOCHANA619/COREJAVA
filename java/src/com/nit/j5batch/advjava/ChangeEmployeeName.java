package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ChangeEmployeeName {

	private static final String UPDATE_QUERY="UPDATE EMPLOYEE5 SET ENAME=? WHERE EID=?";
	private static final String SELECT_QUERY="SELECT ENAME FROM EMPLOYEE5 WHERE EID=?";
	
	public static void main(String[] args) {
		//getting the Scanner,Connection,PreparedStatement object
		try (Scanner scn=new Scanner(System.in);
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(UPDATE_QUERY);
				PreparedStatement ps1=con.prepareStatement(SELECT_QUERY)){
			//getting the data from user
			boolean loop=true;
			while (loop) {
				System.out.println("Enter the Employee ID whome u want to change the name ::");
				int id=scn.nextInt();
				scn.nextLine();
				
				//set the parameter for select query
				
				ps1.setInt(1, id);
				//execute the select query
				
				ResultSet rs=ps1.executeQuery();
				
				if (rs!=null) {
					if (rs.next()) {
						
						loop=false;
						System.out.println("Enter the New Name :: ");
						String name=scn.nextLine();
						
						//set the paarameter
						ps.setString(1, name);
						ps.setInt(2, id);
						
						//execute the query
						 int result=ps.executeUpdate();
						 
						 //checking the result
						 if (result==0) 
							System.out.println("Data didn't update");
						 else 
							System.out.println("Data Updated");
						
					}
				 else {
					 System.out.println("Wrong Employee id\n");
					 

				}
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
