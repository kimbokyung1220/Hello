package classes;

public class Person {
	//필드
	String name;
	String birthday;
	String jop;
	int age;
	
	//생성자 
	Person() {
	
	}
	
	//메소드
	Person(String name, String birthday) { 
		this.name = name;
		this.birthday = birthday;
	}
	
	void introduce() {
		System.out.println("이름은 " + name + " 이고, " 
						+ " 생일은 " + birthday + "입니다.");
	}
}
//over