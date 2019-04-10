package myPractice;

import java.util.Random;

public class Bingo_MP {

	public static void main(String[] args) {
		
		int[] bingo = new int[25];
		int temp = 0;
		
		// bingo 배열 안에 1 부터 25까지의 숫자를 순서대로 넣는다. 
		for (int i = 0; i < bingo.length; i++) {
			
			bingo[i] = i + 1;
		}
		
		// temp라는 공간을 통해 random을 만들어 
		// bingo 배열에 1 ~ 25까지의 숫자를 랜덤하게 넣는다. 
		for (int i = 0; i < 100; i++) {
			
			int random = (int)(Math.random() * 25);
			
			temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
		}
		
		// bingo 배열 안에 0번째 부터 25번째에 위치한 값을 출력한다. 
		for (int i = 1; i <= bingo.length; i++) {
			
			System.out.print(bingo[i - 1] + "\t");
			
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		
	}

}
