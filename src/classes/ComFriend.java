package classes;

public class ComFriend extends Friend { // extends [상속받을 클래스 이름] : ComFriend 는 Friend의 클래스를 상속받겠다는 의미
	private String company;
	private String dept;

	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}

	public String getCompany() {
		return  company;
	}

	public String getDept() {
		return dept;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "ComFriend [company=" + company + ", dept=" + dept + "]";
	}

	@Override
	public void introduce() {
		System.out.println("이름: " + super.getName() + "연락처: " + super.getPhone() + "회사: " + company + "부서: " + dept);

	}
}
//over