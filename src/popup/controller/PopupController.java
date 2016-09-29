package popup.controller;

import popups.view.PopupViewer;

public class PopupController
{
	private PopupViewer display;
	
	public PopupController()
	{
		
	}
	
	public void start()
	{
		
	}
	/**
	 * Checks a supplied string value to see if it can be converted to a double.
	 * @param potentialValue The supplied String
	 * @return Whether the conversion to a double is possible as a boolean value.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;
		
		try
		{
			double testValue = Double.parseDouble(potentialValue);
			validDouble = true;
		}
		catch(NumberFormatException notDoubleError)
		{
			display.displayMessage("That was not a double");
		}
		
		
		return validDouble;
	}
	
	
	
	
	
}
