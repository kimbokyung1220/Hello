package classes;

public class MethodEcample1 {
	public static void main(String[] args) {
		showName(); //매게값이 없는 메소드
		showName("DongDong");
		showAge(30);
	}
	//메소드 오버로딩 : 메소드의 이름을 반복해서 쓰는 것
	// -> 메소드 이름은 같지만 매게값이 달라서 매게값으로 구분한다.
	public static void showName() {
		System.out.println("Hello, I am Bobo");
	}
	public static void showName(String name) {
		System.out.println("Hello, I am " + name);
	}
	public static void showAge(int age) {
		System.out.println("Hello, I am " + age + "year old");
	}

}
//over