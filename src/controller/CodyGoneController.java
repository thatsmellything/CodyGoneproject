package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Candy;

public class CodyGoneController
{

	private Candy[] candyArray;
	private ImageIcon [] icons;
	
	public CodyGoneController()
	{
		candyArray = new Candy[3];
		icons = new ImageIcon[4];
		
		
		icons[0] = new ImageIcon(getClass().getResource("/codyGoneProject/view/images/dwight.jpg"));
		icons[1] = new ImageIcon(getClass().getResource("/codyGoneProject/view/images/dwight2.jpg"));
		icons[2] = new ImageIcon(getClass().getResource("/codyGoneProject/view/images/dwight3.jpg"));
		icons[3] = new ImageIcon(getClass().getResource("/codyGoneProject/view/images/dwight4.jpg"));
	}
	
	
	public void Start()
	{
		arrayInitialization();
	}
	
	private void arrayInitialization()
	{
		JOptionPane.showMessageDialog(null, "When you initialize an array of objects all of the spots are filled with null", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[2]);
		JOptionPane.showMessageDialog(null, "If you try and use them the program will crash");
		JOptionPane.showMessageDialog(null, "but if you put something in them then everything turns happy");
		
		for (int index = 0; index < candyArray.length; index += 1)
		{
			candyArray[index] = new Candy();
		}
	}
}
