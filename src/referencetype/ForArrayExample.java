package referencetype;

public class ForArrayExample {
	public static void main(String[] args) {

		// for문을 사용해서 1~10까지의 합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);

		// while문을 사용해서 1~10까지의 합
		int a = 1;
		int sum1 = 0;
		while (a < 11) {
			sum1 = sum1 + a;
			a++;
		}
		System.out.println(sum1);

		// for문을 사용해서1~100에서 3의 배수의 합
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("3의 배수의 합은 : " + sum2);

		// 7의 배수출력

		int cnt = 0;
		for (int i = 0; i < 50; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}

		//
		boolean run = true;

		while (run) {
			int num3 = (int) (Math.random() * 6) + 1;
			if (num3 == 5) {
				break;

			}

		}
	}
}
//over