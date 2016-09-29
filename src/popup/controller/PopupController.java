package popup.controller;

import popups.view.PopupViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;



public class PopupController
{
	private PopupViewer display;
	private List<Thingy> thingyList;
	
	
	public PopupController()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<Thingy>();
		
	}
	
	public void start()
	{
		learnLists();
		
	}
	
	private void askQuestionsLoop()
	{
		String answer = "Sample";
		
		while(answer != null && !isDouble(answer))
		{
			
			answer = display.collectResponse("You need to type a double");
		}
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
	
	/**
	 * Checks the supplied String vale  to see if it can be converted to an integer.
	 * If it cannot a popup message is displayed.
	 * @param potentialValue The supplied String.	 
	 * @return Whether a conversion to an integer is possible.
	 */
	
	private boolean isInteger(String potentialValue)
	{
		boolean validInteger = false;
		
		try
		{
			int testValue = Integer.parseInt(potentialValue);
			validInteger = true;
		}
		catch(NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("You need to type in an int");
		}
		
		return validInteger;
	}
	
	private void learnLists()
	{
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy firstThingy = new Thingy();
		thingyList.add(firstThingy);
		display.displayMessage("this is the size of the list: " + thingyList.size());
		thingyList.add(firstThingy);
		display.displayMessage("this is the size of the list: " + thingyList.size());
		
	}
	
	
	
	
}
