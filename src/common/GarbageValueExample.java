package common;

public class GarbageValueExample {
	public static void main(String[] args) {
		int var1 = 125;
		byte var2 = 125;
		
		for (int i = 0; i < 10; i++) { // i++ = i + 1
			var1 = var1 + i;
			var2 = (byte)(var2 + 1);
			System.out.println("var1 : " + var1 + ", " + "var2 : " + var2);
		}
	}
}
//over