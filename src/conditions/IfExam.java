package conditions;

import java.util.Scanner;

public class IfExam {
	public static void main(String[] args) {

		int score = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("==============");
		System.out.println("점수를 입력하세요.>");
		System.out.println("==============");
		score = scanner.nextInt();

		if (score > 90) {
			System.out.println("[ 점수 : " + score + " ] " + "학점 : A ");
		} else if (score > 80) {
			System.out.println("[ 점수 : " + score + " ] " + "학점 : B ");
		} else if (score > 70) {
			System.out.println("[ 점수 : " + score + " ] " + "학점 : C ");
		} else if (score > 60) {
			System.out.println("[ 점수 : " + score + " ] " + "학점 : D ");
		} else {
			System.out.println("[ 점수 : " + score + " ] " + "재시험");
		}

	}

}
