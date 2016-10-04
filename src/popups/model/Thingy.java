package popups.model;

public class Thingy
{
	private int numberThing;
	private double valueThing;
	private String words;
	private boolean isValidThing;
	
	//Declarations-------------------
//	
//	public Thingy()
//	{
//		this.numberThing = 6;
//		this.valueThing = 1234;
//		this.words = "BAD";
//	}
	
	//Getters-------------------------
	
	public int getNumberthing()
	{
		return numberThing;
	}
	
	public double getValuething()
	{
		return valueThing;
	}
	public String getWords()
	{
		return words;
	}
	public boolean getIsValidThing()
	{
		return isValidThing;
	}
	
	//Setters----------
	
	public void setNumberThing(int numberThing)
	{
		this.numberThing = numberThing;
	}
	public void setValueThing(Double valueThing)
	{
		this.valueThing = valueThing;
	}
	public void setWords(String wordThing)
	{
		this.words = wordThing;
	}
	public void setIsValueThing(boolean isValidThing)
	{
		this.isValidThing = isValidThing;
	}
}
