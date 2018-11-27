package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccountSelectedPanel extends JPanel {
	private AccountSettingFrame superFrame;
	private JTable table;

	private AccountSelectPanel accountSelectPanel;
	
	/**
	 * Create the panel.
	 */
	public AccountSelectedPanel() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
	
		String header[] = { "계좌번호", "은행" };
		DefaultTableModel model = new DefaultTableModel(header, 2) {
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
	
	public void setSuperFrame(AccountSettingFrame frame) {
		this.superFrame = frame;
	}
	
	public void movePanel() {
		accountSelectPanel = new AccountSelectPanel();
		accountSelectPanel.setSuperFrame(superFrame);

		superFrame.setNowPanel(accountSelectPanel);
		superFrame.getContentPane().removeAll();
		superFrame.getContentPane().add(accountSelectPanel);
		superFrame.revalidate();
		superFrame.repaint();
	}
	
	private void onDoubleClickedTable() {
		int result = JOptionPane.showConfirmDialog(null, "이 계좌가 맞습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
		
		if(confirmDialog(result)) {
			TransactionFrame transactionFrame = new TransactionFrame();
			transactionFrame.setVisible(true);
			superFrame.setVisible(false);			
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
}
