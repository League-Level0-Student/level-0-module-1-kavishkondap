package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
 String answer1 = JOptionPane.showInputDialog(null,"What is greater than God,\r\n" + 
		"more evil than the devil,\r\n" + 
		"the poor have it,\r\n" + 
		"the rich need it,\r\n" + 
		"and if you eat it, you'll die? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equals("nothing")) {
	JOptionPane.showMessageDialog(null, "Correct!!");
	score = score + 1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer was nothing!!");
}
JOptionPane.showMessageDialog(null, "Score = " + score);

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog(null,"What can travel around the world while staying in a corner? ");
if(answer2.equals("stamp")) {
	JOptionPane.showMessageDialog(null, "Correct!!");
	score = score + 1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer was a stamp!!");
}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score = " + score);
	}
}

