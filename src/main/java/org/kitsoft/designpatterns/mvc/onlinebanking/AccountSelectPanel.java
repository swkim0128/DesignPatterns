package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountSelectPanel extends JPanel {
	
	private AccountSettingFrame superFrame;
	private AccountSelectedPanel accountSelectedPanel;
	
	/**
	 * Create the panel.
	 */
	public AccountSelectPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(80, 80, 80, 80));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 0, 15));
		
		JButton accountSelectButton = new JButton("계좌 선택");
		accountSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				moveSelectedPanel();
			}
		});
		panel.add(accountSelectButton);
		
		JButton accountCreateButton = new JButton("계좌 생성");
		panel.add(accountCreateButton);
	}
	
	public void setSuperFrame(AccountSettingFrame superFrame) {
		this.superFrame = superFrame;
	}
	
	public void moveSelectedPanel() {
		accountSelectedPanel = new AccountSelectedPanel();
		accountSelectedPanel.setSuperFrame(superFrame);
		
		superFrame.setNowPanel(accountSelectedPanel);
		superFrame.getContentPane().removeAll();
		superFrame.getContentPane().add(accountSelectedPanel);
		superFrame.revalidate();
		superFrame.repaint();
	}
}
