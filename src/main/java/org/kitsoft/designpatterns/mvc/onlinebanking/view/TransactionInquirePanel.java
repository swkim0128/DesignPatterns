package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.Font;

public class TransactionInquirePanel extends JPanel {
	private JFrame superFrame;
	
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TransactionInquirePanel(JFrame superFrame) {
		super();
		this.superFrame = superFrame;
		
		initialize();
	}
	
	private void initialize() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(5, 10));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		String header[] = { "날짜", "대상 계좌번호", "거래유형", "금액" };
		DefaultTableModel tableModel = new DefaultTableModel(header, 0);
		
		table = new JTable(tableModel);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new EmptyBorder(5, 5, 5, 5));
		scrollPane.setViewportView(table);
		
	}
}
