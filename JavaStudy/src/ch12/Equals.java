package ch12;

public class Equals {

	public static void main(String args[]) {
		 String str1 = "AA";
		 String str2 = "AA";
		 String str3 = new String("AA");
		
		 if(str1 == str2) {
		 System.out.println("1 2 같음");
		 } else {
		 System.out.println("1 2 다름");
		 }
	}
}