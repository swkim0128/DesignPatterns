package org.kitsoft.designpatterns.mvc.onlinebanking.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Component;

public class TransferDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField transferAccountTextField;
	private JTextField transferBalanceTextField;

	/**
	 * Create the dialog.
	 */
	public TransferDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(10, 10));
		{
			JLabel currentAccountLabel = new JLabel("New label");
			currentAccountLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(currentAccountLabel, BorderLayout.NORTH);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			{
				JPanel transferAccountPanel = new JPanel();
				panel.add(transferAccountPanel);
				transferAccountPanel.setLayout(null);
				{
					JLabel transferAccountLabel = new JLabel("입금 계좌번호");
					transferAccountLabel.setBounds(30, 18, 90, 20);
					transferAccountPanel.add(transferAccountLabel);
				}
				{
					transferAccountTextField = new JTextField();
					transferAccountTextField.setBounds(135, 10, 250, 40);
					transferAccountPanel.add(transferAccountTextField);
					transferAccountTextField.setColumns(10);
				}
			}
			{
				JPanel transferBankPanel = new JPanel();
				panel.add(transferBankPanel);
				transferBankPanel.setLayout(null);
				{
					JLabel transferBankLabel = new JLabel("입금 은행");
					transferBankLabel.setBounds(30, 18, 90, 20);
					transferBankPanel.add(transferBankLabel);
				}
				{
					JComboBox transferBankComboBox = new JComboBox();
					transferBankComboBox.setBounds(135, 10, 250, 40);
					transferBankPanel.add(transferBankComboBox);
				}
			}
			{
				JPanel transferBalancePanel = new JPanel();
				panel.add(transferBalancePanel);
				transferBalancePanel.setLayout(null);
				{
					JLabel transferBalanceLabel = new JLabel("입금액(원)");
					transferBalanceLabel.setBounds(30, 18, 90, 20);
					transferBalancePanel.add(transferBalanceLabel);
				}
				{
					transferBalanceTextField = new JTextField();
					transferBalanceTextField.setBounds(135, 10, 250, 40);
					transferBalancePanel.add(transferBalanceTextField);
					transferBalanceTextField.setColumns(10);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
