package ch07;

public class Member {

		static String id;
		String password;
		String name;
		int age;
		public static String getId() {
			return id;
		}
		public static void setId(String id) {
			Member.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

	
}


