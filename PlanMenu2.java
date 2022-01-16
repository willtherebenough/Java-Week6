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
public class PlanMenu2
{
	public static void main(String[] args)
	{
		Menu2 briefMenu = new Menu2();
		PickMenu2 entree = null;
		String guestChoice = new String();

	try
	{
		PickMenu2 selection = new PickMenu2(briefMenu);
		entree = selection;
		guestChoice = entree.getGuestChoice();
	}
	catch (MenuException error)
	{
		guestChoice = error.getMessage();
	}

	catch(Exception error)
	{
		guestChoice = "an invalid selection";
	}

	JOptionPane.showMessgeDialog(null, "You chose " + guestChoice);
	}
}