package myPractice;

public class Bingo_2 {

	public static void main(String[] args) {
		
		int[] bingo = new int[25];
		
		for (int i = 0; i < bingo.length; i++) {
			bingo[i] = i + 1;			
		}
		
		for (int i = 0; i < bingo.length; i++) {
			int random = (int)(Math.random() * 25);
			int temp = 0;
			
			temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
		}
		
		for (int i = 1; i <= bingo.length; i++) {

			System.out.print(bingo[i - 1] + "\t");
		
			if (i % 5 == 0) {
				System.out.println();
			}
		}	
	}
}
