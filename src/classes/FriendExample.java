package classes;

public class FriendExample {
	public static void main(String[] args) {
		
		Friend[] fArray = new Friend[5];
		UnivFriend[] uArray = new UnivFriend[5];
		ComFriend[] cArray = new ComFriend[5];
		
		
		UnivFriend uf = new UnivFriend("name1","1111","Yedma","java");
		ComFriend cf = new ComFriend("name2", "2222", "YDCompany", "Develop");
		Friend f = new Friend("name3", "333");
		
		Friend f1 = uf;
		Friend f2 = cf;
		
		uf.getName();    //Friend class
		uf.getPhone();   //Friend class
		uf.getUniv();    //Univ class
		uf.getMaojor();  //Univ class
		
		f1.getName();    //Friend class
		f1.getPhone();   //Friend class
		//자식 클래스는 부모클래스에 선언되어있는것을 상속 받을 수 있지만
		//부모클래스는 자식클래스에 선언되어있는것을 상속 받을 수 없다
		
		fArray[0] = uf;
		fArray[1] = cf;
		fArray[2] = f;
		
		for (int i = 0; i < 3; i++) {
			fArray[i].introduce();
			
		}
		
	}

}//over
