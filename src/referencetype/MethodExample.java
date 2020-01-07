package referencetype;

public class MethodExample {
	public static void main(String[] args) {
		double s1 = divideBy(5, 3);
		System.out.println("s1 은" + s1);
		
		String result = printResult("보경");
		System.out.println(result);
		
		double s2 = calculator( 4, 2, "/");
		System.out.println("cal은 : " + s2 );
	}
	
	public static double calculator(int a, int b, String cal) {
		double result = 1;
		if (cal.equals("+")) {
			result = a + b;
		} else if (cal.equals("-")) {
			result = a - b;
		} else if (cal.equals("*")) {
			result = a * b;
		} else if (cal.equals("/")) {
			result = a / b;
		} 
		return result;
	}
	
	public static String printResult(String name) {
		String str = "Hello " + name ;
		return str;
	}
	
	public static int sum(int a, int b) {
		int result = 0;
		result = a+b;
		return  result;
	}
	
	public static void printStar() {
		System.out.println("*");
	}
	
	public static double divideBy(int a, int b) {
		double result = (double) a / b;
		return  result;
		
	}

}//over
