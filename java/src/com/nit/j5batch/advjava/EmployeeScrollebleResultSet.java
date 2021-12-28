package com.nit.j5batch.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeScrollebleResultSet {

	private static final  String  EMP_SELECT_QUERY="SELECT EID,ENAME,DESG,SALARY FROM EMPLOYEE5";

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "PAPU", "papu");
				PreparedStatement ps=con.prepareStatement(EMP_SELECT_QUERY,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs=ps.executeQuery();
				){
			 if(rs!=null) {
			    System.out.println("RS records top to bottom ");
			    while(rs.next()) {
			    	System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    }
			    System.out.println("----------------------------");
			    System.out.println("RS records bottom to top ");
			    rs.afterLast();
			    while(rs.previous()) {
			    	System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    }
			    System.out.println("------------------------------------");
			    rs.first();
			    System.out.println("First recore");
			    System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    System.out.println("---------------------------------");
			    rs.last();
			    System.out.println("Last recore");
			    System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    System.out.println("---------------------------------");
			    rs.absolute(3);
			    System.out.println("Third recore");
			    System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    System.out.println("---------------------------------");
			    rs.absolute(-2);
			    System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    System.out.println("---------------------------------");
			   rs.relative(1);
			   System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    System.out.println("---------------------------------");
			    rs.relative(-2);
				   System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    System.out.println("---------------------------------");
			    
			    //delete the daa
			    rs.absolute(4);
			    rs.deleteRow();
			    System.out.println("------------------------------------");
			    rs.beforeFirst();
			    while(rs.next()) {
			    	System.out.println(rs.getRow()+"----->"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
			    }

			 }//if
			 
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
