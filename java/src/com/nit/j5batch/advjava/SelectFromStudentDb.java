package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectFromStudentDb {

	public static final String SELECT_QUERY="SELECT * FROM STUDENTDB WHERE ROLLNO = ?";
	public static void main(String[] args) {
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "PAPU", "papu");
				PreparedStatement ps=con.prepareStatement(SELECT_QUERY);Scanner scn=new Scanner(System.in);){
			if (con!=null && ps!=null) {
				
				System.out.println("Enter the student roll number:: ");
				int rollno=scn.nextInt();
				
				//set parameter
				ps.setInt(1, rollno);
				
				ResultSet rs=ps.executeQuery();
				if (rs!=null) {
					boolean isRecord=false;
					System.out.println("\nThe Student details whos roll number starts with "+rollno+" is shown below\n");
					System.out.println();
					System.out.println("RollNo\tName\tbranch\tTotalMark\tpercentage\tResult");
					while (rs.next()) {
						isRecord=true;
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6));					
					}
					if (isRecord==false)
						System.out.println("No Record Found");
				}//if
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	}


