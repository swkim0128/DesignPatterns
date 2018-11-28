package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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

public class AccountCreatePanel extends JPanel {
	private AccountSettingFrame superFrame;
	
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
	
	/**
	 * Create the panel.
	 */
	public AccountCreatePanel() {
		setBorder(new EmptyBorder(5, 5, 0, 5));
		setLayout(null);
		
		accountCreateButton = new JButton("만들기");
		accountCreateButton.setBounds(101, 243, 120, 40);
		add(accountCreateButton);
		
		cancelButton = new JButton("취소");
		cancelButton.setBounds(236, 243, 120, 40);
		add(cancelButton);
		
		JPanel accountNumPanel = new JPanel();
		accountNumPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		accountNumPanel.setBounds(80, 31, 300, 40);
		add(accountNumPanel);
		accountNumPanel.setLayout(new BoxLayout(accountNumPanel, BoxLayout.X_AXIS));
		
		accountNumLabel = new JLabel("계좌 번호 : ");
		accountNumPanel.add(accountNumLabel);
		
		accountNumTextField = new JTextField();
		accountNumPanel.add(accountNumTextField);
		accountNumTextField.setColumns(10);
		
		JPanel bankSelectPanel = new JPanel();
		bankSelectPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		bankSelectPanel.setBounds(80, 83, 300, 40);
		add(bankSelectPanel);
		bankSelectPanel.setLayout(new BoxLayout(bankSelectPanel, BoxLayout.X_AXIS));
		
		bankSelectLabel = new JLabel("은행 선택 : ");
		bankSelectPanel.add(bankSelectLabel);
		
		bankSelectComboBox = new JComboBox();
		bankSelectComboBox.setModel(new DefaultComboBoxModel(new String[] {"NH 농협", "하나은행", "신한은행", "축협", "수협"}));
		bankSelectPanel.add(bankSelectComboBox);
		
		JPanel accountTypePanel = new JPanel();
		accountTypePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		accountTypePanel.setBounds(80, 135, 300, 40);
		add(accountTypePanel);
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
						showAccountLimitPanel();
					}
					else if(item.equals("마이너스 계좌")) {
						hideAccountLimitPanel();
					}
				}
			}
		});
		accountTypePanel.add(accountTypeComboBox);
		
		accountLimitPanel = new JPanel();
		accountLimitPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		accountLimitPanel.setBounds(80, 187, 300, 40);
		add(accountLimitPanel);
		accountLimitPanel.setLayout(new BoxLayout(accountLimitPanel, BoxLayout.X_AXIS));
		
		accountLimitLabel = new JLabel("신용 한도 : ");
		accountLimitPanel.add(accountLimitLabel);
		
		accountLitmitTextField = new JTextField();
		accountLimitPanel.add(accountLitmitTextField);
		accountLitmitTextField.setColumns(10);

	}
	
	public void setSuperFrame(AccountSettingFrame frame) {
		this.superFrame = frame;
	}
	
	public void moveSelectPanel() {
		AccountSelectPanel accountSelectPanel = new AccountSelectPanel();
		accountSelectPanel.setSuperFrame(superFrame);

		superFrame.setNowPanel(accountSelectPanel);
		superFrame.getContentPane().removeAll();
		superFrame.getContentPane().add(accountSelectPanel);
		superFrame.revalidate();
		superFrame.repaint();
	}
	
	private void showAccountLimitPanel() {
		accountLimitPanel.setVisible(true);
	}
	private void hideAccountLimitPanel() {
		accountLimitPanel.setVisible(false);
	}
}
