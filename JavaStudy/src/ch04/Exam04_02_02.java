package ch04;

public class Exam04_02_02 {

	public static void main(String[] args) {
		int year = 1997;
		
		if (year % 4 == 0) {
			System.out.println("�����Դϴ�.");
		} else if (year % 4== 0 && year % 100 == 0) {
			System.out.println("����Դϴ�.");
		} else if (year % 4 == 0 && 
				year % 100 == 0 && 
				year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
		
		
	}

}
