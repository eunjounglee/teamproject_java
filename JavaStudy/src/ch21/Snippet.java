package ch21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Snippet {
	
	 public static void main(String[] args) {
	 JFrame frame = new JFrame("모양만 채팅창");
	 frame.setLayout(new FlowLayout());
	 JTextArea area = new JTextArea(10, 20); // 행*열 10*20
	 area.setEditable(false); // 수정 불가
	 area.setFocusable(false); // 포커싱 불가
	 frame.add(area);
	 /* JTextField 생성 */
	 /* JTextField 및 JButton을 JPanel에 추가 */
	 
	 /* JPanel 생성 */	
	 JPanel panel = new JPanel();
	 frame.add(panel);
	 
	 
	 JLabel memoLabel = new JLabel();
	 frame.add(memoLabel);
	
	 JTextField tf = new JTextField(15);
	 panel.add(tf, BorderLayout.EAST);
	 String text = tf.getText();
	 frame.add(tf);
			 
	 
	 JButton btn = new JButton("전송");
	 
	 btn.addMouseListener(new MouseListener() {
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		public void mouseClicked(MouseEvent e) {
			String input = tf.getText();
			area.setText(input);
			tf.setText("");
		}
	});
	 
	 panel.add(btn, BorderLayout.EAST);
	 frame.add(panel);
	 frame.setSize(300, 260);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	 /* JButton 클릭 시 입력된 글자를 JTextArea로 출력 */
	 }
	}

