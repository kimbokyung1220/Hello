package classes;

public class ClassExample {
	public static void main(String[] args) {
		Object[] objAry = new Object[10];
		Object obj = null;
//		obj = new Friend("name", "1111");
		obj = new Friend();
		System.out.println(obj.hashCode());

		if (obj instanceof Friend) {
			Friend frnd = (Friend) obj;
			System.out.println(frnd.getName() + frnd.getPhone());
		}

		objAry[0] = new Friend();
		objAry[1] = new Member();

		Friend[] fArray = new Friend[10];
		fArray[0] = new UnivFriend("name1", "1111", "yedam", "java");
		fArray[1] = new ComFriend("", "", "", "");
		fArray[2] = new UnivFriend();
		System.out.println(fArray[0].getName());

	}
}