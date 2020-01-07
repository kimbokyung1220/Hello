package classes;

public class Account {
	private String name;
	private int password;
	private String ano;
	private String owner;
	private int balance;

	public Account() {

	}

	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getPassword() {
		return password;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "계좌정보 [이름=" + name + ", 비밀번호=" + password + ", 계좌번호=" + ano + ", 소유자=" + owner + ", 잔액="
				+ balance + "]";
	}
	
	//over

}
