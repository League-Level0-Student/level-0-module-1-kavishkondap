package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog(null,"What is your birthday? (mm/dd)");
if (birthday.contentEquals("06/29")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday!!");
}else {
	JOptionPane.showMessageDialog(null, "Merry UnBirthday!!!");
}
}
}
