package org.kitsoft.designpatterns.mvc.onlinebanking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuBar extends JMenuBar {
	private JFrame nowFrame;
	private JMenu accountMenu;
	private JMenuItem logoutMenuItem;
	private JMenuItem accountChangeMenuItem;
	private JMenuItem backMenuItem;
	
	public MenuBar() {
		super();
		
		accountMenu = new JMenu("계정");
		accountMenu.setHorizontalAlignment(SwingConstants.CENTER);
		add(accountMenu);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				OnlineBanking onlineBanking = new OnlineBanking();
				onlineBanking.setVisible(true);
				nowFrame.setVisible(false);
			}
		});
		accountMenu.add(logoutMenuItem);
		
		accountChangeMenuItem = new JMenuItem("계좌변경");
		accountMenu.add(accountChangeMenuItem);
		
		backMenuItem = new JMenuItem("뒤로가기");
		backMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				backMenuItem();
			}
		});
		accountMenu.add(backMenuItem);
	}
	
	private void backMenuItem() {
		if(nowFrame instanceof AccountSettingFrame) {
			((AccountSettingFrame) nowFrame).backPanel();
		}
		else if(nowFrame instanceof TransactionFrame) {
			((TransactionFrame) nowFrame).moveBack();
		}
	}
	
	public void setEnabledBackMenuItem(boolean enabled) {
		backMenuItem.setEnabled(enabled);
	}
	public void setNowFrame(JFrame frame) {
		this.nowFrame = frame;
	}
}
