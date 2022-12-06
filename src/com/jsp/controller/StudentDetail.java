package com.jsp.controller;

import java.sql.SQLException;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentDetail {
	public static void main(String[] args) throws SQLException {
		Student student=new Student();
		
		StudentDao st=new StudentDao();
		st.displayAll(student);
		
	}

}
