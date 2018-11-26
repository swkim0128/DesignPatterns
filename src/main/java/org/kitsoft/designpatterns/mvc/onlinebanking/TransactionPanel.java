package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

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
		depositButton.setFocusPainted(false);
		depositButton.setContentAreaFilled(false);
		panel.add(depositButton);
		
		JButton withdrawButton = new JButton("출금");
		withdrawButton.setFocusPainted(false);
		withdrawButton.setContentAreaFilled(false);
		panel.add(withdrawButton);
		
		JButton transactionInquireButton = new JButton("거래내역조회");
		transactionInquireButton.setFocusPainted(false);
		transactionInquireButton.setContentAreaFilled(false);
		panel.add(transactionInquireButton);
		
		JButton balanceInquireButton = new JButton("잔액조회");
		balanceInquireButton.setFocusPainted(false);
		balanceInquireButton.setContentAreaFilled(false);
		panel.add(balanceInquireButton);
		
		JButton transferButton = new JButton("계좌이체");
		transferButton.setFocusPainted(false);
		transferButton.setContentAreaFilled(false);
		panel.add(transferButton);

	}

}
