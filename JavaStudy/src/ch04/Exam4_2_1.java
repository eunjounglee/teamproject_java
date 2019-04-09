package ch04;

public class Exam4_2_1 {

	public static void main(String[] args) {
		int score = 12;
		
		if (score % 2 == 0 && score % 6 != 0) {
			System.out.println("짝");
			
		} else if (score % 3 == 0 && score % 6 != 0) {
			System.out.println("쿵");
			// 이걸 제일 위에 놓으면 이것이 실행되고 그 다음 코드가 실행되지 않음. 
		
		} else if (score % 6 == 0) {
			System.out.println("쿵짝");
			
		} 

	}

}
