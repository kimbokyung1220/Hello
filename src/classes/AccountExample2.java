package classes;

import java.util.Scanner;

public class AccountExample2 {
	private static Account[] account = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 1;
		while (true) {
			System.out.println("=============================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("=============================================");
			System.out.println("선택>");
			menu = scanner.nextInt();
			scanner.nextLine();
//			scanner.nextLine();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				listAccount();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void createAccount() {

		System.out.println("=============");
		System.out.println("계좌를 생성합니다.");
		System.out.println("=============");

		System.out.println("이름(계좌주)을 입력하세요 : ");
		String owner = scanner.nextLine();
		System.out.println("계좌번호를 입력하세요 : ");
		String ano = scanner.nextLine();
		System.out.println("금액을 입력하세요");
		int balance = scanner.nextInt();
//		System.out.println("비밀번호를 입력하세요 : ");
//		int password = scanner.nextInt();
		Account acnt = new Account(ano, owner, balance);

		for (int i = 0; i < account.length; i++) {
			if (account[i] == null) {
				account[i] = acnt;
				break;
			}

		}

		System.out.println("계좌가 생성되었습니다." + "[ 금액 : " + balance + " ] ");
	}

	public static void listAccount() {
		for (Account acnt : account) {
			if (acnt != null) {
				System.out.println(acnt);
			}
		}
	}

	public static void deposit() {
		System.out.println("=======");
		System.out.println("예금");
		System.out.println("=======");

		System.out.println("조회할 계좌번호를 입력하세요");
		String ano = scanner.nextLine();
		System.out.println("예금액을 입력하세요");
		int money = scanner.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance(); // 현 잔고
		accnt.setBalance(balance + money);

		if (account != null) {

		}
		System.out.println("예금되었습니다" + "[ 계좌번호 : " + ano + " / " + " 현재금액 : " + (balance + money) + " ]");

	}

	static void withdraw() {
		System.out.println("=======");
		System.out.println("출금");
		System.out.println("=======");

		System.out.println("조회할 계좌번호를 입력하세요");
		String ano = scanner.nextLine();
		System.out.println("출금액을 입력하세요");
		int money = scanner.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance(); // 현 잔고
		accnt.setBalance(balance - money);

		if (account != null) {

		}
		System.out.println("출금되었습니다" + "[ 계좌번호 : " + ano + " / " + " 현재금액 : " + (balance - money) + " ]");

	}

	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : account) {
			if (acnt != null) { // 배열을 사용할때 null여부 체크!!!!!
				if (ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
				}

			}

		}
		return accnt;
	}
	//over
}