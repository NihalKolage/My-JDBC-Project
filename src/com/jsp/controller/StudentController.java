package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student student=new Student();
       
       student.setId(6);
       student.setName("Vishal");
       student.setEmailID("vishal35@gmail.com");
       student.setGender("male");
       student.setContact(754378906);
       StudentDao studentDao=new StudentDao();
      
       studentDao.saveStudent(student);
       
     
	}

}
