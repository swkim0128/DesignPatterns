package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TransactionPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TransactionPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setAlignmentX(0.5f);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		add(panel);
		panel.setLayout(new GridLayout(2, 3, 10, 10));
		
		JButton depositButton = new JButton("입금");
		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositButtonAction();
			}
		});
		depositButton.setFocusPainted(false);
		depositButton.setContentAreaFilled(false);
		panel.add(depositButton);
		
		JButton withdrawButton = new JButton("출금");
		withdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawButtonAction();
			}
		});
		withdrawButton.setFocusPainted(false);
		withdrawButton.setContentAreaFilled(false);
		panel.add(withdrawButton);
		
		JButton transactionInquireButton = new JButton("거래내역조회");
		transactionInquireButton.setFocusPainted(false);
		transactionInquireButton.setContentAreaFilled(false);
		panel.add(transactionInquireButton);
		
		JButton balanceInquireButton = new JButton("잔액조회");
		balanceInquireButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "잔액 : ");
			}
		});
		balanceInquireButton.setFocusPainted(false);
		balanceInquireButton.setContentAreaFilled(false);
		panel.add(balanceInquireButton);
		
		JButton transferButton = new JButton("계좌이체");
		transferButton.setFocusPainted(false);
		transferButton.setContentAreaFilled(false);
		panel.add(transferButton);

	}
	
	private void depositButtonAction() {
		String balanceStr = JOptionPane.showInputDialog("입금 액 : ");
		int balance = Integer.parseInt(balanceStr);
	}
	
	private void withdrawButtonAction() {
		String balanceStr = JOptionPane.showInputDialog("출금 액 : ");
		int balance = Integer.parseInt(balanceStr);
	}
}
