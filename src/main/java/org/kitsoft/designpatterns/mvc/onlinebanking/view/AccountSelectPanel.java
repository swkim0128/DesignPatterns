package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.GridLayout;

import javax.swing.border.EmptyBorder;

import org.kitsoft.designpatterns.mvc.onlinebanking.model.Account;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.CustomerInfo;
import org.kitsoft.designpatterns.mvc.onlinebanking.model.DataAccessManager;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AccountSelectPanel extends JPanel {
	
	private JFrame superFrame;
	private JPanel accountSelectedPanel;
	private JPanel accountCreatePanel;
	
	private DataAccessManager dam = null;
	private CustomerInfo customer = null;	
	
	/**
	 * Create the panel.
	 */
	public AccountSelectPanel(JFrame superFrame) {
		super();
		this.superFrame = superFrame;
		accountSelectedPanel = new AccountSelectedPanel(superFrame);
		accountCreatePanel = new AccountCreatePanel(superFrame);
				
		initialize();
	}
	
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(80, 80, 80, 80));
		add(panel, BorderLayout.CENTER);
		
		JButton accountSelectButton = new JButton("계좌 선택");
		accountSelectButton.setBounds(125, 100, 400, 100);
		accountSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickedAccountSelectButton();
			}
		});
		panel.setLayout(null);
		panel.add(accountSelectButton);
		
		JButton accountCreateButton = new JButton("계좌 생성");
		accountCreateButton.setBounds(125, 232, 400, 100);
		accountCreateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onClickedAccountCreateButton();
			}
		});
		panel.add(accountCreateButton);
	}

	private void onClickedAccountSelectButton() {
		dam = DataAccessManager.getInstance();
		
		ArrayList<Account> temp = dam.findAccountList(customer.getID());
		
		if(temp.isEmpty()) {
			JOptionPane.showMessageDialog(null, "계좌가 없습니다.");
		}
		else {
			JMenuBar menu = superFrame.getJMenuBar();
			((MenuBar) menu).setBackPanel(this);
			((MenuBar) menu).setEnabledBackMenuItem(true);
			
			((AccountSelectedPanel) accountSelectedPanel).setTable(temp);
			
			superFrame.getContentPane().removeAll();
			superFrame.getContentPane().add(accountSelectedPanel, BorderLayout.CENTER);
			superFrame.revalidate();
			superFrame.repaint();			
		}
	}
	
	private void onClickedAccountCreateButton() {
		JMenuBar menu = superFrame.getJMenuBar();
		((MenuBar) menu).setBackPanel(this);
		((MenuBar) menu).setEnabledBackMenuItem(true);
		
		((AccountCreatePanel) accountCreatePanel).setCustomerInfo(customer);
		
		superFrame.getContentPane().removeAll();
		superFrame.getContentPane().add(accountCreatePanel, BorderLayout.CENTER);
		superFrame.revalidate();
		superFrame.repaint();
	}
	
	public void setCustomerInfo(CustomerInfo c) {
		this.customer = c;
		
		superFrame.setTitle("통합 은행 관리 시스템 - " + c.getName() + "님 환영합니다.");
	}
}
