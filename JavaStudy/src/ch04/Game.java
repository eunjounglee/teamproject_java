package ch04;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����: 0, ����: 1, ��: 2");
	
		int player = s.nextInt(); 			// ���� -> ���� ���� ġ�� 
		int com = (int)(Math.random() * 3); // ���� -> �������� �����
		System.out.println("��ǻ�ʹ�? :" + com);
		
		if (player == com) {
			System.out.println("���");
		} else {
			if ((player + 1) % 3 == com) {
				System.out.println("��");
			} else {
				System.out.println("�̱�");
			}
		}
	}
}
