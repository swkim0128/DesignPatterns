package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends JPanel {
	private JFrame superFrame;
	private JTextField idTextField;
	private JPasswordField pwTextField;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setBorder(new EmptyBorder(20, 20, 20, 20));
		setLayout(new GridLayout(0, 3, 10, 10));
		
		JPanel labelPanel = new JPanel();
		add(labelPanel);
		labelPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel labelID = new JLabel("ID : ");
		labelPanel.add(labelID);
		
		JLabel labelPW = new JLabel("PW : ");
		labelPanel.add(labelPW);
		
		JPanel textFieldPanel = new JPanel();
		add(textFieldPanel);
		textFieldPanel.setLayout(new GridLayout(2, 1, 0, 10));
		
		idTextField = new JTextField();
		textFieldPanel.add(idTextField);
		idTextField.setColumns(10);
		
		pwTextField = new JPasswordField();
		textFieldPanel.add(pwTextField);
		pwTextField.setColumns(10);
		
		JPanel loginButtonPanel = new JPanel();
		add(loginButtonPanel);
		loginButtonPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton loginButton = new JButton("로그인");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginButtonAction();
			}
		});
		loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.setFocusPainted(false);
		loginButton.setContentAreaFilled(false);
		loginButtonPanel.add(loginButton);
	}
	
	public void setSuperFrame(JFrame frame) {
		this.superFrame = frame;
	}
	
	private void loginButtonAction() {
		AccountSettingFrame accountSettingFrame = new AccountSettingFrame();
		accountSettingFrame.setVisible(true);
		superFrame.setVisible(false);
	}
}
