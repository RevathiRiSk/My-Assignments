package org.student;

import org.department.Department;

public class Student extends Department {

	//Methods   :studentName(),studentDept(),studentId()
	
	public void studentName() {
		System.out.println("Name of the Student: REVATHI");
	}
	public void studentDept() {
		System.out.println("Student Department: B.Sc Comp.Science");
	}
	public void studentId() {
		System.out.println("Student Id: 12CSS0934");
	}
	
	public static void main(String[]args) {
		
		Student course = new Student();
		course.collegeName();
		course.collegeCode();
		course.collegeRank();
		course.deptName();
		course.studentName();
		course.studentId();
		course.studentDept();
	}
	
	
	
	
	
	
}
