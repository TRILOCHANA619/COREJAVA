package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class InsertSelectFromStudent {

	private static final String SELECT_QUERY="SELECT SNO,SNAME,SADD,AVG  FROM STUDENT WHERE SNO=?";
	private static final String INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?,?)";
	public static void main(String[] args) {
		//try with resources so weno needto close the stream
				try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
						PreparedStatement ps=con.prepareStatement(SELECT_QUERY);
						PreparedStatement ps_one=con.prepareStatement(INSERT_QUERY);
						Scanner scn=new Scanner(System.in)){
					System.out.println("Connection Established to Oracle DataBase");
					System.out.println("""
							Press 1 for insert the data to student table 
							Press 2 for select  the data from student by roll number
							""");
					int option=scn.nextInt();
					scn.nextLine();
					ResultSet rs=null;
					switch (option) {
					case 1:
					 System.out.println("Ente the student roll numbeer :: ");
					 int rollno=scn.nextInt();
					 scn.nextLine();
					 System.out.println("Ente the student name :: ");
					 String name=scn.nextLine();
					 
					 System.out.println("Ente the student Address :: ");
					 String address=scn.nextLine();
					 System.out.println("Ente the student Age :: ");
					 int age=scn.nextInt();
					 
					 //set the value
					 ps.setInt(1, rollno);
					 ps.setString(2, name);
					 ps.setString(3, address);
					 ps.setInt(4, age);
					 
					 //execute the query
					 int count=ps.executeUpdate();
					 
					 if (count==0) 
							System.out.println("\n Student details not inseted");
						else 
							System.out.println("\nStudent details inseerted");
						break;
					case 2:
						System.out.println("Enter the Student roll Number ::");
						int id=scn.nextInt();
						// set the parameter
						ps_one.setInt(1, id);
						
						rs=ps.executeQuery();
						if (rs!=null) {
							if (rs.next()) {
								System.out.println("ROllnumber \t name \t address \t age");
								System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3)+" \t "+rs.getInt(4));
								
							}//if
							else 
								System.out.println(" Enter Student ID is wrong");
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
