package conditions;

public class SwichExample {
	public static void main(String[] args) {
		int score = 93;
		switch (score) {
		case 90: 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급 : A"); 
			break;
		case 80: 
			System.out.println("점수가 80보다 큽니다.");
			System.out.println("등급 : B");
			break;
		case 70:
			System.out.println("점수가 70보다 큽니다.");
			System.out.println("등급 : C");
			break;
		default :
			System.out.println("점수가 60보다 큽니다.");
			System.out.println("등급 : D");
		}
	}
}
//over