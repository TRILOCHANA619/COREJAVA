package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectFromEmployee {

	private static final String SELECT_QUERY="SELECT EID,ENAME,ESALARY FROM EMPLOYEE4";
	private static final String SELECT_QUERY_ATONCE="SELECT EID,ENAME,ESALARY FROM EMPLOYEE4 WHERE EID= ?";
	public static void main(String[] args) {
		//try with resources so weno needto close the stream
				try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
						PreparedStatement ps=con.prepareStatement(SELECT_QUERY);
						PreparedStatement ps_one=con.prepareStatement(SELECT_QUERY_ATONCE);
						Scanner scn=new Scanner(System.in)){
					System.out.println("Connection Established to Oracle DataBase");
					System.out.println("""
							Press 1 for select all the data from employee table 
							Press 2 for select  the data from employee table  at once
							""");
					int option=scn.nextInt();
					scn.nextLine();
					ResultSet rs=null;
					switch (option) {
					case 1:
					 rs=ps.executeQuery();
					if (rs!=null) {
						boolean isRecord=false;
						System.out.println("All employee details are :: ");
						System.out.println("eid \t ename \t esalary");
						while (rs.next()) {
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));					
						}
						
					}//if
						break;
					case 2:
						System.out.println("Enter the employee id ::");
						int id=scn.nextInt();
						// set the parameter
						ps_one.setInt(1, id);
						
						rs=ps.executeQuery();
						if (rs!=null) {
							if (rs.next()) {
								System.out.println("eid \t ename \t esalary");
								System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+rs.getFloat(3));
								
							}//if
							else 
								System.out.println(" Enter person ID is wrong");
						}//else
						break;
					default:
						System.out.println("No such option available");
						break;
					}
					
					
					
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}//catch

		

	}

}
