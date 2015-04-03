package seng301;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class difWin {

	public  difWin(){
		frame = new JFrame("Go Hard or Go Home");
		
		frame.setSize(375, 150);
		
		dif = new JLabel("Select a Difficulty:");
		
		//buttons to select difficulty
		eb = new JButton("Easy\t$x (1x)");
		mb = new JButton("Intermediate\t$x (5x)");
		hb = new JButton("Hard\t$x (10x)");
		
		//#x are the reward multipliers, placeholder numbers for now
		
		eb.setAlignmentX(Component.CENTER_ALIGNMENT);
		mb.setAlignmentX(Component.CENTER_ALIGNMENT);
		hb.setAlignmentX(Component.CENTER_ALIGNMENT);
		dif.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//BoxLayout used because items are supposed to be stacked vertically
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(dif);
		panel.add(eb);
		panel.add(mb);
		panel.add(hb);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		eb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.dispose();
				gameWin main = new gameWin();
			}
		});
		
		mb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.dispose();
				gameWin main = new gameWin();
			}
		});
		
		hb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.dispose();
				gameWin main = new gameWin();
			}
		});
		
		//Place holder code, each button will be programmed differently.
		
	}
	
	//series of getters for tests and future use if needed
	public JFrame getFrame(){
		return frame;
	}
	
	public JLabel getDif(){
		return dif;
	}
	
	public JButton getEb(){
		return eb;
	}
	public JButton getMb(){
		return mb;
	}
	public JButton getHb(){
		return hb;
	}
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel dif;
	private static JButton eb;
	private static JButton mb;
	private static JButton hb;
}
	
