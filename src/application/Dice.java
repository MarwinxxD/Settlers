package application;

import java.util.*;

public class Dice {
	/*roll
	
	public Dice()
	{
		
	}*/
	
	public int roll()
	{
		int random = (int) (Math.random()*5 + 1);
		return random;
	}
}
