package day3;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class TortoiseColorChooser {
	public static void main(String[] args) {
		Robot c3po=new Robot();
		//3. ask the user what color they would like the tortoise to draw
	String input=	JOptionPane.showInputDialog("what coler would you like the robot");
		//4. use an if/else statement to set the pen color that the user requested
        if(input.equals("red"))
        {
         c3po.setPenColor(Color.RED);
        }
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
	c3po.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)

c3po.penDown();
c3po.move(100); 
c3po.turn(10);
c3po.move(100);

c3po.turn(150);
c3po.move(100);
c3po.move(100);
c3po.turn(100);
c3po.move(100);	}
}

