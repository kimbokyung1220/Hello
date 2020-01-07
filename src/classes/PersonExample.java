package classes;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {

		Person person = new Person();
		person.name = "bobo";
		person.age = 25;
		person.birthday = "12/20";
		person.jop = "student";

		Person person1 = new Person();
		person1.name = "jia";
		person1.age = 27;
		person1.birthday = "8/6";
		person1.jop = "student";

		Person[] personAry = new Person[2];
		personAry[0] = person;
		personAry[1] = person1;

		for (int i = 0; i < 2; i++) {
			personAry[i].introduce();

		}
		System.out.println("-------------");

		/*
		 * 확장 for for ( 클래스명 변수이름 : 배열의 이름 [<-배열의 이름이 갖고있는 인덱스 수 만큼 돈다] ) 변수이름.메소드이름();
		 */
		for (Person a : personAry) {
			a.introduce();
		}
		System.out.println("-------------");

		System.out.println("이름을 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		for (Person a : personAry) {
			if (a.name.equals(name)) {
				a.introduce();
			}

		}
		System.out.println("종료");

	}

}//over
