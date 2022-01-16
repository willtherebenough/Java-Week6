/*
Creating a Class that Passes on an Exception Object
Next, you create the PickMenu class, which lets a customer choose from the
available dinner entrée options. The PickMenu class declares a Menu and a String
named guestChoice that holds the name of the entrée the customer selects.
To enable the PickMenu class to operate with different kinds of Menus in the future,
you will pass a Menu to PickMenu’s constructor. This technique provides two advantages: 
First, when the menu options change, you can alter the contents of the
Menu.java file without changing any of the code in programs that use Menu. Second,
you can extend Menu, perhaps to VegetarianMenu, LowSaltMenu, or KosherMenu,
and still use the existing PickMenu class. When you pass any Menu or Menu subclass
into the PickMenu constructor, the correct customer options appear.
The PickMenu class is unlikely to directly generate any exceptions because it does
not request user input. (Keep in mind that any class might generate an exception for
such uncontrollable events as the system not having enough memory available.)
However, PickMenu declares a Menu object; the Menu class, because it relies on user
input, is likely to generate an exception.
*/


import javax.swing.*;
public class PickMenu
{

	private Menu briefMenu;
	private String guestChoice = new String();


public PickMenu(Menu theMenu)
{
	briefMenu = theMenu;
	setGuestChoice();
}

public void setGuestChoice()
{
	JOptionPane.showMessageDialog(null,
	"Choose from the following menu:");
	guestChoice = briefMenu.displayMenu();
}

// Add the following getGuestChoice() method that returns a guest’s String
// selection from the PickMenu class.

public String getGuestChoice()

	{
	return(guestChoice);
	}
}