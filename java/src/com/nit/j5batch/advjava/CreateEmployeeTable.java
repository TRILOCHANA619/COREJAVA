package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmployeeTable {

	public static void main(String[] args) {
		//try with resources so weno needto close the stream
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PAPU","papu")){
			System.out.println("Connection Established to Oracle DataBase");
			
			Statement st=con.createStatement();
			
			int result=st.executeUpdate("CREATE TABLE EMPLOYEE4 (EID INT,ENAME VARCHAR2(15),ESALARY NUMBER(8,2))");
			
			if (result==0) {
				System.out.println("Table created");
			} else {
				System.out.println("Table not created");

			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}//catch
	}

}
