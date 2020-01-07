package classes;

public class Member {
	   private String name; //private : 외부 접근을 막는다 
	   private String id;
	   private String password;
	   private int age;
	   
	   public Member() {
	   }
	   
	   public Member(String name, String id, String password, int age) {
	      super();
	      this.name = name;
	      this.id = id;
	      this.password = password;
	      this.age = age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getId() {
	      return id;
	   }

	   public String getPassword() {
	      return password;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public void setId(String id) {
	      this.id = id;
	   }

	   public void setPassword(String password) {
	      this.password = password;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   @Override
	   public String toString() {
	      return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	   }
	      
	   }//over