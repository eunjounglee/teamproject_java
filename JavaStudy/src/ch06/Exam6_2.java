package ch06;

public class Exam6_2 {
	
	public static void main(String[] args) {
	 int n = 100;
	 int total = returnNumber(1, n);
	 
		 System.out.println("1 ~ " + n +
				 " 까지의 합 : " + total);
	 }

	public static int returnNumber(int first, int last) {
		int sum = 0;
		
		for (int i = first; i <= last; i++) {
			sum += i;
		}
		
		return sum;
	}
}