package com.nit.j5batch.advjava;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PsInsertEmployeeBlob {
	
	public static final String INSERT_QUERY="UPDATE EMPLOYEE5 SET PHOTO=? WHERE EID=?";

	public static void main(String[] args) {
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(INSERT_QUERY);Scanner scn=new Scanner(System.in)){
			System.out.println("Connection Established to Oracle DataBase");
			System.out.println("Enter the no of employee id :: ");
			int id=scn.nextInt();
			scn.nextLine();
			System.out.println("Enter the photo location :: ");
			String location=scn.nextLine();
			
			//getting the photo
			FileInputStream fis=new FileInputStream(location);
			
			//set the parameter
			ps.setInt(2, id);
			ps.setBlob(1, fis);
			
			//execute te query
			int count=ps.executeUpdate();
			
			if (count==0) 
				System.out.println("Photo not inserted");
			 else 
				 System.out.println("Photo inserted");

			

			fis.close();
			scn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
