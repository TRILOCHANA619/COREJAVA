package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TransactionPreparedStatement2 {

	//query
	private static final String UPDATE_SENDER="UPDATE ACCOUNT_DETAILS SET BALANCE=BALANCE+? WHERE ACCNO=?";
	private static final String SELECT_QUERY="SELECT ACCNO,AHNAME,BALANCE FROM  ACCOUNT_DETAILS WHERE ACCNO=?";
	
	
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
				PreparedStatement prepareStatementSelect=con.prepareStatement(SELECT_QUERY)){
			
			
			//setting the auto commit false
			con.setAutoCommit(false);
			
			//set parameter
			prepareStatementSelect.setInt(1, eids);
			ResultSet rs=prepareStatementSelect.executeQuery();
			System.out.println("\n Before Transfering the money");
			if (rs!=null) {
				if (rs.next()) {
					float balance=rs.getFloat(3);
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					//set parameter
					prepareStatementSelect.setInt(1, eidr);
					rs=prepareStatementSelect.executeQuery();
					if (rs!=null) {
						if (rs.next()) {
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
							
							if(balance>amount) {
								
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
							
							System.out.println("\nAfter the Transfering the money");
							
							}else
								System.out.println("InSufficient mmount");
						}else {
							System.out.println("Invalid Reciever accoout number");
						}
						//set the parameteer
						prepareStatementSelect.setInt(1, eids);
						rs=prepareStatementSelect.executeQuery();
						rs.next();
						
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
						prepareStatementSelect.setInt(1, eidr);
						rs=prepareStatementSelect.executeQuery();
						rs.next();
						
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					}
				}else {
					System.out.println("Invalid Sender accoout number");
				}
			}
			
			scn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
