package ch12;

import java.util.Scanner;

public class Exam12_1 {
	
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine(); // ���ڿ� Ÿ������ �Է� ����
		char print = ' ';
		int leng = id.length();
		int printInt = 0;
		int printPlus = 0;
		int[] printLeng = new int[leng];
		
		boolean isUpper = false;
		boolean isLower = false;

		for (int i = 0; i < leng; i++) {
			print = id.charAt(i);			// id
			printInt = (int)print;
			System.out.print(print + ": ");
			System.out.print(printInt + " ");
			
			printPlus = printInt + 2;

			System.out.println("�� ���ڿ��� �ش��ϴ� ASCII �ڵ忡 2�� ���� �� : " + printPlus);
			printLeng[i] = printPlus;
		
			if (printLeng[i] > ASCII_A && printLeng[i] < ASCII_Z) {
				System.out.println("���� ���ԵǾ����ϴ�.");
			} else {
				System.out.println("���̵� Ȯ�����ּ���");
			}
		}
		// print�� �ִ� ���ڿ� �ϳ� �ϳ��� int�� �ٲ۴�. 
		// int�� �ٲ���� print�� 2�� ���Ѵ�. 
		// 2�� ���� �� ���� A�� Z ���̿� �ִٸ� 
		// "���� ���ԵǾ����ϴ�"
		// "���̵� Ȯ�����ּ���"
		
		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		/* ASCII_A �� �̸� ���ǵǾ� �ִ� �ƽ�Ű �ڵ� ����� �̿��Ͽ� */
		/* �빮�ڿ� �ҹ��� �Է� ���� Ȯ�� */

		/* �빮�ڿ� �ҹ��� �Է� ���ο� ���� ��� ��� */

		s.close();
	}
}