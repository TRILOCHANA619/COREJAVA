package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PsInsertIntoEmployee {

	private static final String INSERT_QUERY="INSERT INTO EMPLOYEE4 VALUES(?,?,?)";
	public static void main(String[] args) {
		//try with resources so weno needto close the stream
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(INSERT_QUERY);Scanner scn=new Scanner(System.in)){
			System.out.println("Connection Established to Oracle DataBase");
			System.out.println("Enter the no of employee details u want to insert :: ");
			int count=scn.nextInt();
			scn.nextLine();
			
			for (int i = 1; i <= count; i++) {
				System.out.println("enter the "+i+" Employee name ::");
				String name=scn.nextLine();
				System.out.println("Enter the "+i+" employee id ::");
				int id=scn.nextInt();
				System.out.println("Enter the "+i+" employee salary ::");
				float sal=scn.nextFloat();
				scn.nextLine();
				//set the parameter
				ps.setString(2, name);
				ps.setInt(1, id);
				ps.setFloat(3, sal);
				
				//execute the query
				
				int result=ps.executeUpdate();
				
				//processing the result
				if (result!=0)
					System.out.println(i+" Employee details saved");
				 else
					 System.out.println("Unable to save the details"); 
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}//catch

	}

}
