package operators;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "신민철";
		int num1 = 10;
		String str2 = "신민철";
		String str3 = new String("신민철");
		// new : 새로운 String 객체를 생성
		
		
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
//		System.out.println(str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		if(str1.contentEquals(str3)) { //클래스를 비교할 경우 equals사용
			System.out.println("같은 내용입니다.");
		} else {
			System.out.println("다른 내용입니다.");
		}
		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		
		if (++var1 > 15 && ++var2 > 30) {
			System.out.println(var1 + ", " + var2);
		}
	}
}
//over