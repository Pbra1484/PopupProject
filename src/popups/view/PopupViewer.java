package popups.view;

import javax.swing.JOptionPane;

/**
 * Popup display class with three methods for GUI.
 * @author pbra1484
 * @version September 29
 */
public class PopupViewer
{

	/**
	 * Creates a popip to show the user a String.
	 * @param message The String show the user.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null,  message);
		
	}
	
	/**
	 * Creates a popup to ask a question to the user. Sore the response as a String
	 * @param question The question supplied to the user.
	 * @return The user response as String.
	 */
	
	public String collectResponse(String question)
	{
		String response = " ";
		response = JOptionPane.showInputDialog(null, question);
		return response;
	}
	
	public int collectOption(String question)
	{
		int optionNumber = 0;
		optionNumber = JOptionPane.showConfirmDialog(null, question);
		return optionNumber;
	}
}
