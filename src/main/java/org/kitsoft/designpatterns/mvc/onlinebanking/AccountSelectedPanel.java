package org.kitsoft.designpatterns.mvc.onlinebanking;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;

public class AccountSelectedPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public AccountSelectedPanel() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
	
		String header[] = { "계좌번호", "은행" };
		DefaultTableModel model = new DefaultTableModel(header, 2);
		
		table = new JTable(model);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
	}

}
