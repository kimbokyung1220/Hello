package referencetype;

public class ArrayInArrayExmaple {
	public static void main(String[] args) {
		// 이차원 배열
		int[][] intAry = new int[5][5];
		int num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				intAry[i][j] = num++; // (num--)
			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(intAry[i][j] + " ");
			}
			 System.out.println();

		}
		System.out.println("---");
		// 아래로 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(intAry[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
			}
		
		}

	}
}//over
