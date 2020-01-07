package common;

public class BooleanForExample {
	public static void main(String[] args) {
		
		int var1 = 92; // 변수 선언은 1번만 가능하다
		//var1 = 10;     // <- 변수 선언이 아니라 변수 변경. so, 가능
		
		//60점을 넘으면 pass 아니면 fail
		//90점을 넘으면 양호, 70점을 넘으면 보통, 아니면 미흡.
		
		if(var1 > 90) { 
			if (var1 > 95)
			System.out.println("A+");  //if에 한 블럭만 있으면 {} 생략 가능
			else 
			System.out.println("A"); 
		}
		else if (var1 > 80) {
			if (var1 > 85)
			System.out.println("B+");
			else 
			System.out.println("B"); 
		}
		else if (var1 > 70) {
			if (var1 > 75)
			System.out.println("C+");
			else
			System.out.println("C"); 
		}
		else if ( var1 > 60) {
			if (var1 > 65)
			System.out.println("D+");
			else
			System.out.println("D"); 
		}
		else
			System.out.println("F");
	}

}
//over