package application;


import java.util.*;

public class Tiles {
	ArrayList<Integer> tileSpot = new ArrayList<Integer>();
	
	public Tiles()
	{
		int n = 2;
		for(int i = 0; i < 18; i++)
		{
			if(n == 7){n++;}
			
			if(n == 2 || n == 12){tileSpot.add(n);}
			
			if(n != 2 && n != 7 && n != 12){tileSpot.add(n); tileSpot.add(n); i++;}
			
			n++;
		}
		Collections.shuffle(tileSpot);
	}
	
	public ArrayList<Integer> getList()
	{
		return tileSpot;
	}
}