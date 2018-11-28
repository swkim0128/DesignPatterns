package org.kitsoft.designpatterns.mvc.onlinebanking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.UIManager;

public class TransactionFrame extends JFrame {

	private JPanel contentPane;
	private MenuBar menu;
	private TransactionPanel transactionPanel;
	
	private JPanel nowPanel;
	
	/**
	 * Create the frame.
	 */
	public TransactionFrame() {
		setTitle("통합은행관리 시스템 - 거래페이지");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		menu = new MenuBar();
		menu.setNowFrame(this);
		this.setJMenuBar(menu);

		transactionPanel = new TransactionPanel();
		transactionPanel.setSuperFrame(this);
		contentPane.add(transactionPanel);
		
		nowPanel = transactionPanel;
	}

	public void moveBack() {
		if (nowPanel instanceof TransactionPanel) {
			AccountSettingFrame accountSettingFrame = new AccountSettingFrame();
			accountSettingFrame.setVisible(true);
			this.setVisible(false);
		}
		else if(nowPanel instanceof TransactionInquirePanel) {
			TransactionPanel transactionPanel = new TransactionPanel();
			transactionPanel.setSuperFrame(this);
			
			setNowPanel(transactionPanel);
			getContentPane().removeAll();
			getContentPane().add(transactionPanel);
			revalidate();
			repaint();
		}
	}
	
	public void setNowPanel(JPanel panel) {
		this.nowPanel = panel;
	}
}
