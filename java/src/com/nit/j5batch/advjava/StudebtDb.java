package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudebtDb {

	private static final String query="INSERT INTO STUDENTDB VALUES(?,?,?,?,?,?)";
	private static boolean newRecord=true;
	public static void main(String[] args) {

		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "PAPU", "papu");
				PreparedStatement ps=con.prepareStatement(query);Scanner scn=new Scanner(System.in);){
			if (con!=null && ps!=null) {
				while (newRecord) {
					System.out.println("Enter the Student Roll Number :: ");
					int rollNumber=scn.nextInt();
					scn.nextLine();
					System.out.println("Enter the Student name :: ");
					String name=scn.nextLine();
					System.out.println("Enter the Student Branch :: ");
					String branch=scn.nextLine();
					System.out.println("Enter the Mathmatics mark :: ");
					float math=scn.nextFloat();
					System.out.println("Enter the Physics mark :: ");
					float physics=scn.nextFloat();
					System.out.println("Enter the English mark :: ");
					float english=scn.nextFloat();
					System.out.println("Enter the Chemistry mark :: ");
					float chimestry=scn.nextFloat();
					System.out.println("Enter the Zoology mark :: ");
					float zoology=scn.nextFloat();
					System.out.println("Enter the Botany mark :: ");
					float botany=scn.nextFloat();
					scn.nextLine();

					//calculate the total and percentage
					float totalMark=math+physics+chimestry+english+zoology+botany;

					float percentage=(totalMark/600)*100;

					String result=null;
					if (percentage>=60) 
						result="First";
					else if(percentage>=50)
						result="Second";
					else if(percentage>=30)
						result="Third";
					else
						result="fail";
					//set the parameter
					ps.setInt(1, rollNumber);
					ps.setString(2, name);
					ps.setString(3, branch);
					ps.setFloat(4, totalMark);
					ps.setFloat(5, percentage);
					ps.setString(6, result);

					//Execute the query
					int count=ps.executeUpdate();
					if(count>0)
						System.out.println("Student recodr saved successfully");
					else
						System.out.println("Studebt daa not saved");
					
					boolean optionSelect=true;
					while(optionSelect) {
						System.out.println("Want to insert more record then press[y/n]");
						String option=scn.nextLine();
						switch (option) {
						case "n": 
							newRecord=false;
							optionSelect=false;
							break;
						case "y":
							newRecord=true;
							optionSelect=false;
							break;
						default:
							System.out.println("Invalid Option");

						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}

