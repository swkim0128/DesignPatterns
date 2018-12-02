package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import org.kitsoft.designpatterns.mvc.onlinebanking.model.Account;

import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AccountSelectedPanel extends JPanel {
	private JFrame superFrame;
	private JPanel nextPanel;
	
	private JTable table;
	private DefaultTableModel model;
	
	/**
	 * Create the panel.
	 */
	public AccountSelectedPanel(JFrame superFrame) {
		super();
		this.superFrame = superFrame;
		nextPanel = new TransactionPanel(superFrame);
		
		initialize();
	}
	
	private void initialize() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		String header[] = { "계좌번호", "은행" };
		model = new DefaultTableModel(header, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					onDoubleClickedTable();
				}
			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
	}
	
	private void onDoubleClickedTable() {
		int result = JOptionPane.showConfirmDialog(null, "이 계좌가 맞습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
		
		if(confirmDialog(result)) {
			JMenuBar menu = superFrame.getJMenuBar();
			((MenuBar) menu).setBackPanel(this);

			String accountNum = table.getValueAt(table.getSelectedRow(), 0).toString();
			((TransactionPanel) nextPanel).setAccountNum(accountNum);
			
			superFrame.getContentPane().removeAll();
			superFrame.getContentPane().add(nextPanel, BorderLayout.CENTER);
			superFrame.revalidate();
			superFrame.repaint();
		}
		else {
			
		}
	}
	
	private boolean confirmDialog(int result) {
		if(result == JOptionPane.YES_OPTION) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setTable(ArrayList<Account> accounts) {
		model.setNumRows(0);
			
		for(Account a : accounts) {
			model.addRow(new String[] { a.getAccountNum(), a.getBankName() });			
		}
	}
}
