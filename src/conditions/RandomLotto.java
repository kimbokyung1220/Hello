package conditions;

public class RandomLotto {
	public static void main(String[] args) {
		// 로또번호 생성

		// 1.배열생성
		int[] lotto = new int[6];

		// 2.랜던값 반환
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			// 3.중복값제거
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println("로또 번호는 : " + lotto[i] + " 입니다");

		}
	}
}
