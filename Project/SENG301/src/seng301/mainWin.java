package seng301;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWin {
	
	public mainWin(){
		frame = new JFrame("Main Menu");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 225);
		
		//buttons visible on the front screen
		//more may be added later
		startBtn = new JButton("Play a game");
		ruleBtn = new JButton("How to Play");
		shopBtn = new JButton("Shop");
		
		//BoxLayout used because buttons are stacked vertically
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//Spaces used to put space inbetween buttons
		//may be removed when we figure how to space the buttons without them
		space = new JLabel("   ");
		space2 = new JLabel("   ");
		placeholder = new JLabel("Placeholder");
		placeholder2 = new JLabel("Placeholder");
		
		startBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		ruleBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		shopBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		space.setAlignmentX(Component.CENTER_ALIGNMENT);
		placeholder.setAlignmentX(Component.CENTER_ALIGNMENT);
		space2.setAlignmentX(Component.CENTER_ALIGNMENT);
		placeholder2.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panel.add(placeholder);
		panel.add(startBtn);
		panel.add(space);
		panel.add(ruleBtn);
		panel.add(space2);
		panel.add(shopBtn);
		panel.add(placeholder2);
		
		
		
		frame.add(panel);
		frame.setVisible(true);
		
		startBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.dispose();
				difWin dif = new difWin();
				}
		});
		
		ruleBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.dispose();
				gameRule rules = new gameRule();
				}
		});
		
		//this button is not planned to do anything until the program is largely finished\
		//so for now, it may not be clicked
		shopBtn.setEnabled(false);
	

	}
	
	//series of getters for testing purposes and future use
	public JFrame getFrame(){
		return frame;
	}
	
	public JButton getStart(){
		return startBtn;
	}
	
	public JButton getRule(){
		return ruleBtn;
		
	}
	
	public JButton getShop(){
		return shopBtn;
	}
	
	public JPanel getPanel(){
		return panel;
	}
	
	public JLabel getSpace(){
		return space;
	}
	
	public JLabel getSpace2(){
		return space2;
		
	}
	public JLabel getName(){
		return placeholder;
	}
	
	public JLabel getMoney(){
		return placeholder2;
	}
	
	private static JFrame frame;
	private static JButton startBtn;
	private static JButton ruleBtn;
	private static JButton shopBtn;
	private static JPanel panel;
	private static JLabel space;
	private static JLabel space2;
	private static JLabel placeholder;
	private static JLabel placeholder2;
	
	
}



