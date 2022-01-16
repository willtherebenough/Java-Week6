/*
Creating an Application that Can Catch Exceptions
You have created a Menu class that simply holds a list of food items, displays itself, and
allows the user to make a selection. You also created a PickMenu class with fields that
hold a user’s specific selection from a given menu and methods to get and set values
for those fields. The PickMenu class might throw exceptions, but it contains no
methods that catch those exceptions. Next, you write an application that uses the
PickMenu class. This application can catch exceptions that PickMenu throws.

*/

import javax.swing.*;
public class PlanVegetarianMenu
{
	public static void main(String[] args)
	{
		VegetarianMenu briefMenu = new VegetarianMenu();
		PickMenu entree = null;
		String guestChoice = new String();

	try
	{
		PickMenu selection = new PickMenu(briefMenu);
		entree = selection;
		guestChoice = entree.getGuestChoice();
	}

	catch(Exception error)
	{
		guestChoice = "an invalid vegetarian selection";
	}

	JOptionPane.showMessgeDialog(null, "You chose " + guestChoice);
	}
}