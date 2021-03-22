import java.util.*; import javax.swing.*;
public class do_whilePassword {
	public static void main ( String [] args ) {
		String choice = "" ; do {
/*		System.out.println( "Enter today's number from the menu:" ); choice =
		JOptionPane.showInputDialog("Please enter in a password");*/
		} while (choice != "John" ); } }

/*Comments on code submission
 * 1. The JOptionPane.showInputDialog is working fine, it does assign
 *    the input value to the string, "choice". Using "==" or "!=" does not work for
 *    for strings in conditional statements in Java. Please look at the link below in order
 *    to get an idea of how to solve this:
 *    https://www.w3schools.com/java/ref_string_equals.asp
 * 2. According to the assignment, the user has three tries to input the password, which is
 *    initialized to "John". After the third try, the user has to enter a new password. This means
 *    that you have to account for the fact that the password will not always be "John", meaning
 *    that the while condition in your code will not apply for a new password. I suggest creating
 *    a variable to store the current password, initialize it to "John" and use that variable name in the
 *    while condition. This will make the code more adaptable, as the variable value can be updated to
 *    the new password and the while condition will still apply.
 * 3. Building on the point above, you have to include a counter to keep track of the number
 *    of times that the user has tried to enter the password. When that counter reaches 3,
 *    request the user to enter a new password and reset the counter back to zero.
 * 4. Include a method to check if the new password satisfies all the conditions in the assignment.
 * 5. Make your code more readable by placing each action on a separate line.
 * 6. Add comments in your code, to make it easier to understand.
 * 7. Remove code that is not required or is not part of the assignment - the output statement in
 *    your code.
 *
 *    Great effort!*/
