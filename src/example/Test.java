package example;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name;
		int kor = 0, mat = 0, eng = 0;
	
		
		System.out.println("이름을입력하세요 > ");
		name = scanner.nextLine();
		System.out.println("국어점수 : ");
		kor = scanner.nextInt();
		System.out.println("수학점수 : ");
		mat = scanner.nextInt();
		System.out.println("영어점수 : ");
		eng = scanner.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		
		System.out.println("합계점수 : " + sum);
		System.out.printf("평균점수 : " + "%.1f", avg);
		
	}

}
