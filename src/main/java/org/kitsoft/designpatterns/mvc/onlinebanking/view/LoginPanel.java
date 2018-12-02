package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

import org.kitsoft.designpatterns.mvc.onlinebanking.model.CustomerInfo;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.DataAccessManager;

import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends JPanel {
	private JFrame superFrame;
	private JTextField idTextField;
	private JPasswordField pwTextField;

	private JPanel nextPanel;

	private DataAccessManager dam = null;
	private CustomerInfo customer = null;
	
	/**
	 * Create the panel.
	 */
	public LoginPanel(JFrame superFrame) {
		super();
		this.superFrame = superFrame;
		nextPanel = new AccountSelectPanel(superFrame);
		
		initialize();
	}
	
	private void initialize() {
		setBorder(new EmptyBorder(20, 20, 20, 20));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(111, 147, 276, 110);
		panel_1.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel idPanel = new JPanel();
		panel.add(idPanel);
		idPanel.setLayout(null);
		
		JLabel idLabel = new JLabel("ID : ");
		idLabel.setBounds(0, 12, 60, 36);
		idPanel.add(idLabel);
		
		idTextField = new JTextField();
		idTextField.setBounds(76, 10, 200, 36);
		idPanel.add(idTextField);
		idTextField.setColumns(10);
		
		JPanel passwordPanel = new JPanel();
		panel.add(passwordPanel);
		passwordPanel.setLayout(null);
		
		JLabel pwLabel = new JLabel("PW : ");
		pwLabel.setBounds(0, 10, 60, 36);
		passwordPanel.add(pwLabel);
		
		pwTextField = new JPasswordField();
		pwTextField.setBounds(76, 10, 200, 36);
		passwordPanel.add(pwTextField);
		pwTextField.setColumns(10);
		
		JPanel loginButtonPanel = new JPanel();
		loginButtonPanel.setBounds(403, 147, 130, 110);
		panel_1.add(loginButtonPanel);
		
		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(0, 26, 130, 55);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickedLoginButton();
			}
		});
		loginButtonPanel.setLayout(null);
		loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.setFocusPainted(false);
		loginButton.setContentAreaFilled(false);
		loginButtonPanel.add(loginButton);
		
	}
	
	private void onClickedLoginButton() {
		dam = DataAccessManager.getInstance();
		
		String id = idTextField.getText();
		String pw = pwTextField.getText();
		
		customer = dam.findCustomer(id, pw);

		if(customer == null) {
			JOptionPane.showMessageDialog(null, "로그인인에 실패하였습니다.");
		}
		else {
			JMenuBar menu = superFrame.getJMenuBar();
			menu.setVisible(true);
			
			((AccountSelectPanel) nextPanel).setCustomerInfo(customer);
			
			superFrame.getContentPane().removeAll();
			superFrame.getContentPane().add(nextPanel, BorderLayout.CENTER);
			superFrame.revalidate();
			superFrame.repaint();			
		}
	}
}
