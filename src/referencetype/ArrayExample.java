package referencetype;

public class ArrayExample {
	public static void main(String[] args) {
		//배열선언 시 타입을 정해줘야함 intAry = {1, 2, 3, 4}로 사용 X
		int[] intAry = { 1, 2, 3, 4, 5 }; // int intAry[]도 가능
		System.out.println(intAry[2]); // => 3을 의미, 배열은 0부터 시작

//		intAry[2] = 30;
//		System.out.println(intAry[2]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
//			System.out.println(intAry[i]);
			sum = sum + intAry[i]; //  => sum += intAry[i] 동일
		}
		System.out.println(sum);
	
		int sum2 = 0;
		for (int j = 0; j < 5; j++) {
			if (j % 2 == 0)
				sum2 += intAry[j]; // sum = sum +i
		}
		System.out.println(sum2);

		int[] num1 = new int[25];
		for (int i = 0; i < 25; i++) {
			System.out.println(num1[i]);
			
		}

	}
	/*
	 * String[] strAry = { "Hello", "nice", "good", "wonderful" };
	 * System.out.println(strAry[2]); // => 2번째 값은 "good"
	 * 
	 * for (int j = 0; j < 4; j++) { System.out.println(strAry[j]);
	 * 
	 * 
	 * }
	 */
}
//over