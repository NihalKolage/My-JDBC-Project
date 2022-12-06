package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student student=new Student();
     student.setId(5);
     StudentDao st=new StudentDao();
     st.delete(student);
	}

}
