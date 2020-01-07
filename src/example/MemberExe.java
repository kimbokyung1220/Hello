package example;

import java.util.Scanner;

public class MemberExe {
	private static Member[] member = new Member[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 0;
		while (true) {
			System.out.println("=====================================================");
			System.out.println("1.회원가입 | 2.회원수정 | 3.회원삭제 | 4.회원목록 | 5. 종료");
			System.out.println("=====================================================");
			System.out.println("선택해주세요 > ");
			menu = scanner.nextInt();
			scanner.nextLine();

//			if (menu == 1) {
//				createMember();
//			} else if (menu == 2) {
//				modifyMember();
//			} else if (menu == 3) {
//				deleteMember();
//			} else if (menu == 4) {
//				listMember();
//			} else if (menu == 5) {
//				break;
//			}
//		}
//		System.out.println("프로그램이 종료되었습니다.");
//	}
//
//	public static void createMember() {
//
//		System.out.println("*** 회원가입 ***");
//		System.out.println("==============");
//
//		System.out.println("이름 : ");
//		String name = scanner.nextLine();
//		System.out.println("ID : ");
//		String memberId = scanner.nextLine();
//		System.out.println("PASSWORD (숫자만가능합니다) : ");
//		int password = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("핸드폰번호 : ");
//		String phone = scanner.nextLine();
//		
//		Member mem = new Member(name, memberId, password, phone);
//
//		for (int i = 0; i < member.length; i++) {
//			if (member[i] == null) {
//				member[i] = mem;
//				break;
//			}
//		}
//		
//		System.out.println("회원가입 완료!");
	}
	
//
//	public static void modifyMember() {
//		
//		
//		
//		for (Memver mem : member) {
//			if (condition) {
//				System.out.println("*** 회원수정 ***");
//				System.out.println("==============");
//			}
//			
//		}
//		
//
//	}
//
//	public static void deleteMember() {
//		System.out.println("삭제할 ID를 입력하세요");
//		String name = scanner.nextLin();
//		
//
//	}
//
//	public static void listMember() {
//		for (Member mem : member) {
//			if (mem != null) {
//				System.out.println(mem);
//			}
//		}

	}

}
