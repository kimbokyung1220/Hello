package operators;

public class ConditionalExample {
	public static void exam03(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
	
	}
	
	public static void exam04(String[] args) {
		int pencils = 534;
		int student = 30;
		
		//학생 한명이 가지는 연필 수 
		int pencilsPerStudent = (pencils/student) ;
		System.out.println( pencilsPerStudent );
		
		//남은 연필 수 
		int pencilsLeft = (pencils%student);
		System.out.println( pencilsLeft );
		
	}
	
	public static void exam05(String[] args) {
		int value = 356;
		System.out.println( value -= value % 100);
		System.out.println(( 100 / value) * 100);
		// value = value - (value%100)
	}
}
