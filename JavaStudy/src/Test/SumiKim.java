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

public class SumiKim {

	public static void main(String[] args) {
		JFrame frm = new JFrame("�α����� �ʿ��մϴ�.");
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
		
		JButton btn = new JButton("�α���");
		btn.setLayout(new FlowLayout());
		
		btn.addActionListener(new ActionListener() {
			int count = 0;
			public void actionPerformed(ActionEvent arg0) {
				
				String id = idText.getText();
				String pw = pwText.getText();
			
				if (id.contains("ai") && !pw.contains("1234")) {
					count++;
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
					idText.setText(null);
					pwText.setText(null);
					
				} else if (!id.contains("ai") && pw.contains("1234")) {
					count++;
					JOptionPane.showMessageDialog(null, "���̵� �߸� �Է��ϼ̽��ϴ�.");
					idText.setText(null);
					pwText.setText(null);
					
				} else if (id.contains("ai") && pw.contains("1234")) {
					count++;
					JOptionPane.showMessageDialog(null, "���� �ԷµǾ����ϴ�.");
					idText.setText(null);
					pwText.setText(null);
					
				} else {
					count++;
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
					idText.setText(null);
					pwText.setText(null);
					
				}
				
				if (count == 5) {
					JOptionPane.showMessageDialog(null, "5ȸ �̻� �߸� �Է�");
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
