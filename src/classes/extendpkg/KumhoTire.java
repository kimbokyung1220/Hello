package classes.extendpkg;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);

}

	@Override
	public boolean roll() {
		++accumlateRotation;
		if (accumlateRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명: " 
		                     + (maxRotation - accumlateRotation));
				return true;		
				} else {
					System.out.println("*** " + location + " KumhoTire 교체필요" + " ***" );
					return false;
		}
	}
}//over