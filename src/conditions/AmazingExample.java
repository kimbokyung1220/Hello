package conditions;

import java.util.Scanner;

public class AmazingExample {
	public static void main(String[] args) {
		exam03();
	}

	public static void exam03() {
		boolean run = true;
		int balance = 0, menu = 0, amt = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택>");
			menu = scanner.nextInt();
			scanner.nextLine();
			
			if(menu == 1) {
				System.out.println("예금액>");
				amt = scanner.nextInt();
				balance = balance + amt;
			}else if(menu == 2) {
				System.out.println("출금액>");
				amt = scanner.nextInt();
				balance = balance - amt;
			}else if(menu == 3) {
				System.out.println("잔고>" + balance);
			}else if(menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void exam02() {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y < 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void exam01() {
		int num1, num2;
		boolean run = true;
		while (run) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if (num1 + num2 == 5) {
				run = false;
				// or break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
//over