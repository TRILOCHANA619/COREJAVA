package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PrintSalaryGreaterThan {

	private static final String SELECT_QUERY="SELECT * FROM EMPLOYEE5 WHERE SALARY>?";
	public static void main(String[] args) {
		
		try(Scanner scn=new Scanner(System.in);
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(SELECT_QUERY)) {
			System.out.println("Enter the salary :: ");
			float salary=scn.nextFloat();
			scn.nextLine();
			
			//set the parameter
			ps.setFloat(1, salary);
			
			//execute the query
			
			ResultSet rs=ps.executeQuery();
			
			if (rs!=null) {
				boolean validate=false;
				while (rs.next()) {
					validate=true;
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
				}
				if (!validate) {
					System.out.println("no employee having greater than "+salary+" salary");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
