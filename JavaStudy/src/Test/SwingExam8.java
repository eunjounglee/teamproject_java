package Test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SwingExam8 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("로그인이 필요합니다.");
		frm.setBounds(500, 500, 400, 150);
		frm.setLayout(new GridLayout(3, 3));
		
		JLabel idLabel = new JLabel("ID : ");
		JTextField idText = new JTextField(10);
		idText.setLayout(new FlowLayout());
		
		JLabel pwLabel = new JLabel("Password : ");
		JPasswordField pwText = new JPasswordField(10);
		pwText.setLayout(new FlowLayout());
		
		JPanel textBoxPanel = new JPanel();		
		textBoxPanel.add(idText);
		textBoxPanel.add(pwText);

		JPanel idLabelPanel = new JPanel();		
		idLabelPanel.add(idLabel);
		idLabelPanel.add(pwLabel);
		
		JButton btn = new JButton("로그인");
		btn.setLayout(new FlowLayout());
		btn.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				
				String id = idText.getText();
				String pw = pwText.getText();
				int count = 0;
				
				if (id.contains("at") && !pw.contains("1234")) {
					
					JOptionPane.showMessageDialog(null, "비밀번호를 잘못 입력하셨습니다.");
					idText.setText(null);
					pwText.setText(null);
					
				} else if (!id.contains("at") && pw.contains("1234")) {
					
					JOptionPane.showMessageDialog(null, "아이디를 잘못 입력하셨습니다.");
					idText.setText(null);
					pwText.setText(null);
					
				} else if (id.contains("at") && pw.contains("1234")) {
					JOptionPane.showMessageDialog(null, "정상 입력되었습니다.");
					idText.setText(null);
					pwText.setText(null);
			} else {
					
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 잘못 입력하셨습니다.");
					idText.setText(null);
					pwText.setText(null);
					
				}
			}
		});
		
		
		JPanel btnPanel = new JPanel();		
		btnPanel.add(btn);
		btn.setLayout(new FlowLayout());
		
		frm.add(idLabelPanel, BorderLayout.WEST);
		frm.add(textBoxPanel, BorderLayout.EAST);
		frm.add(btnPanel, BorderLayout.NORTH);
		frm.setVisible(true);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}