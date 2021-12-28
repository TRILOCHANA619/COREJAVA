package com.nit.j5batch.advjava;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBC_RowSet_Program {

	public static void main(String[] args) {
		try {
			JdbcRowSet jrs=RowSetProvider.newFactory().createJdbcRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			jrs.setUsername("PAPU");
			jrs.setPassword("papu");
			jrs.setCommand("SELECT * FROM EMPLOYEE5");
			//execute the command
			jrs.execute();
			
			//getting the value
			while (jrs.next()) {
				
				System.out.println(jrs.getString(1)+"\t"+jrs.getString(2)+"\t"+jrs.getString(3)+"\t"+jrs.getString(4));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
