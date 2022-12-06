package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
	public void saveStudent(Student student) {
		String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		
		 connection=helperClass.getConnection();
		
		try {

			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmailID());
			preparedStatement.setString(4, student.getGender());
			preparedStatement.setLong(5, student.getContact());
			
			preparedStatement.execute();
			if(connection!=null) {
				connection.close();
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void updateStudent(Student student) {
			
			String sql="UPDATE student set Name=? ,emailId=?WHERE id=? ; ";
			 Connection connection=helperClass.getConnection();
			 
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1,student.getName());
				preparedStatement.setString(2,student.getEmailID());
				preparedStatement.setInt(3,student.getId() );
			    
				int n = preparedStatement.executeUpdate();
				if(n>0) {
					System.out.println("update");
				}
				connection.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
		public void delete(Student student) {
			String sql="Delete from student where id=?";
			Connection connection= helperClass.getConnection();
			
			try {
				PreparedStatement preparedStatement =connection.prepareStatement(sql);
				preparedStatement.setInt(1, student.getId());
				int n=preparedStatement.executeUpdate();
				if(n>0) {
					System.out.println("Succesfull");
				}else {
					System.out.println("Not succesfull");
				}
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void displayAll(Student student) throws SQLException {
			String sql="SELECT * FROM student";
		
			Connection connection=helperClass.getConnection();
			 try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				ResultSet resultSet=preparedStatement.executeQuery();
				
				while(resultSet.next()) {
			       System.out.println("==================================");
			       System.out.println(resultSet.getInt(1));
			       System.out.println(resultSet.getString(2));
			       System.out.println(resultSet.getString(3));
			       System.out.println(resultSet.getString(4));
			       System.out.println(resultSet.getLong(5));
			       System.out.println("===================================");
			       
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 connection.close();
		}

}
