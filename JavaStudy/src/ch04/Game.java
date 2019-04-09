package ch04;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("가위: 0, 바위: 1, 보: 2");
	
		int player = s.nextInt(); 			// 가위 -> 내가 직접 치기 
		int com = (int)(Math.random() * 3); // 바위 -> 램덤으로 만들기
		System.out.println("컴퓨터는? :" + com);
		
		if (player == com) {
			System.out.println("비김");
		} else {
			if ((player + 1) % 3 == com) {
				System.out.println("짐");
			} else {
				System.out.println("이김");
			}
		}
	}
}
