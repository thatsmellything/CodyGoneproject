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
		
		//This allows the array to get a seperate file (in this case a picture) and hold it in the array
		//for easy access
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
		//This is how to have a JOptionPane show off a picture, super super useful since I don't think you can actually display
		//a picture in command line. You can probably do it with regular lists as well
		JOptionPane.showMessageDialog(null, "When you initialize an array of objects all of the spots are filled with null", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[2]);
		JOptionPane.showMessageDialog(null, "If you try and use them the program will crash");
		JOptionPane.showMessageDialog(null, "but if you put something in them then everything turns happy");
		
		for (int index = 0; index < candyArray.length; index += 1)
		{
			//this initializes all of the array indexes and puts their values at null. so not
			//super great and if it gets asked for their values it will crash the program but it is still
			//nice becaause it allows it to be compiled and a placeholder
			candyArray[index] = new Candy();
		}
	}
}
