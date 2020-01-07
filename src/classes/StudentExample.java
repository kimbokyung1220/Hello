package classes;

public class StudentExample {
	public static void main(String[] args) {
		
		String str = "Hello"; // (=)String str = new String("hello");
		
		Student student = new Student(); // new 키워드로 생성자(Student의) 호출
		student.studentNo = "191234-1234";
		student.studentName = "김철수";
		student.age = 20;
		student.major = "English";
		student.introduce();
		Student student1 = new Student("Yedam", "1234-1234", "박철수");
		student.introduce();
		student.newMethod();
		System.out.println(student.major);
		student.homeWork();
		System.out.println(student);
		

		
	}//over
}
