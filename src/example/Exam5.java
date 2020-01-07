package example;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;

		
		System.out.println("품명을 입력하세요 : ");
		String item = scanner.nextLine();
		System.out.println("수량을 입력하세요 : ");
		int qty = scanner.nextInt();
		System.out.println("단가를 입력하세요 : ");
		int price = scanner.nextInt();

		compute(item, qty, price);

	}

	public static void compute(String item, int qty, int price) {
		System.out.println("=================");
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + qty * price);
	}
}
