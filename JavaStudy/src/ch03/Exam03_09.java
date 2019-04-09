package ch03;

public class Exam03_09 {

	public static void main(String[] args) {
		char ch = 'T';
		char lowerCase = ((ch >= 'A' && ch <= 'Z') ?
				(char)(ch + 32) : ch);
		// 뭔가의 자료형 연산을 할 때 무조건 int가 된다. ch + 32를 하는 순간 int가 된다. 
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase: " + lowerCase);
	}
}
