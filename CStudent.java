package com.inheri;

class CStudent{
	
	private int Student_id;
	private String 	Student_name;
	
	public int getStudentid() {
		
		return Student_id;
	}	
	public String getStudentname() {
		
		return Student_name;
	}	
	public void setStudentid(int Student_id) {
		
		this.Student_id = Student_id;
	}	
public void setStudentname(String Student_name) {
		
		this.Student_name = Student_name;
	}	
}
public class Manager4 {

	public static void main(String[] args) {
		CStudent student = new CStudent();
		
		student.setStudentid(1001);
		
		System.out.println(student.getStudentid());
		
		student.setStudentname("Elayaraja");
		
		System.out.println(student.getStudentname());
		

	}

}