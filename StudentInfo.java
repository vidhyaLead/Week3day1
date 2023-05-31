package org.student;
public class StudentInfo {
	public void getstudinfo() {
		int marks = 50;
		System.out.println(marks);
	}
	public void getstudinfo(int id, String name) {
		
		System.out.println(id+" " +name);
	}
	public void getstudinfo(Long ph, String email) {
		
		System.out.println(ph+" " +email);
	}
	public static void main(String[] arg) {
		StudentInfo info = new StudentInfo();
		info.getstudinfo();
		info.getstudinfo(12345, "Siva");
		info.getstudinfo(1234567890L, "Check@gmail.com");
		
		
	}
}
