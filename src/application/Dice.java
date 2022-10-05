package application;


public class Dice
{
	private int max = 6;
	private int min = 1;
    
	public Dice()
    {
        
    }
    
    public int DiceRoll()
    {
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random;
    }
}