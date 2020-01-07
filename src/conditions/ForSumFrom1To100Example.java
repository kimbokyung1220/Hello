package conditions;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1에서 100까지 합은 : " + sum);
		System.out.println("----------------------------");

		// 홀수의 합(1)
		int a = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				a += i;
		}
		System.out.println("홀수의 합은 : " + a);
		System.out.println("----------------------------");
		// 홀수의 합(2)
		a = 0;

		for (int i = 1; i <= 100; i += 2) {
			a += i;
		}
		System.out.println("홀수의 합은 : " + a);

	}
}//over
