package com.reshma;

import java.awt.event.*;

import javax.swing.*;

	public class Menu {
		public void MovieAddFrame() {
			JFrame frame = new JFrame("GUI");
			frame.setBounds(20, 20, 600, 400);
			
		JButton bMovieAdd = new JButton("Add"); 
		bMovieAdd.setBounds(150,150, 80,30);
		bMovieAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				bMovieAdd.setText("hello");
			}
		});
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(bMovieAdd);
		
		}
		
		
	
	}

	
	