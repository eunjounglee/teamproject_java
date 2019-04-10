package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
	
		JButton button = new JButton();
		// button에 문자열을 setting 하는 메서드
		button.setText("나는 버튼");
		button.setSize(100, 100);
		button.setBackground(Color.YELLOW);
		
		frame.add(button);
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}