package ch05;

public class Exam5_3 {
	
	public static void main(String[] args) {
		
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		for (int i = 0; i < 100; i++) {
			char temp = ' ';
			int random = (int)(Math.random() * 7);
			
			temp = nums[0];
			nums[0] = nums[random];
			nums[random] = temp;
		}
		System.out.print(nums);
		
	}
}