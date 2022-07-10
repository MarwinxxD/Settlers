package application;


	public class Dice
	{
		private int max = 12;
		private int min = 2;
    
	public Dice()
    {
        
    }
    
    public int DiceRoll()
    {
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random;
    }
}
