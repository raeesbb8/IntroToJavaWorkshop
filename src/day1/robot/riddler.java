package day1.robot;

import javax.swing.JOptionPane;

public class riddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
        int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
     String riddles =   JOptionPane.showInputDialog("Tear one off and scratch my head what was red is black instead.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
        if(riddles.equals("matchstick")) {
		JOptionPane.showMessageDialog(null, "correct");	
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

