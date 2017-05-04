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
public class PaidOut extends JFrame{
	
	JFrame f = new JFrame("Paid Out Receipts");
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField value1 = new JTextField("", 5);
	JTextField value2 = new JTextField("", 5);
	JTextField value3 = new JTextField("", 5);
	JTextField value4 = new JTextField("", 5);
	JTextField value5 = new JTextField("", 5);
	public static float pOResult;
	final static float mechanicTotal = Mechanic.result;
	public PaidOut(){
		JLabel label = new JLabel("Mechanic Receipts total : "+mechanicTotal);
		JLabel l = new JLabel("<html>          <br>			</html>", SwingConstants.CENTER);
		panel.add(label);
		panel.add(l);
		f.setLayout(new FlowLayout());
	    panel.add(new JLabel("Value: 1"));
	    panel.add(value1);
	    panel.add(Box.createHorizontalStrut(15));
	    panel.add(new JLabel("Value: 2"));
	    panel.add(value2);
	    panel.add(Box.createHorizontalStrut(5));
	    panel.add(new JLabel("Value: 3"));
	    panel.add(value3);
	    panel.add(Box.createHorizontalStrut(5));
	    panel.add(new JLabel("Value: 4"));
	    panel.add(value4);
	    panel.add(Box.createHorizontalStrut(5));
	    panel.add(new JLabel("Value: 5"));
	    panel.add(value5);
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
			  String text3 = value3.getText();
			  String text4 = value4.getText();
			  String text5 = value5.getText();
			  System.out.println(text5);
			  float v1;
			  float v2;
			  float v3;
			  float v4;
			  float v5;
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
			  if (text3.isEmpty()) {
				  v3 = 0.00f;
			  } else {
				  v3 = Float.parseFloat(text3);
			  }
			  if (text4.isEmpty()) {
				  v4 = 0.00f;
			  } else {
				  v4 = Float.parseFloat(text4);
			  }
			  if (text5.isEmpty()) {
				  v5 = 0.00f;
			  } else {
				  v5 = Float.parseFloat(text5);
			  }
			  pOResult = v1+v2+v3+v4+v5;
			  TotalGaslineSales tgs = new TotalGaslineSales();
			  f.setVisible(false);
		  }
		});
	}
}
