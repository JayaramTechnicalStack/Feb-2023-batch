package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDBConnection {

	public static void main(String[] args) throws SQLException  {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null ;
		
		// select the employee data
		/*
		 * try {
		 * 
		 * Class.forName("com.mysql.jdbc.Driver"); con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/feb2023","root",
		 * "root");
		 * 
		 * st = con.createStatement(); String query = "select * from employee";
		 * ResultSet rs = st.executeQuery(query);
		 * 
		 * while(rs.next()) {
		 * 
		 * System.out.println("employee id is : " +rs.getInt(1)+ " employee name is : "
		 * +rs.getString(2) + " employee salary is : " +rs.getDouble(3)+
		 * " employee address is : " +rs.getString(4)); } rs.close(); }catch (Exception
		 * e) { e.printStackTrace(); }finally { if(con !=null || st !=null) {
		 * st.close(); con.close(); System.out.println("finally block is executed"); } }
		 */
		
		// insert the data into employee table 
		
		/*
		 * try {
		 * 
		 * Class.forName("com.mysql.jdbc.Driver"); con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/feb2023","root",
		 * "root"); st =con.createStatement(); String sqlQuery =
		 * "insert into employee value(6,'Jay',30000,'banagalore')"; int i =
		 * st.executeUpdate(sqlQuery); if(i>0) {
		 * System.out.println("record is inserted successfully"); }else {
		 * System.out.println("record not  inserted"); } }catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		
		// update the employee data 
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/feb2023","root",
		 * "root"); st =con.createStatement(); String sqlQuery =
		 * "update employee set address ='bangalore' where empno=7"; int i =
		 * st.executeUpdate(sqlQuery); if(i>0) {
		 * System.out.println("record is updated successfully"); }else {
		 * System.out.println("record not  updated"); }
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		 // Delete the query 
			/*
			 * try {
			 * 
			 * Class.forName("com.mysql.jdbc.Driver"); con =
			 * DriverManager.getConnection("jdbc:mysql://localhost:3306/feb2023","root",
			 * "root"); st =con.createStatement(); String sqlQuery =
			 * "delete from employee where empno=6"; int i = st.executeUpdate(sqlQuery);
			 * if(i>0) { System.out.println("record is deleted successfully"); }else {
			 * System.out.println("record not  deleted"); }
			 * 
			 * } catch (Exception e) { e.printStackTrace(); }
			 */
		
		// By using PreparedStatement examples 
		
		// insert the data by using PreparedStatement
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feb2023","root", "root");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee id");
			int empId = sc.nextInt();
			System.out.println("Enter employee Name");
			String empName = sc.next();
			System.out.println("Enter employee salary");
			double salary = sc.nextDouble();
			System.out.println("Enter employee address");
			String address = sc.next();
			
			
			String sqlQuery = "insert into employee values(?,?,?,?)";
			// insert into employee values (6,'name',0000,'address');
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, empId);
			ps.setString(2, empName);
			ps.setDouble(3, salary);
			ps.setString(4, address);
		
			int i = ps.executeUpdate();
			if(i>0) {
				System.out.println("record is inserted successfully");
			}else {
				System.out.println("record not inserted ");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		/*
		 * if(con == null) {
		 * System.out.println("Database Connection is not established !"); }else {
		 * System.out.println("Database connection is established!"); }
		 */

	}

}
