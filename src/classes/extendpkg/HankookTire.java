package classes.extendpkg;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);


}

	@Override
	public boolean roll() {
		++accumlateRotation;
		if (accumlateRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명: " 
		                     + (maxRotation - accumlateRotation));
				return true;		
				} else {
					System.out.println("*** " + location + " HankookTire 교체필요" + " ***" );
					return false;
		}
	}
}
//over