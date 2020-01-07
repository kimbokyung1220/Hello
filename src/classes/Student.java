package classes;

public class Student {
	// 필드
	String university;
	String studentNo;
	String studentName;
	String major;
	int age;

	// 생성자
	Student() {

	}
	Student(String universety, String studentName, String studentNo) {
		this.university = university;
		this. studentName = "Yedam";
		this.studentNo = "1234-1234";
	
	}
	
	// 메소드
	void newMethod() {
		System.out.println();
		
	}
	void introduce() {
		System.out.println("학번 : " + studentNo + " 이름 : " + studentName );
	}

	void study() {
		System.out.println("공부한다");
	}

	void basketBall() {
		System.out.println("농구한다");
	}

	void homeWork() {
		System.out.println("숙제한다");

	}
}//over
