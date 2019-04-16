package myPractice;

public class Exam12_1_2 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";
		
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			
			if (ch >= ASCII_A && ch <= ASCII_Z) {
				ch = (char)(ch + 2);
				
				if (ch > ASCII_Z) {
					ch -= 26;
				}
			} else if (ch >= ASCII_a && ch <= ASCII_z) {
				ch = (char)(ch + 2);
				
				if (ch > ASCII_z) {
					ch -= 26;
				}
			}
			System.out.print(ch);
		}
		
	}
}