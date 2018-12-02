package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuBar extends JMenuBar {
	private JFrame superFrame;
	private JPanel logoutPanel;
	private JPanel backPanel;
	
	private JMenu accountMenu;
	private JMenuItem logoutMenuItem;
	private JMenuItem accountChangeMenuItem;
	private JMenuItem backMenuItem;
	
	public MenuBar(JFrame superFrame) {
		super();
		this.superFrame = superFrame;
		
		initialize();
	}
	
	private void initialize() {
		accountMenu = new JMenu("계정");
		accountMenu.setHorizontalAlignment(SwingConstants.CENTER);
		add(accountMenu);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onClickedLogoutButton();
			}
		});
		accountMenu.add(logoutMenuItem);
		
		accountChangeMenuItem = new JMenuItem("계좌변경");
		accountMenu.add(accountChangeMenuItem);
		
		backMenuItem = new JMenuItem("뒤로가기");
		backMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onClickedBackButton();
			}
		});
		accountMenu.add(backMenuItem);
		
	}
	
	private void onClickedLogoutButton() {
		superFrame.getContentPane().removeAll();
		superFrame.getContentPane().add(logoutPanel, BorderLayout.CENTER);
		superFrame.revalidate();
		superFrame.repaint();
	}
	
	private void onClickedBackButton() {
		superFrame.getContentPane().removeAll();
		superFrame.getContentPane().add(backPanel, BorderLayout.CENTER);
		superFrame.revalidate();
		superFrame.repaint();
	}
	
	public void setLogoutPanel(JPanel logoutPanel) {
		this.logoutPanel = logoutPanel;
	}
	
	public void setBackPanel(JPanel backPanel) {
		this.backPanel = backPanel;
	}
	
	public void setEnabledBackMenuItem(boolean enabled) {
		backMenuItem.setEnabled(enabled);
	}
}
