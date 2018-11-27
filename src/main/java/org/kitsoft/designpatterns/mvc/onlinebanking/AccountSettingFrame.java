package org.kitsoft.designpatterns.mvc.onlinebanking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AccountSettingFrame extends JFrame {

	private JPanel contentPane;
	private MenuBar menu;
	private AccountSelectPanel accountSelectPanel;

	private JPanel nowPanel;
	
	/**
	 * Create the frame.
	 */
	public AccountSettingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		menu = new MenuBar();
		menu.setNowFrame(this);
		menu.setEnabledBackMenuItem(false);
		this.setJMenuBar(menu);
		
		accountSelectPanel = new AccountSelectPanel();
		contentPane.add(accountSelectPanel, BorderLayout.CENTER);
		accountSelectPanel.setSuperFrame(this);
		
		setNowPanel(accountSelectPanel);
	}

	public void backPanel() {
		if(nowPanel instanceof AccountSelectedPanel) {
			((AccountSelectedPanel) nowPanel).movePanel();
		}
	}
	public void setNowPanel(JPanel panel) {
		if(panel instanceof AccountSelectedPanel) {
			menu.setEnabledBackMenuItem(true);
		}
		else if(panel instanceof AccountSelectPanel) {
			menu.setEnabledBackMenuItem(false);
		}
		this.nowPanel = panel;
	}
	public JPanel getNowPanel() {
		return nowPanel;
	}
}
