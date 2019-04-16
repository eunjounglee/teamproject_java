package ch07;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
	
		JButton button = new JButton();
		
		// button에 문자열을 setting 하는 메서드
		// 버튼이 어떤식으로 동작할 건지에 대한 명령어를 넣어줄 수있음
		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}); 
		
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
class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("안녕하세요");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}