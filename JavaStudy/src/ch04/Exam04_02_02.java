package ch04;

public class Exam04_02_02 {

	public static void main(String[] args) {
		int year = 1997;
		
		if (year % 4 == 0) {
			System.out.println("윤년입니다.");
		} else if (year % 4== 0 && year % 100 == 0) {
			System.out.println("평년입니다.");
		} else if (year % 4 == 0 && 
				year % 100 == 0 && 
				year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		
	}

}
