package classes;

import java.util.Scanner;

public class FriendExe {
	private static Friend[] fArray = new Friend[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 0;
		boolean run = true;
		while (run) {
			System.out.println("==========================");
			System.out.println("1.입력|2.조회|3.리스트|4.종료");
			System.out.println("==========================");
			menu = scanner.nextInt();scanner.nextLine();

			if (menu == 1) {
				inputdata();
			} else if (menu == 2) {
				checkdata();
			} else if (menu == 3) {
				listdata();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	public static void inputdata() {
		int select = 0;
		Friend friend = null; // friend는 if 괄호안에서 정보만 저장되고 괄호를 나오면 사라지기 때문에 배열 friend를 읽기 위해서 따로 맨 위로 빼서 초기값을 설정해주고 선언

		System.out.println("입력");
		System.out.println("==========================");
		System.out.println("1.대학동창|2.회사동료|3.그 외");
		System.out.println("==========================");
		select = scanner.nextInt();
		scanner.nextLine();

		if (select == 1) {
			System.out.println("대학동창");
			System.out.println("=============");
			System.out.println("이름 : ");
			String name = scanner.nextLine();
			System.out.println("번호 : ");
			String phone = scanner.nextLine();
			System.out.println("학교 : ");
			String univ = scanner.nextLine();
			System.out.println("전공 : ");
			String major = scanner.nextLine();

			friend = new UnivFriend(name, phone, univ, major);
			
		} else if (select == 2) {
			System.out.println("회사동료");
			System.out.println("=============");
			System.out.println("이름 : ");
			String name = scanner.nextLine();
			System.out.println("번호 : ");
			String phone = scanner.nextLine();
			System.out.println("회사 : ");
			String company = scanner.nextLine();
			System.out.println("부서 : ");
			String dept = scanner.nextLine();

			friend = new ComFriend(name, phone, company, dept);
			

		} else if (select == 3) {
			System.out.println("그 외");
			System.out.println("=============");
			System.out.println("이름 : ");
			String name = scanner.nextLine();
			System.out.println("번호 : ");
			String phone = scanner.nextLine();

			friend = new Friend(name, phone);

		}

		for (int i = 0; i < fArray.length; i++) {
			if (fArray[i] == null) { // 덮어쓰기 방지 ** null인 값에만 데이터를 넣어라
				fArray[i] = friend;
				break;
			}
		}

		System.out.println("입력완료");
	}

	public static void checkdata() {

		System.out.println("조회");
		System.out.println("=======");
		System.out.println("조회할 친구 이름을 입력하세요");
		String name = scanner.nextLine();
		
		for (int i = 0; i < fArray.length; i++) {
			if (fArray[i] != null && fArray[i].getName().equals(name)) {
				System.out.println(fArray[i]);
			}

		}
	}

	public static void listdata() {
		for (Friend friend : fArray) {
			if (friend != null) {
				friend.introduce();
			}
		}

	}
}
