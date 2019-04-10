package ch07;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.id = "ksumikim";
		member.password = "password";
		member.name = "±è¼ö¹Ì";
		member.age = 26;
		
		member.setAge(1000);

	}

}
