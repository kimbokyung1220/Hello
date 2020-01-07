package referencetype;

public class ArrayExample2 {
	public static void main(String[] args) {
		/*
		 * new연산자로 배열 생성시 타입[] 변수이름 = new 타입[길이]로 사용 ex) int[] intArray = new int[5];
		 */

//		System.out.println("배열의 크기 : " + num.length);

		int sum = 0;
		double avg = 0;

		int[] num = new int[25];

		for (int i = 0; i < 25; i++) {
			num[i] += i + 1;
			sum = sum + num[i];
			avg = sum / num.length;

		}
		System.out.println(avg);

		int[] intArray = new int[25];
		for (int i = 0; i < 25; i++) {
			intArray[i] = i + 1;
		}
		for (int i = 0; i < 25; i++) {
			System.out.print(intArray[i] + " ");
			if (i % 5 == 4)
				System.out.println();
		}
	}
}
//over