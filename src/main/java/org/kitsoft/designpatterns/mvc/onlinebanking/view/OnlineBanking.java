package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;

public class OnlineBanking {

	private JFrame frame;
	private MenuBar menu;
	private LoginPanel loginPanel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineBanking window = new OnlineBanking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OnlineBanking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("통합 은행 관리 시스템 - 로그인");
		
		menu = new MenuBar(frame);
		menu.setVisible(false);
		menu.setEnabledBackMenuItem(false);
		frame.setJMenuBar(menu);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		loginPanel = new LoginPanel(frame);
		frame.getContentPane().add(loginPanel);

		menu.setLogoutPanel(loginPanel);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
