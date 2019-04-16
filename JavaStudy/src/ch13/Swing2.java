package ch13;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		MouseListener ml = new MouseListener() {
			new MouseListener() {	
				public void mouseReleased(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				public void mouseClicked(MouseEvent e) {
					JButton b = (JButton)e.getSource(); // 버튼을 눌러서 일어나는 동작이기 때문에 이게 버튼이 됨. 
					String text = b.getText();
					System.out.println(text);
				};
		};

		JButton b1 = new JButton("버튼 1");
		b1.addMouseListener(ml);
		
		JButton b2 = new JButton();
		b2.setText("버튼2");
		b2.addMouseListener(ml);
		
		
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
