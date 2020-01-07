package conditions;

public class RandomDice {
	public static void main(String[] args) {

		int[] dice = new int[3];

		for (int i = 0; i < dice.length; i++) {
			dice[i] = (int) (Math.random() * 6) + 1;
		}

		for (int i = 0; i < dice.length; i++) {
			System.out.println("주사위 번호 : " + dice[i]);
		}
	}

}
