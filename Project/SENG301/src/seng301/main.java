package seng301;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Buttons and labels for the start up screen
		//maybe changed later so that the user does not have to press ok to continue
		ok = new JButton("Start");
	    welcome = new JLabel("Program Name");
	    frame = new JFrame("Mega Mahjong");
	    
	    //BorderLayout used because this screen is very simple
	    frame.setSize(300, 250);
	    first = new JPanel(new BorderLayout());
	    first.add(ok, BorderLayout.SOUTH);
	    first.add(welcome, BorderLayout.CENTER);
	   
	    frame.add(first);
	    //frame.pack();
	    frame.setVisible(true);
	    //Layouts will be refined later
	    
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mainWin main = new mainWin();
				frame.dispose();
			}
	    	
	    });
		
	}
	
	//series of getters for testing purposes and future use
	public JPanel getFirst(){
		return first;
	}
	
	public JButton getOk(){
		return ok;
	}
	
	public JLabel getWelcome(){
		return welcome;
	}
	
	public JFrame getFrame(){
		return frame;
	}
	private static JFrame frame;
	private static JButton ok;
	private static JLabel welcome;
	private static JPanel first;
	
}

