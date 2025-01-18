package com.jspiders.jdbc;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;

	import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;	public class JDBCBatch {
		private static Driver driver;
		private static Connection conn;
		private static PreparedStatement preparedStatement;
		private static String query;
	  
		public static void main(String[] args) throws SQLException {
			try {
				openConnection();
			
			query="Delete from user where id=?";
			preparedStatement=conn.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no.of record to be deleted");
			int record=sc.nextInt();
			for(int i=1;i<=record;i++) {
				System.out.println("Enter user id to be deleted");
				int id=sc.nextInt();
				preparedStatement.setInt(1, id);
				preparedStatement.addBatch();
			}
			sc.close();
			int[]res=preparedStatement.executeBatch();
			int rows=0;
			for(int i : res) {
				if(i!=0)
					rows+=i;
			}
			System.out.println(rows +"row(s) deleted");
		}
			catch(ClassNotFoundException | SQLException e){
				   e.printStackTrace();
			   }
			   finally {
				   try {
				   closeConnection();
				   
			   }
				   catch(SQLException e) {
					   e.printStackTrace();
		  
				   }
			   }
		}
		

		private static void openConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			driver=new com.mysql.cj.jdbc.Driver();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root");
			
		}
		private static void closeConnection() throws SQLException {
			if(preparedStatement !=null)
				preparedStatement.close();
			if(conn !=null)
				conn.close();
			if(driver !=null)
				DriverManager.deregisterDriver(driver);
			
		}
	}

