package com.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Mechanic extends JFrame{

	JFrame f = new JFrame("Mechanic Receipts");
	JPanel panel = new JPanel();
	JButton button = new JButton();
	public static float result;
	ArrayList<Integer> listOfValues = new ArrayList<Integer>();
	JTextField value1 = new JTextField("", 5);
	JTextField value2 = new JTextField("", 5);
	JTextField value3 = new JTextField("", 5);
	JTextField value4 = new JTextField("", 5);
	JTextField value5 = new JTextField("", 5);
	JTextField value6 = new JTextField("", 5);
	JTextField value7 = new JTextField("", 5);
	JTextField value8 = new JTextField("", 5);
	JTextField value9 = new JTextField("", 5);
	JTextField value10 = new JTextField("", 5);
	public Mechanic(){
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
	    panel.add(new JLabel("Value: 6"));
	    panel.add(value6);
	    panel.add(Box.createHorizontalStrut(5));
	    panel.add(new JLabel("Value: 7"));
	    panel.add(value7);
	    panel.add(Box.createHorizontalStrut(5));
	    panel.add(new JLabel("Value: 8"));
	    panel.add(value8);
	    panel.add(Box.createHorizontalStrut(5));
	    panel.add(new JLabel("Value: 9"));
	    panel.add(value9);
	    panel.add(Box.createHorizontalStrut(5));
	    panel.add(new JLabel("Value: 10"));
	    panel.add(value10);
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
			  String text6 = value6.getText();
			  String text7 = value7.getText();
			  String text8 = value8.getText();
			  String text9 = value9.getText();
			  String text10 = value10.getText();
			  float v1;
			  float v2;
			  float v3;
			  float v4;
			  float v5;
			  float v6;
			  float v7;
			  float v8;
			  float v9;
			  float v10;
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
			  if (text6.isEmpty()) {
				  v6 = 0.00f;
			  } else {
				  v6 = Float.parseFloat(text6);
			  }
			  if (text7.isEmpty()) {
				  v7 = 0.00f;
			  } else {
				  v7 = Float.parseFloat(text7);
			  }
			  if (text8.isEmpty()) {
				  v8 = 0.00f;
			  } else {
				  v8 = Float.parseFloat(text8);
			  }
			  if (text9.isEmpty()) {
				  v9 = 0.00f;
			  } else {
				  v9 = Float.parseFloat(text9);
			  }
			  if (text10.isEmpty()) {
				  v10 = 0.00f;
			  } else {
				  v10 = Float.parseFloat(text10);
			  }
			  System.out.println(v1);
			  System.out.println(v2);
			  System.out.println(v3);
			  System.out.println(v4);
			  System.out.println(v5);
			  result = v1+v2+v3+v4+v5+v6+v7+v8+v9+v10;
			  
			  PaidOut po = new PaidOut();
			  f.setVisible(false); 
		  }
		});
	}
}
