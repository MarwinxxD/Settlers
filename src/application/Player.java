package application;

import java.util.*;

public class Player {
	
	ArrayList<String> Wood;
	ArrayList<String> Wool;
	ArrayList<String> Brick;
	ArrayList<String> Ore;
	ArrayList<String> Grain;
	String farbe;
	
	ArrayList<DevCard> cards = new ArrayList<DevCard>();
	DevCardList card = new DevCardList();
	
	int vp = 0;
	
	int freeroad;
	
	int robber;
	
	public Player(String _farbe)
	{
		farbe = _farbe;
		Wood = new ArrayList<String>();
		Wool = new ArrayList<String>();
		Brick = new ArrayList<String>();
		Ore = new ArrayList<String>();
		Grain = new ArrayList<String>();
	}
	
	public int getRoad()
	{
		return freeroad;
	}
	
	public void setRoad(int amount)
	{
		freeroad = freeroad + amount;
	}
	
	public int getRobber()
	{
		return robber;
	}
	
	public void setRobber(int amount)
	{
		robber = robber + amount;
	}
	
	public void takeRobber(int amount)
	{
		robber = robber - amount;
	}
	
	public int getVP()
	{
		return vp;
	}
	
	public void VPPlus()
	{
		vp++;
	}
	
	public int getWool()
	{
		return Wool.size();
	}
	
	public int getWood()
	{
		return Wood.size();
	}
	
	public int getOre()
	{
		return Ore.size();
	}
	
	public int getGrain()
	{
		return Grain.size();	}
	
	public int getBrick()
	{
		return Brick.size();
	}
	
	
	
	public void takeWood(int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			Wood.remove(Wood.size() - 1);
		}
	}
	
	public void takeWool(int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			Wool.remove(Wool.size() - 1);
		}
	}
	
	public void takeOre(int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			Ore.remove(Ore.size() - 1);
		}
	}
	
	public void takeGrain(int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			Grain.remove(Grain.size() - 1);
		}
	}
	
	public void takeBrick(int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			Brick.remove(Brick.size() - 1);
		}
	}
	
	
	
	public void addWood(int amount)
	{
		int i = 0;
		while(i < amount)
		{
			Wood.add("Wood");
			i++;
		}
	}
	
	public void addWool(int amount)
	{
		int i = 0;
		while(i < amount)
		{
			Wool.add("Wool");
			i++;
		}
	}
	
	public void addGrain(int amount)
	{
		int i = 0;
		while(i < amount)
		{
			Grain.add("Grain");
			i++;
		}
	}
	
	public void addOre(int amount)
	{
		int i = 0;
		while(i < amount)
		{
			Ore.add("Ore");
			i++;
		}
	}
	
	public void addBrick(int amount)
	{
		int i = 0;
		while(i < amount)
		{
			Brick.add("Brick");
			i++;
		}
	}
	
	
	
	public boolean Straße(int Anzahl)
	{
		if(getWood() >= 1 && getBrick() >= 1)
		{
			takeWood(1);
			takeBrick(1);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean Dorf(int Anzahl)
	{
		if(getWood() >= 1 && getBrick() >= 1 && getWool() >= 1 && getGrain() >= 1)
		{
			takeWood(1);
			takeBrick(1);
			takeWool(1);
			takeGrain(1);
			vp++;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean ControllDorf(int Anzahl)
	{
		if(getWood() >= 1 && getBrick() >= 1 && getWool() >= 1 && getGrain() >= 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean Stadt(int Anzahl)
	{
		if(getOre() >= 3 && getGrain() >= 2)
		{
			takeOre(3);
			takeGrain(2);
			vp++;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean ControllStadt(int Anzahl)
	{
		if(getOre() >= 3 && getGrain() >= 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	public boolean DevCard(int Anzahl)
    {
        if(card.gibListe().size() > 0 && getOre() >= 1 && getWool() >= 1 && getGrain() >= 1)
        {
        	takeOre(1);
            takeWool(1);
            takeGrain(1);
        	return true;
        }
        else
        {
        	return false;
        }
    }
	public boolean DevCardControll()
    {
        if(card.gibListe().size() > 0 && getOre() >= 1 && getWool() >= 1 && getGrain() >= 1)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
	
	public void addDevCard(DevCard cardee)
	{
		cards.add(cardee);
	}
	
	public ArrayList<DevCard> gibDevCards()
	{
		return cards;
	}
}