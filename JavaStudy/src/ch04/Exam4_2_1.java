package ch04;

public class Exam4_2_1 {

	public static void main(String[] args) {
		int score = 12;
		
		if (score % 2 == 0 && score % 6 != 0) {
			System.out.println("¦");
			
		} else if (score % 3 == 0 && score % 6 != 0) {
			System.out.println("��");
			// �̰� ���� ���� ������ �̰��� ����ǰ� �� ���� �ڵ尡 ������� ����. 
		
		} else if (score % 6 == 0) {
			System.out.println("��¦");
			
		} 

	}

}
