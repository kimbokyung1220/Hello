package common;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;   //A의 숫자
		char c3 = '\u0041'; // A의 유니코드
		int v1 = c1;
		System.out.println(v1);
		
		//System.out.println("c1: " + c1 + ", " + "c2: " + c2 + ", " + "c3: " + c3);
		
		c1 = (char) (c1 + 2);
		System.out.println("c1 + 1: " + c1);  //concat
		
		// A ~ Z 까지 화면에 출력 프로그램을 작성.
		
			char eng = 64;
			for (int i = 0 ; i < 26; i++) {
			eng = (char)(eng + 1);
			System.out.println("알파벳 : " + eng);
	
			}
		}
	}//over