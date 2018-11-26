package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuBar extends JMenuBar {
	public MenuBar() {
		super();
		
		JMenu accountMenu = new JMenu("계정");
		accountMenu.setHorizontalAlignment(SwingConstants.CENTER);
		add(accountMenu);
		
		JMenuItem logoutMenuItem = new JMenuItem("로그아웃");
		accountMenu.add(logoutMenuItem);
		
		JMenuItem accountChangeMenuItem = new JMenuItem("계좌변경");
		accountMenu.add(accountChangeMenuItem);
	}
}
