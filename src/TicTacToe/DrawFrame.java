package TicTacToe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Painter.DrawPanel;

public class DrawFrame extends JFrame
implements ActionListener
{
	// Array of names corresponding to the possible colors
	private boolean player, shape;
	
	private JButton[] buttons = new JButton[9]; // button to undo the last shape drawn
	
	// constructor
	public DrawFrame()
	{
	   super("TicTacToe");
	   
	   player = false; // player = 1 is false, player = 2 is true
	   shape = false; // shape = cross is false, shape = circle is true
	   
	   // create a panel to store the components at the top of the frame
	   JPanel panel = new JPanel(new GridLayout(3,3,0,0));
	   
	   // add the top panel to the frame
	   add(panel, BorderLayout.NORTH);
	   
	   // define the buttons
	   defineButtons(panel);
	   
	   //set the frame content as panel
	   setContentPane(panel);
	     
	} // end DrawFrame constructor
	
	private void defineButtons(JPanel panel)
	{
		// Define all the buttons
		for (JButton button : buttons) {
			
			button = new JButton("");
			button.addActionListener(this);
			button.setPreferredSize(new Dimension(200, 200));
			
			panel.add(button);
		}
	}
	
	// handle button clicks
	public void actionPerformed(ActionEvent e)
	{
		for (JButton button: buttons) {
		    // do some work here on intValue
			if(e.getSource() == button)
			{
				drawShape(button);
				togglePlayer();
			}
				
		}
	} // end method actionPerformed
	
	private void togglePlayer()
	{
		player ^= true; // toggle the player
		shape ^= true; // toggle the shape
	}
	
	private void drawShape(JButton button)
	{
		button.setText(Boolean.toString(player));
	}
}
