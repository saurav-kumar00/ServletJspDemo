package com.ServletJsp.web.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ServletJsp.web.Model.Student;

public class StudentDao {
	
	public Student getStudent(int rollno) {
		
		Student s1 = new Student();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "saurav", "skumar");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Student where rollno="+rollno);
			if(rs.next()) {
				s1.setRollno(rs.getInt("ROLLNO"));
				s1.setSname(rs.getString("SNAME"));
				s1.setAge(rs.getInt("AGE"));
				s1.setDiv(rs.getString("DIV"));
				s1.setMarks(rs.getInt("MARKS"));
				
			}
		}catch(Exception e) {
			
		}
		return s1;
	}
}
