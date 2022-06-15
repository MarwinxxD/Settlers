package application;

import java.util.*;


public class Spots {
	Integer[] tileSpot = new Integer[19];
	
	/* Erstellt einen Array, sodas es die die richtige Afteilung von Nummer gibt, die später gewürfelt werden müssen:
	1 x Nummer 2
	2 x Nummer 3
	2 x Nummer 4
	2 x Nummer 5
	2 x Nummer 6
	1 x Nummer 7
	2 x Nummer 8
	2 x Nummer 9
	2 x Nummer 10
	2 x Nummer 11
	1 x Nummer 12*/
	public Spots()
	{
		int n = 2;
		for(int i = 0; i < 19; i++)
		{
			if(n == 2 || n == 7 || n == 12){tileSpot[i] = n;}
			
			if(n != 2 && n != 7 && n != 12){tileSpot[i] = n; tileSpot[i + 1] = n; i++;}
			n++;
		}
	}
	
	// der Array wird randomised, sodass man keine lineare Aufteilung der zu würfelnden Zahlen hat 
	public Integer[] generateTileNumbers()
	{		
		return tileSpot;
	}
}
