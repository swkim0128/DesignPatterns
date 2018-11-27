package org.kitsoft.designpatterns.mvc.onlinebanking;

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
		frame.setBounds(100, 100, 604, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		loginPanel = new LoginPanel();
		frame.getContentPane().add(loginPanel);
		loginPanel.setSuperFrame(frame);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
