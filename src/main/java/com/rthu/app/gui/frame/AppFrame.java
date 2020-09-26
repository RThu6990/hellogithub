package com.rthu.app.gui.frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JLabel bigLabel;

	public AppFrame() {
		super("Hello GitHub!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		bigLabel = new JLabel("Hello GitHub!", new ImageIcon(getToolkit().getImage(getClass().getResource("/img/github_logo.png"))), 
				JLabel.CENTER);
		bigLabel.setFont(new Font("Arial", Font.BOLD, 50));
		bigLabel.setHorizontalTextPosition(JLabel.CENTER);
		bigLabel.setVerticalTextPosition(JLabel.BOTTOM);
		add(bigLabel, BorderLayout.CENTER);
		
		pack();
		setFrameLocationToCenter();
	}

	private void setFrameLocationToCenter() {
		Rectangle screenSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		int x = (int) ((screenSize.getWidth() - getWidth()) / 2);
		int y = (int) ((screenSize.getHeight() - getHeight()) / 2);
		setLocation(new Point(x, y));
	}

}
