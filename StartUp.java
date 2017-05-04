package com.GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class StartUp extends JFrame{
	
	public static void main(String s[]) throws IOException {
		
		final JFrame frame = new JFrame("Exon Gas Station");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("Welcome to Billing ...");
		JButton button = new JButton();
		button.setText("Start Process");
		//BufferedImage img = ImageIO.read(new File("F:\\gas-station-picture.jpg"));
		//JLabel background = new JLabel(new ImageIcon(img));
		//panel.add(background);
		button.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Mechanic mechanic = new Mechanic();   
		      frame.setVisible(false); // Hide current frame
		  }
		});
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		frame.setBounds(100, 100, 500, 500);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
