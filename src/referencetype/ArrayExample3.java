package referencetype;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {

		boolean run = true;
		int[] studentScore = new int[5];
		int sum = 0, menu = 0, score = 0;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.성적입력 | 2.합계 | 3.평균 | 4. 종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
			menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				System.out.println("점수를 입력하세요>");
				score = scanner.nextInt();
				for (int i = 0; i < 5; i++) {
					if (studentScore[i] == 0) {
						studentScore[i] = score;
						break;
					}
				}

			} else if (menu == 2) {
				sum = 0;
				for (int i = 0; i < 5; i++) {
					if (studentScore[i] > 0) {
						sum += studentScore[i];
					}
					System.out.println("합계 점수는" + sum + "입니다");
				}

			} else if (menu == 3) {
				int cnt = 0;
				for (int i = 0; i < 5; i++) {
					if (studentScore[i] != 0)
						cnt++;
				}
				avg = (double) sum / cnt;
				System.out.println("평균은 " + avg + "입니다.");

			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
}
//over