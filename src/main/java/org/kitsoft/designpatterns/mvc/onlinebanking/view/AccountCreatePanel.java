package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.kitsoft.designpatterns.mvc.onlinebanking.model.Account;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.AccountAccessManager;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.AccountFactory;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.CustomerInfo;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.MinusAccount;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import java.awt.BorderLayout;

public class AccountCreatePanel extends JPanel {
	private JFrame superFrame;
	
	private JTextField accountNumTextField;
	private JTextField accountLitmitTextField;
	
	private JLabel accountNumLabel;
	
	private JLabel bankSelectLabel;
	private JComboBox bankSelectComboBox;
	
	private JLabel accountTypeLabel;
	private JComboBox accountTypeComboBox;

	private JLabel accountLimitLabel;

	private JButton accountCreateButton;
	private JButton cancelButton;
	
	private JPanel accountLimitPanel;
	private JPanel panel;
	private JPanel buttonPanel;
	
	private AccountAccessManager aam = null;
	private CustomerInfo customer = null;
	
	/**
	 * Create the panel.
	 */
	public AccountCreatePanel(JFrame superFrame) {
		super();
		this.superFrame = superFrame;
		
		initialize();
	}
	
	private void initialize() {
		setBorder(new EmptyBorder(5, 5, 0, 5));
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JPanel accountNumPanel = new JPanel();
		accountNumPanel.setBounds(70, 50, 500, 50);
		panel.add(accountNumPanel);
		accountNumPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		accountNumPanel.setLayout(new BoxLayout(accountNumPanel, BoxLayout.X_AXIS));
		
		accountNumLabel = new JLabel("계좌 번호 : ");
		accountNumPanel.add(accountNumLabel);
		
		accountNumTextField = new JTextField();
		accountNumPanel.add(accountNumTextField);
		accountNumTextField.setColumns(10);
		
		JPanel bankSelectPanel = new JPanel();
		bankSelectPanel.setBounds(70, 115, 500, 50);
		panel.add(bankSelectPanel);
		bankSelectPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		bankSelectPanel.setLayout(new BoxLayout(bankSelectPanel, BoxLayout.X_AXIS));
		
		bankSelectLabel = new JLabel("은행 선택 : ");
		bankSelectPanel.add(bankSelectLabel);
		
		bankSelectComboBox = new JComboBox();
		bankSelectComboBox.setModel(new DefaultComboBoxModel(new String[] {"NH 농협", "하나은행", "신한은행", "축협", "수협"}));
		bankSelectPanel.add(bankSelectComboBox);
		
		JPanel accountTypePanel = new JPanel();
		accountTypePanel.setBounds(70, 181, 500, 50);
		panel.add(accountTypePanel);
		accountTypePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		accountTypePanel.setLayout(new BoxLayout(accountTypePanel, BoxLayout.X_AXIS));
		
		accountTypeLabel = new JLabel("계좌 유형 : ");
		accountTypePanel.add(accountTypeLabel);
		
		accountTypeComboBox = new JComboBox();
		accountTypeComboBox.setModel(new DefaultComboBoxModel(new String[] {"일반 계좌", "마이너스 계좌"}));
		accountTypeComboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange() == ItemEvent.SELECTED) {
					String item = (String)event.getItem();
					
					if(item.equals("일반 계좌")) {
						hideAccountLimitPanel();
					}
					else if(item.equals("마이너스 계좌")) {
						showAccountLimitPanel();
					}
				}
			}
		});
		accountTypePanel.add(accountTypeComboBox);
		
		accountLimitPanel = new JPanel();
		accountLimitPanel.setBounds(70, 250, 500, 50);
		panel.add(accountLimitPanel);
		accountLimitPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		accountLimitPanel.setLayout(new BoxLayout(accountLimitPanel, BoxLayout.X_AXIS));
		accountLimitLabel = new JLabel("신용 한도 : ");
		accountLimitPanel.add(accountLimitLabel);
		
		accountLitmitTextField = new JTextField();
		accountLimitPanel.add(accountLitmitTextField);
		accountLitmitTextField.setColumns(10);
		accountLimitPanel.setVisible(false); 
		
		buttonPanel = new JPanel();
		add(buttonPanel, BorderLayout.SOUTH);
		
		accountCreateButton = new JButton("만들기");
		accountCreateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickedCreateButton();
			}
		});
		buttonPanel.add(accountCreateButton);
		
		cancelButton = new JButton("취소");
		buttonPanel.add(cancelButton);
		
	}
	
	private void showAccountLimitPanel() {
		accountLimitPanel.setVisible(true);
	}
	private void hideAccountLimitPanel() {
		accountLimitPanel.setVisible(false);
	}
	
	private void onClickedCreateButton() {
		AccountFactory af = new AccountFactory();
		aam = AccountAccessManager.getInstance();
		
		String customerId = customer.getID();
		String accountNum = accountNumTextField.getText();
		String bank = bankSelectComboBox.getSelectedItem().toString();
		String accountType = accountTypeComboBox.getSelectedItem().toString();
		String accountLimit = accountLitmitTextField.getText();
		
		Account a = af.create(customerId, accountNum, bank, accountType);
		
		if(accountType.equals("마이너스 계좌")) {
			((MinusAccount) a).setCreditLimit(Integer.parseInt(accountLimit));
		}
		
		if(aam.createAccount(a)) {
			JOptionPane.showMessageDialog(null, "계좌가 생성되었습니다.");
		}
		else {
			JOptionPane.showMessageDialog(null, "계좌번호가 이미 있습니다.");			
		}
	}
	
	public void setCustomerInfo(CustomerInfo c) {
		this.customer = c;
	}
}
