package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControlerUpdate {
public static void main(String[] args) {
	Student student=new Student();
     student.setName("Nirvithi");
     student.setEmailID("nirvith5664@gmail.com");
     student.setId(4);
     
     
     StudentDao studentDao=new StudentDao();
     studentDao.updateStudent(student);
}
}
