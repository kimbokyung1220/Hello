package classes;

import java.util.Scanner;

public class MemberExample {
	Member[] memberAry = new Member[3];
	Scanner sc = new Scanner(System.in);

	public void execute() {
		int cnt = 0, menu = 1;
		while (true) {
			System.out.println("====================");
			System.out.println("1.생성2.조회3.리스트4.종료");
			System.out.println("====================");
			System.out.println("선택>");
			menu = sc.nextInt();
			sc.nextLine(); // 숫자만 읽어옴 , 엔터를 읽어옴

			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				searchMember();
			} else if (menu == 3) {
				listMember();
			} else if (menu == 4) {
				break;
			}

//       cnt++;
//       if (cnt == 3)
//          for(Member m : memberAry) {
//             System.out.println(m);
//          }
//          break;
//      static > 메인이 고정되었다는 뜻
		}
		System.out.println("프로그램 종료");
	}

	public void searchMember() {
		System.out.println("id입력하세요");
		String inputId = sc.nextLine(); // enter를 읽어옴
		System.out.println("pw입력하세요");
		String inputPw = sc.nextLine();
		for (Member mem : memberAry) {

			if (mem != null) {
				if (inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println(mem);
				} else if (inputId.equals(mem.getId()) && !inputPw.equals(mem.getPassword())) { // not equals = 문장 맨 앞에
																								// ! 붙여주기
					System.out.println("비밀번호가 틀렸습니다");
				} else if (!inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println("아이디가 틀렸습니다");
				} else if (!inputId.equals(mem.getId()) && !inputPw.equals(mem.getPassword())) {
					System.out.println("없는 회원입니다");
				}

			}

		}
	}

	public void listMember() {
		for (Member m : memberAry) {
			if (m != null) {
				System.out.println(m);
				
			}
		}

	}

	public void createMember() {
		Member mem = new Member();

		System.out.println("이름을 입력:");
		String name = sc.nextLine();
		mem.setName(name);

		System.out.println("id를 입력:");
		String id = sc.nextLine();
		mem.setId(id);

		System.out.println("password를 입력:");
		String password = sc.nextLine();
		mem.setPassword(password);

		System.out.println("age를 입력:");
		int age = sc.nextInt();
		mem.setAge(age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}
		memberAry[0] = mem;

	}

}//over