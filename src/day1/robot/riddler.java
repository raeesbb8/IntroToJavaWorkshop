package day1.robot;

import javax.swing.JOptionPane;

public class riddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String[] riddles = new String[1];
		String[] answers = new String[1];
		riddles[0] = "Tear one off and scratch my head what was red is black instead.";
		answers[0] = "matchstick";
		String answer = JOptionPane.showInputDialog(riddles[0]);
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.equals(answers[0])) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
		} else {
			// 5. Otherwise, say "wrong" and tell them the answer
			JOptionPane.showMessageDialog(null, "wrong " + answers[0]);
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "you score is " + score);
	}
}
