package example;

public class Member {
	private String name;
	private String memberId;
	private int password;
	private String phone;
	
	public Member(String name, String memberId, int password, String phone) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.password = password;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "회원목록 [이름: " + name + ", ID: " + memberId + ", PASSWORD: " + password + ", 핸드폰 번호: " + phone + "]";
	}
	
	

}