package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("������");
	
		JButton button = new JButton();
		// button�� ���ڿ��� setting �ϴ� �޼���
		button.setText("���� ��ư");
		button.setSize(100, 100);
		button.setBackground(Color.YELLOW);
		
		frame.add(button);
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}