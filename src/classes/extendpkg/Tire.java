package classes.extendpkg;

public class Tire {
	int maxRotation; // 사용가능한 타이어 회전수(10)
	int accumlateRotation; // 현재까지 사용한 회전수
	String location; // 장착위치.. 앞오, 앞왼, 뒤오, 뒤왼

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumlateRotation;
		if (accumlateRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " 
			+ (maxRotation - accumlateRotation));
			return true;		
			} else {
				System.out.println("*** " + location + " Tire 교체필요" + " ***" );
				return false;
			}
	}
}
//over