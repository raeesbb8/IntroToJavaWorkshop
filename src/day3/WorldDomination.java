package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
   String rule = JOptionPane.showInputDialog("do you know how to write a code");
   if (rule.equals("yes")) {	// 2. If they say "yes", tell them they will rule the world.
        JOptionPane.showMessageDialog(null, "you will rule the world");
        }
		// 3. Otherwise, wish them good luck washing dishes.
  if (rule.equals("no")){ 
	  JOptionPane.showMessageDialog(null, "good luck washing dishes");
  }
  }
	}

