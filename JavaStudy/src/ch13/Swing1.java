package ch13;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		JButton b1 = new JButton("버튼 1");
		JButton b2 = new JButton();
		b2.setText("버튼2");
		
		j.add(b1); 
		j.add(b2);
		// 크기 지정
		j.setSize(250, 250);
		// x 버튼을 눌렀을 때 어떻게 동작할 것인가에 대한 메서드: exit 누르면 꺼진다. 
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 보이기
		j.setVisible(true);

		
	}

}
