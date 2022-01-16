/*
Creating a Class that Automatically Throws Exceptions
Next, you create a class that contains two methods that throw exceptions but don’t
catch them. The PickMenu class allows restaurant customers to choose from a
dinner menu. Before you create PickMenu, you will create the Menu class, which lists
dinner choices and allows a user to make a selection
*/

import javax.swing.*;
public class Menu2
{

protected String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};
private String menu = "";
private int choice;
protected char initial[] = new char[entreeChoice.length];

/*
Add the displayMenu() method, which lists each entrée option with a
corresponding number the customer can type to make a selection. Even
though the allowable entreeChoice array subscripts are 0, 1, and 2, most
users would expect to type 1, 2, or 3. So, you code x + 1 rather than x as the
number in the prompt. After the user enters a selection, convert it to an integer.
Return the String that corresponds to the user’s menu selection—the one with
the subscript that is 1 less than the entered value. After the closing curly brace
for the displayMenu() method, add the closing curly brace for the class.
*/

public String displayMenu() throws MenuException
{
	for(int x = 0; x < entreeChoice.length; ++x)
	{
		menu = menu + "\n" + (x+1) + " for " +
		entreeChoice[x];
		initial[x] = entreeChoice[x].charAt(0);
	}
	String input = JOption.showInputDialog(null,
	"Type your selection, then press Enter." + menu);
	for(int y = 0; y < entreeChoice.length; ++y)
		if(input.charAt(0) == initial[y])
			throw (new MenuException(entreeChoice[y]));
	choice = Integer.parseInt(input);
	return(entreeChoice[choice - 1]);
	
	}
}