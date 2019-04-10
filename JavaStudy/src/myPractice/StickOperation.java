package myPractice;

public class StickOperation {

	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		int min = Integer.MAX_VALUE;
		int count = 0;
	
	while (true) {
		for (int i = 0; i < stick.length; i++) {
			if (stick[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
		if (count <= 1) {
			break;
			}
		for (int i = 0; i < stick.length; i++) {
			
			if (stick[i] < min && stick[i] > 0) {
				min = stick[i];
			}
		}
		
		for (int i = 0; i < stick.length; i++) {
			stick[i] = stick[i] - min;
			}	
		}
	}
}
