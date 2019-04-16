package myPractice;

import java.util.Scanner;

public class CharAt {

	 static final int ASCII_A = 65, ASCII_Z = 90;
	 static final int ASCII_a = 97, ASCII_z = 122;
	 
	public static void main(String[] args) {
		System.out.print("ID = ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		boolean upperCase = false;
		boolean lowerCase = false;
		
		for (int i = 0; i < input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if (ch >= ASCII_A && ch <= ASCII_Z) {
				upperCase = true;
			}
			if (ch >= ASCII_a && ch <= ASCII_z) {
				lowerCase = true;
			}
		}
		if (upperCase && lowerCase) {
		System.out.println("맞아요");
		} else {
			System.out.println("틀려요");
		}
		s.close();
	}	

}
