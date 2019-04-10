package ch12;

import java.util.Scanner;

public class Exam12_1 {
	
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("아이디를 입력해주세요. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine(); // 문자열 타입으로 입력 받음
		char print = ' ';
		int leng = id.length();
		int printInt = 0;
		int printPlus = 0;
		int[] printLeng = new int[leng];
		
		boolean isUpper = false;
		boolean isLower = false;

		for (int i = 0; i < leng; i++) {
			print = id.charAt(i);			// id
			printInt = (int)print;
			System.out.print(print + ": ");
			System.out.print(printInt + " ");
			
			printPlus = printInt + 2;

			System.out.println("각 문자열에 해당하는 ASCII 코드에 2를 더한 값 : " + printPlus);
			printLeng[i] = printPlus;
		
			if (printLeng[i] > ASCII_A && printLeng[i] < ASCII_Z) {
				System.out.println("정상 가입되었습니다.");
			} else {
				System.out.println("아이디를 확인해주세요");
			}
		}
		// print에 있는 문자열 하나 하나를 int로 바꾼다. 
		// int로 바뀌어진 print에 2씩 더한다. 
		// 2씩 더한 그 값이 A와 Z 사이에 있다면 
		// "정상 가입되었습니다"
		// "아이디를 확인해주세요"
		
		/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */
		/* ASCII_A 등 미리 정의되어 있는 아스키 코드 상수를 이용하여 */
		/* 대문자와 소문자 입력 여부 확인 */

		/* 대문자와 소문자 입력 여부에 따라 결과 출력 */

		s.close();
	}
}