package ch21;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exam21_4 {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.display();
	}
}

class BtnHandler implements ActionListener {
	int[][] bingo = new int[5][5];
	int countX = 0;
	int countY = 0;
	
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);

		// ���õ� ��ư�� ��ǥ Ȯ�� (setName���� ������ ��)
		String xy = btn.getName();
		System.out.println(xy);
	
		char x = '0';
		char y = '1';
		
		int numX = Integer.parseInt(x + "");
		int numY = Integer.parseInt(y + "");
		
		bingo[numX][numY] = 1;
		
		for (int i = 0; i < bingo.length; i++) {
			
			if (bingo[numX][i] == 1) {
				countX++;			
				}
			if (bingo[i][numY] == 1) {
				countY++;
			}
		}
		if (countX % 5 == 0) {
			System.out.println("������ �ϼ�");		
		}
		if (countY % 5 == 0) {
			System.out.println("������ �ϼ�");
		}

	}
		// x, y �� charat�� �и�
		/* ������ �ϼ� Ȯ�� �ڵ� */
		/* ������ �ϼ� Ȯ�� �ڵ� */
}