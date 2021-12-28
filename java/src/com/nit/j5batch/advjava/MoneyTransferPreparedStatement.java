package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MoneyTransferPreparedStatement {

	//query
	private static final String UPDATE_SENDER="UPDATE EMPLOYEE5 SET SALARY=SALARY+? WHERE EID=?";
	
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		//Get data from user
		System.out.println("Enter the employee id of person to send the money :: ");
		int eids=scn.nextInt();
		System.out.println("Enter the employee id of person who recieve the money :: ");
		int eidr=scn.nextInt();
		System.out.println("Enter the amount :: ");
		float amount=scn.nextFloat();
		
		//get the connection
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu");
				PreparedStatement prepareStatement=con.prepareStatement(UPDATE_SENDER);
				){
			
			//setting the auto commit false
			con.setAutoCommit(false);
			
			//set parameter
			
			prepareStatement.setFloat(1, -amount);
			prepareStatement.setInt(2, eids);
			
			prepareStatement.addBatch();
			
			prepareStatement.setFloat(1, amount);
			prepareStatement.setInt(2, eidr);
			
			prepareStatement.addBatch();
			
			//exxecute t he query
			int result[]=prepareStatement.executeBatch();
			
			//validate and commit the result
			
			boolean flag=true;
			int sum=0;
			for (int i = 0; i < result.length; i++) {
				sum=sum+result[i];
				if (result[i]==0) {
					flag=false;
					
					break;
				}//if
			}//for
			if (flag==true) {
				con.commit();
				System.out.println("Money transfer Completed. Check the balance");
				
				
			} else {
				con.rollback();
				System.out.println("Money Transfer faied");
				
			}//if

			
			scn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
