package classes;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	public UnivFriend() {
	}

	public UnivFriend(String name, String phone, String univ, String maojor) {
		super(name, phone);
		this.univ = univ;
		this.major = maojor;
	}

	public String getUniv() {
		return univ;
	}

	public String getMaojor() {
		return major;
	}
   
	public void setUniv(String univ) {
		this.univ = univ;
	}

	public void setMaojor(String maojor) {
		this.major = maojor;
	}

	@Override
	public String toString() {
		return "UnivFriend [univ=" + univ + ", maojor=" + major + "]";
	}

	@Override
	public void introduce() {
		System.out.println("이름: " + super.getName() + "연락처: " + super.getPhone() + "학교: " + univ + "전공: " + major);
	}
}
