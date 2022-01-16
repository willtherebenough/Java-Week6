/*

Creating an Exception Class
Besides using the built-in classes that derive from Exception such as
NumberFormatException and IndexOutOfBoundsException, you can create your
own Exception classes. For example, suppose that although you have asked a
user to type a number representing a menu selection, you realize that some users
might mistakenly type the initial letter of an option, such as R for Rosemary Chicken.
Although the user has made an error, you want to treat this type of error
more leniently than other errors, such as typing a letter that has no discernable
connection to the presented menu. In the next section, you create a MenuException
class that you can use with the Menu class to represent a specific type of error

*/

public class MenuException extends Exception

{
	public MenuException(String choice)
	{
		super(choice)
	}
}