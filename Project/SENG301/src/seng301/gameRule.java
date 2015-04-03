package seng301;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameRule {
	
	public gameRule() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		//BorderLayout used since rules page layout is fairly simple
		JPanel panel = new JPanel(new BorderLayout());
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		JPanel center = new JPanel();
		JPanel btnPanel = new JPanel();
		
		//Placeholder text until it is written and appropriate images have been acquired
		txt = new JLabel("Placeholder Text");
		txt2 = new JLabel("More Text");
		img = new JLabel("Placeholder Image");
		
		//navigation buttons for rules and a back button to return to menu
		prev= new JButton("Previous");
		next = new JButton("Next");
		back = new JButton("Back");
		
		left.setBorder(BorderFactory.createEtchedBorder());
		right.setBorder(BorderFactory.createEtchedBorder());
		
		left.add(txt);
		center.add(img);
		right.add(txt2);
		
		btnPanel.add(prev);
		btnPanel.add(back);
		btnPanel.add(next);
		
		prev.setEnabled(false);
		//previous button should not be available on the first page
		
		
		panel.add(left, BorderLayout.WEST);
		panel.add(right, BorderLayout.EAST);
		panel.add(center, BorderLayout.CENTER);
		panel.add(btnPanel, BorderLayout.SOUTH);
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainWin main = new mainWin();
			}
		});
		
		frame.add(panel);
		frame.setVisible(true);
		
		
		
		
		
		
	}
	
	//series of getters for testing purposes and future use
	public JFrame getFrame(){
		return frame;
	}
	
	public JLabel getTxt(){
		return txt;
	}
	
	public JLabel getTxt2(){
		return txt2;
	}
	
	public JLabel getImg(){
		return img;
	}
	
	public JButton getPrev(){
		return prev;
	}
	
	public JButton getNext(){
		return next;
	}
	
	public JButton getBack(){
		return back;
	}
	private static JFrame frame;
	private static JLabel txt;
	private static JLabel txt2;
	private static JLabel img;
	private static JButton prev;
	private static JButton back;
	private static JButton next;
}
