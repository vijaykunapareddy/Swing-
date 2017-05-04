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
public class CashInHand extends JFrame{
	
	JFrame f = new JFrame("Cash In Hand");
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField value1 = new JTextField("", 5);
	JTextField value2 = new JTextField("", 5);
	public static float cashInHand;
	final static float totalSales = TotalGaslineSales.totalSales;
	public CashInHand(){
		JLabel label = new JLabel("Mechanic Receipts total : "+PaidOut.mechanicTotal);
		JLabel l = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label);
		panel.add(l);
		JLabel label1 = new JLabel("Paid out Receipts total : "+TotalGaslineSales.paidOutResult);
		JLabel l1 = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label1);
		panel.add(l1);
		JLabel label2 = new JLabel("Total Gas Sales : "+totalSales);
		JLabel l2 = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label2);
		panel.add(l2);
		f.setLayout(new FlowLayout());
	    panel.add(new JLabel("Credit Card : "));
	    panel.add(value1);
	    panel.add(Box.createHorizontalStrut(15));
	    panel.add(new JLabel("Card Fee : "));
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
				  cashInHand = TotalGaslineSales.totalSales-(v1+v2+TotalGaslineSales.paidOutResult);
				  CompleteDetails cd = new CompleteDetails();
				  f.setVisible(false);
			  }
		});
		
	}

}
