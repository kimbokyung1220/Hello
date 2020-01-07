package classes;

public class CalculatorExample {
	   public static void main(String[] args) {
//	      클래스 밖에서 호출할 때 변수이름.~
	      Calculator cal = new Calculator();
	      cal.execute();

	      double avg = cal.avg(30, 50);
	      cal.println("두 수의 결과값은 " + avg);
	   }
	}
//over