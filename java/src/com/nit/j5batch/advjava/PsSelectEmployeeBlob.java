package com.nit.j5batch.advjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PsSelectEmployeeBlob {
	
	public static final String SELECT_QUERY="SELECT EID,ENAME,DESG,SALARY,PHOTO FROM EMPLOYEE5 WHERE EID=?";

	public static void main(String[] args) {
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(SELECT_QUERY);Scanner scn=new Scanner(System.in)){
			System.out.println("Connection Established to Oracle DataBase");
			System.out.println("Enter the no of employee id :: ");
			int id=scn.nextInt();
			scn.nextLine();
			
			
			
			//set the parameter
			ps.setInt(1, id);
			
			FileOutputStream fos=new FileOutputStream("D:/dog.jpg");
			//execute te query
			ResultSet rs=ps.executeQuery();
			
			
			if (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
				fos.write(5);
			}else 
				 System.out.println("No data found");

			

			
			scn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
