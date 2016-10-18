package TicTacToe;

import javax.swing.JFrame;

public class TicTacToe {
	 public static void main(String[] args)
	   {
	      DrawFrame application = new DrawFrame();
	      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      application.setSize(500, 500);
	      application.setVisible(true);
	      application.pack();
	   } // end main
}
