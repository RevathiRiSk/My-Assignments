package multipleStudent_info;

public class StudentInfo{
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " +id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student Name: " +name);
		System.out.println("Student ID: " +id);
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Student Email: " +email );
		System.out.println("Student phoneNumber: " +phoneNumber);
	}
	
	public static void main(String[]args) {
		StudentInfo student = new StudentInfo();
		student.getStudentInfo(12234);
		System.out.println("*******");
		student.getStudentInfo(23434, "Mohan");
		System.out.println("*******");
		student.getStudentInfo("redf@gmail.com", 232452254);
	}
	
	
	
	
	
	
	
	
	
}