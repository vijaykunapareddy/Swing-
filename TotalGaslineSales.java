package com.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class TotalGaslineSales extends JFrame{
	
	JFrame f = new JFrame("Total Gasline Sales");
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField value1 = new JTextField("", 5);
	JTextField value2 = new JTextField("", 5);
	public static float totalSales;
	final static float paidOutResult = PaidOut.pOResult;
	public TotalGaslineSales(){
		JLabel label = new JLabel("Mechanic Receipts total : "+PaidOut.mechanicTotal);
		JLabel l = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label);
		panel.add(l);
		JLabel label1 = new JLabel("Paid Out Receipts total : "+paidOutResult);
		JLabel l1 = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label1);
		panel.add(l1);
		f.setLayout(new FlowLayout());
	    panel.add(new JLabel("Total Gas : "));
	    panel.add(value1);
	    panel.add(Box.createHorizontalStrut(15));
	    panel.add(new JLabel("Store : "));
	    panel.add(value2);
	    panel.add(Box.createHorizontalStrut(5));
		button.setText("Add Values");
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
				  String text1 = value1.getText();
				  String text2 = value2.getText();
				  float v1;
				  float v2;
				  if (text1.isEmpty()) {
					  v1 = 0.00f;
				  } else {
					  v1 = Float.parseFloat(text1);
				  }
				  if (text2.isEmpty()) {
					  v2 = 0.00f;
				  } else {
					  v2 = Float.parseFloat(text2);
				  }
				  totalSales = v1+v2+PaidOut.mechanicTotal;
				  System.out.println(totalSales);
				  CashInHand cih = new CashInHand();
				  f.setVisible(false);
			  }
		});
	}
}
