package conditions;

public class GetMaxValue {
	public static void main(String[] args) {
		int[] Array = { 8, 7, 6, 5, 4 };
		int temp = 0;

		for (int j = 0; j < (Array.length - 1); j++) {

			for (int i = 0; i < (Array.length - 1); i++) {
				if (Array[i] > Array[i + 1]) {
					temp = Array[i];
					Array[i] = Array[i + 1];
					Array[i + 1] = temp;

				}

			}
		}
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i] + " ");
		}
	}

}
//over