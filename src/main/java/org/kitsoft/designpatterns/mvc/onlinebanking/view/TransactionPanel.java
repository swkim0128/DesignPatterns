package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import org.kitsoft.designpatterns.mvc.onlinebanking.controller.AccountObserver;
import org.kitsoft.designpatterns.mvc.onlinebanking.controller.BalanceInquiryController;
import org.kitsoft.designpatterns.mvc.onlinebanking.controller.DepositController;
import org.kitsoft.designpatterns.mvc.onlinebanking.controller.TransactionInvoker;
import org.kitsoft.designpatterns.mvc.onlinebanking.controller.WithdrawController;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.Account;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.AccountAccessManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TransactionPanel extends JPanel implements AccountObserver {
	private JFrame superFrame;
	private JPanel transactionInquirePanel;
	
	private AccountAccessManager aam = null;
	private TransactionInvoker invoker = null;
	private DepositController depositC = null;
	private WithdrawController withdrawC = null;
	private BalanceInquiryController balanceInquiryC = null;
	
	private Account account;
	private String accountNum;
	
	/**
	 * Create the panel.
	 */
	public TransactionPanel(JFrame superFrame) {
		super();
		this.superFrame = superFrame;
		transactionInquirePanel = new TransactionInquirePanel(superFrame);
		
		invoker = new TransactionInvoker();
		initialize();
	}
	
	private void initialize() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setAlignmentX(0.5f);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(30, 30, 30, 30));
		add(panel);
		panel.setLayout(new GridLayout(2, 3, 15, 15));
		
		JButton depositButton = new JButton("입금");
		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickedDepositButton();
			}
		});
		depositButton.setFocusPainted(false);
		depositButton.setContentAreaFilled(false);
		panel.add(depositButton);
		
		JButton withdrawButton = new JButton("출금");
		withdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickedWithdrawButton();
			}
		});
		withdrawButton.setFocusPainted(false);
		withdrawButton.setContentAreaFilled(false);
		panel.add(withdrawButton);
		
		JButton transactionInquireButton = new JButton("거래내역조회");
		transactionInquireButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickedTransactionInquireButton();
			}
		});
		transactionInquireButton.setFocusPainted(false);
		transactionInquireButton.setContentAreaFilled(false);
		panel.add(transactionInquireButton);
		
		JButton balanceInquireButton = new JButton("잔액조회");
		balanceInquireButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickedBalanceInquiryButton();
			}
		});
		balanceInquireButton.setFocusPainted(false);
		balanceInquireButton.setContentAreaFilled(false);
		panel.add(balanceInquireButton);
		
		JButton transferButton = new JButton("계좌이체");
		transferButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickedTransferButton();
			}
		});
		transferButton.setFocusPainted(false);
		transferButton.setContentAreaFilled(false);
		panel.add(transferButton);
		
	}
	
	private void onClickedDepositButton() {
		String balanceStr = JOptionPane.showInputDialog("입금 액 : ");
		int balance = Integer.parseInt(balanceStr);
		
		aam = AccountAccessManager.getInstance();
		aam.setAccount(account); 
		
		depositC = new DepositController(aam);
		
		invoker.setTransaction(depositC);
		invoker.order(String.valueOf(balance));
	}
	
	private void onClickedWithdrawButton() {
		String balanceStr = JOptionPane.showInputDialog("출금 액 : ");
		int balance = Integer.parseInt(balanceStr);
		
		aam = AccountAccessManager.getInstance();
		aam.setAccount(account); 
		
		withdrawC = new WithdrawController(aam);
		
		invoker.setTransaction(withdrawC);
		invoker.order(String.valueOf(balance));
//		balanceInquiryC = new BalanceInquiryController();
	}
	
	private void onClickedBalanceInquiryButton() {
		JOptionPane.showMessageDialog(null, "잔액 : " + account.getBalance());		
	}
	
	private void onClickedTransactionInquireButton() {
		JMenuBar menu = superFrame.getJMenuBar();
		((MenuBar) menu).setBackPanel(this);

		superFrame.getContentPane().removeAll();
		superFrame.getContentPane().add(transactionInquirePanel, BorderLayout.CENTER);
		superFrame.revalidate();
		superFrame.repaint();
	}
	
	private void onClickedTransferButton() {
		TransferDialog transferDialog = new TransferDialog();
		transferDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		transferDialog.setVisible(true);
	}
	
	public void update(Object o) {
		account = (Account)o;
	}
	
	public void setAccountNum(String num) {
		aam = AccountAccessManager.getInstance();
		
		this.account = aam.findAccount(num);
		account.registerObserver(this);
	}
}
