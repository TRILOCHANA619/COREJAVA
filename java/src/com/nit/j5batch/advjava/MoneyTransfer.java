package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MoneyTransfer {

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
				Statement st=con.createStatement()){
			
			//setting the auto commit false
			con.setAutoCommit(false);
			
			//adding query to batch
			st.addBatch("UPDATE EMPLOYEE5 SET SALARY=SALARY-"+amount+"WHERE EID="+eids);
			
			st.addBatch("UPDATE EMPLOYEE5 SET SALARY=SALARY+"+amount+"WHERE EID="+eidr);
			
			//exxecute t he query
			int result[]=st.executeBatch();
			
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
