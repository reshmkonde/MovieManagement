package com.reshma;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MovieAddFrame {
	
	public MovieAddFrame() {
		JFrame frame = new JFrame("GUI");
		frame.setBounds(20, 20, 600, 400);
		
		JLabel lApplicationName = new JLabel("MovieManagement "); 
		lApplicationName.setBounds(200, 10, 200, 50);
		lApplicationName.setFont(new Font("Serif", Font.BOLD, 25));
		
		JLabel lMovieName = new JLabel("Movie Name"); 
		lMovieName.setBounds(30, 50, 100, 60);
		//lApplicationName1.setFont(new Font("Serif", Font.BOLD,20));
		JTextField tMovieName = new JTextField();
		tMovieName.setBounds(150, 70, 200, 25);
		
		JLabel lmsg= new JLabel();
		lmsg.setBounds(150, 200, 200, 50);
		
		JButton bMovieClear = new JButton("Clear");
		bMovieClear.setBounds(250,150, 80,30);
		bMovieClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tMovieName.setText("");
				lmsg.setText("");
			}
		});

				
		
		
		JButton bMovieAdd = new JButton("Add"); 
		bMovieAdd.setBounds(150,150, 80,30);
		bMovieAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Movie movie = new Movie();
				MovieDAO movieDAO = new MovieDAO();
				
				movie.setName(tMovieName.getText());
				
				int res=movieDAO.saveMovie(movie);
				if(res==1) {
					lmsg.setText("Success insertion");
					tMovieName.setText("");
				}else {
					lmsg.setText("Failure insertion");
				}
				
			}
		});
		
			
			
		frame.add(lApplicationName);
		frame.add(lMovieName);
		frame.add(tMovieName);		
		frame.add(bMovieAdd);
		frame.add(bMovieClear);
		frame.add(lmsg);
		
		frame.setLayout(null);
		frame.setVisible(true);
	
}
}
