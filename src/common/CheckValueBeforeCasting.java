package common;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 28;
		
		//byte : -128 ~ 127
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
		
		// 변환으로 인한 데이터 손실이 발생하지 않도록 
		if (i > Byte.MAX_VALUE || i < Byte.MIN_VALUE) {
			System.out.println("byte타입으로 변환불가.");
		}
		else {
		byte b = (byte) i;
		System.out.println(b);
		}
	}
}
