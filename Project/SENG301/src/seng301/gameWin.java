package seng301;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameWin {

	public gameWin() {
		gameWin = new JFrame("Game Screen");
		gameWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gameWin.setSize(750, 500);
		
		//GridBagLayout used since this state is the most complicated
		//GridBagLayout gives us the most freedom for this
		//Certain portions have not worked out, so current layout is temporary
		JPanel panel = new JPanel(new GridBagLayout());
		JPanel panelCenter = new JPanel();
		JPanel panelAcross = new JPanel();
		JPanel panelLeft = new JPanel();
		JPanel panelRight = new JPanel();
		JPanel panelHand = new JPanel();
		
		GridBagConstraints c = new GridBagConstraints();	
		c.gridx = 2;
		c.gridy = 0;
		c.anchor = GridBagConstraints.PAGE_START;
		panel.add(panelAcross, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.LINE_START;
		panel.add(panelLeft, c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.anchor = GridBagConstraints.CENTER;
		panel.add(panelCenter, c);
		
		c.gridx = 2;
		c.gridy = 1;
		c.anchor = GridBagConstraints.LINE_END;
		panel.add(panelRight, c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 3;
		c.anchor = GridBagConstraints.LAST_LINE_START;
		panel.add(panelHand, c);
		
		
		
		//Buttons for each of the cards in hand
		//buttons will be programmed in a future release
		JButton card1 = new JButton(" ");
		JButton card2 = new JButton(" ");
		JButton card3 = new JButton(" ");
		JButton card4 = new JButton(" ");
		JButton card5 = new JButton(" ");
		JButton card6 = new JButton(" ");
		JButton card7 = new JButton(" ");
		JButton card8 = new JButton(" ");
		JButton card9 = new JButton(" ");
		JButton card10 = new JButton(" ");
		JButton card11 = new JButton(" ");
		JButton card12 = new JButton(" ");
		JButton card13 = new JButton(" ");
		JButton endGame = new JButton("End Game");
		
		endGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				gameWin.dispose();
				mainWin main = new mainWin();
			}
		});
		
		//Button that will be used to pull up a discarded tiles dialogue
		JButton center = new JButton("Place Holder");
		
		panelHand.add(card1);
		panelHand.add(card2);
		panelHand.add(card3);
		panelHand.add(card4);
		panelHand.add(card5);
		panelHand.add(card6);
		panelHand.add(card7);
		panelHand.add(card8);
		panelHand.add(card9);
		panelHand.add(card10);
		panelHand.add(card11);
		panelHand.add(card12);
		panelHand.add(card13);
		panelHand.add(endGame);
		
		panelCenter.add(center);
		
		gameWin.add(panel);
		
		gameWin.setVisible(true);
		
		
		
		
	
	}
	
	//series of getters for testing purposes and future use
	public JFrame getGameWin(){
		return gameWin;
	}
	
	public JButton getCard1(){
		return card1;
	}
	public JButton getCard2(){
		return card2;
	}
	public JButton getCard3(){
		return card3;
	}
	public JButton getCard4(){
		return card4;
	}
	public JButton getCard5(){
		return card5;
	}
	public JButton getCard6(){
		return card6;
	}
	public JButton getCard7(){
		return card7;
	}
	public JButton getCard8(){
		return card8;
	}
	public JButton getCard9(){
		return card9;
	}
	public JButton getCard10(){
		return card10;
	}
	public JButton getCard11(){
		return card11;
	}
	public JButton getCard12(){
		return card12;
	}
	public JButton getCard13(){
		return card13;
	}
	public JButton getEndGame(){
		return endGame;
	}
	private static JFrame gameWin;
	private static JButton card1;
	private static JButton card2;
	private static JButton card3;
	private static JButton card4;
	private static JButton card5;
	private static JButton card6;
	private static JButton card7;
	private static JButton card8;
	private static JButton card9;
	private static JButton card10;
	private static JButton card11;
	private static JButton card12;
	private static JButton card13;
	private static JButton endGame;
	
}
