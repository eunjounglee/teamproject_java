package ch03;

public class Text {

	public static void main(String[] args) {
		int num = 123; // 10�� ����̹Ƿ� 10���� ��� ������ ��. 
		int n1 = num % 10; // 3
		num = num / 10; // 12 
		int n2 = num % 10; // 2
		num = num / 10; // 1
		int n3 = num % 10; // 1
		System.out.println(n1 + n2 + n2);
	}

}
