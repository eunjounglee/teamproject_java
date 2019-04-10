package myPractice;

import java.util.Random;

public class Bingo_MP {

	public static void main(String[] args) {
		
		int[] bingo = new int[25];
		int temp = 0;
		
		// bingo �迭 �ȿ� 1 ���� 25������ ���ڸ� ������� �ִ´�. 
		for (int i = 0; i < bingo.length; i++) {
			
			bingo[i] = i + 1;
		}
		
		// temp��� ������ ���� random�� ����� 
		// bingo �迭�� 1 ~ 25������ ���ڸ� �����ϰ� �ִ´�. 
		for (int i = 0; i < 100; i++) {
			
			int random = (int)(Math.random() * 25);
			
			temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
		}
		
		// bingo �迭 �ȿ� 0��° ���� 25��°�� ��ġ�� ���� ����Ѵ�. 
		for (int i = 1; i <= bingo.length; i++) {
			
			System.out.print(bingo[i - 1] + "\t");
			
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		
	}

}
