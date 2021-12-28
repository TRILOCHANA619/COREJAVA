package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectEmployeeDetailsEndWithGivenCharacter {

	//SELECT EMPNO,ENMAE,JOB,SAL EMPLOYEE WHERE ENAME LIKE '%T'
	private static final String SELECT_QUERY="SELECT EMPNO,ENAME,JOB,SAL FROM EMPLOYEE WHERE ENAME LIKE ? ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SelectFromEmployee.main()");
		Scanner scn=null;

		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement ps=con.prepareStatement(SELECT_QUERY)){
			scn = new Scanner(System.in);
			//Reading the Input
			String initChar=null;
			if (scn!=null) {
				System.out.print("Enter the End Character Of the Name: ");
				initChar=scn.next().toUpperCase();// given T
			}
			// converting the input to the according to the SQL Query
			initChar="%"+initChar;// 'T%'



			//Establishing connection


			//Create Statement Object
			if (con!=null) {
				System.out.println("\nConnection Establisted\n");

			}
			// prepare the SQL query





			//set the parameter
			ps.setString(1, initChar);

			if (ps!=null)
				try(ResultSet rs=ps.executeQuery();){

					//process the ResultSet

					if (rs!=null) {
						boolean isRecord=false;
						System.out.println("\nThe Employee details whos name starts with "+initChar+" is shown below\n");
						while (rs.next()) {
							isRecord=true;
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));					
						}
						if (isRecord==false)
							System.out.println("No Record Found");
					}//if

				}//try2
		}//try 
		catch (SQLException se) {
			// TODO: handle sql exception
			if (se.getErrorCode() >= 900 && se.getErrorCode()<=999)
				System.out.println("\nInvalid col names or table names or SQL keywords");
			se.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle unknown  exception
			e.printStackTrace();
		}


	}
}
