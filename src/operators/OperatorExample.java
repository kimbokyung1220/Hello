package operators;

public class OperatorExample {
	public static void main(String[] args) {
		int result = 0;
		int a = 10, b = 20;
//		result = a + b;
//		System.out.println("결과값은 : " + result);
		sum(a, b);
	}
	
	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("method 결과값은: " + result);
		
	}
	
	public static void muti (int a , int b) {
		int result = a * b;
		System.out.println("method 결과값은 : " + result);
		
	}
	
}
//over