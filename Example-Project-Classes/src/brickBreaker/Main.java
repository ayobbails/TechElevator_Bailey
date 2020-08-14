/**
 * 
 */
package brickBreaker;

import javax.swing.JFrame;

/**
 * @author student
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
	}

}
