package ch03;

public class Exam03_09 {

	public static void main(String[] args) {
		char ch = 'T';
		char lowerCase = ((ch >= 'A' && ch <= 'Z') ?
				(char)(ch + 32) : ch);
		// ������ �ڷ��� ������ �� �� ������ int�� �ȴ�. ch + 32�� �ϴ� ���� int�� �ȴ�. 
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase: " + lowerCase);
	}
}
