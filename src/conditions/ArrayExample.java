package conditions;

public class ArrayExample {
	public static void main(String[] args) {
		int a=6, b=7, c=3, d=5, e=9;
		int maxValue= 0;
		int[] num = { 9, 7, 3, 5, 6 };
		
		for (int i = 0; i < 5; i++) {
			if ( maxValue < num[i]) {
				maxValue = num[i];
			}
			
		}
		//System.out.println( " 최대값은 : " + maxValue );
		
		//최솟값
		int minValue = Integer.MAX_VALUE; // 상수 중 가장 큰 값
		for (int i = 0;  i < num.length; i++) {
			if ( minValue > num[i]) {
				minValue = num[i];
			}
		
			System.out.println( " 최솟값은 : " + maxValue );
			
		}
	}

}//over
