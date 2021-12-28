// SelectFromEmployee.java
package com.nit.j5batch.advjava;
// Importing all the object for the required class
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
 // JDBC application for getting the Employee Details based on Initial Characters of Employee Name 
public class NoOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SelectFromEmployee.main()");
		Scanner scn=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			scn = new Scanner(System.in);
			//Reading the Input
			
			// converting the input to the according to the SQL Query
			
			
			//register the Driver by loading the JDBC dricer class
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Establishing connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","papu","PAPU");
			
			//Create Statement Object
			if (con!=null) {
				System.out.println("\nConnection Establisted\n");
				st=con.createStatement();
			}
			// prepare the SQL query
			//SELECT EMPNO,ENMAE,JOB,SAL EMPLOYEE WHERE ENAME LIKE 'T%'
			String query="SELECT CON(*) FROM EMPLOYEE ";
			System.out.println("The Sql Query is:- "+query);
			
			//prepare the ResultSet object
			// and
			//Send and Execute the query in DBs
			
			if (st!=null)
				rs=st.executeQuery(query);
				
			//process the ResultSet
				
			if (rs!=null) {
				boolean isRecord=false;
				if(rs.next()) {
					isRecord=true;
					System.out.println("The no of employee are "+rs.getInt(1));					
				}else
					System.out.println("No Record Found");
			}//if
			
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
		finally {
			try { // to close ResultSet JDBC object
				if (rs!=null)
					rs.close();
			} catch (SQLException se) {
				// TODO: handle ResultSet exception
				se.printStackTrace();
			}
			try { // to close Statement JDBC object
				if (st!=null)
					st.close();
			} catch (SQLException se) {
				// TODO: handle ResultSet exception
				se.printStackTrace();
			}
			try { // to close Connection JDBC object
				if (con!=null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle ResultSet exception
				se.printStackTrace();
			}
			try { // to close Scanner object
				if (scn!=null)
					scn.close();
			} catch (Exception e) {
				// TODO: handle ResultSet exception
				e.printStackTrace();
			}
		}//finally
	}//main
}//class
