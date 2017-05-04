package com.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class CompleteDetails extends JFrame {
	JFrame f = new JFrame("Complete Details");
	JPanel panel = new JPanel();
	JButton button = new JButton();
	final static float cashInHand = CashInHand.cashInHand;
	final static float totalSales = CashInHand.totalSales;
	public CompleteDetails(){
		JLabel label = new JLabel("Mechanic Receipts total : "+PaidOut.mechanicTotal);
		JLabel l = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label);
		panel.add(l);
		JLabel label1 = new JLabel("Paid out Receipts total : "+TotalGaslineSales.paidOutResult);
		JLabel l1 = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label1);
		panel.add(l1);
		JLabel label2 = new JLabel("Cash in Hand : "+cashInHand);
		JLabel l2 = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label2);
		panel.add(l2);
		JLabel label3 = new JLabel("Total Gas Sales : "+totalSales);
		JLabel l3 = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label3);
		panel.add(l3);
		JButton b3 = new JButton("CLOSE");
		b3.setBounds(50, 375, 250, 50);
		f.setLayout(new FlowLayout());
		f.pack();
	    f.setLocationRelativeTo(null);
	    f.setVisible(true);
		panel.add(button);
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		f.setVisible(true);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			  {
				f.dispose();
			  }
		});
	}
}
