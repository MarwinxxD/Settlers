package application;

import java.util.*;

public class Player {
	
	int Wood;
	int Wool;
	int Brick;
	int Ore;
	int Grain;
	String farbe;
	
	ArrayList<DevCard> cards = new ArrayList<DevCard>();
	DevCardList card = new DevCardList();
	
	int vp = 0;
	
	int freeroad;
	
	int robber;
	
	public Player(String _farbe)
	{
		farbe = _farbe;
	}
	
	public String getFarbe()
	{
		return farbe;
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
		return Wool;
	}
	
	public int getWood()
	{
		return Wood;
	}
	
	public int getOre()
	{
		return Ore;
	}
	
	public int getGrain()
	{
		return Grain;	}
	
	public int getBrick()
	{
		return Brick;
	}
	
	
	
	public void takeWood(int amount)
	{
		Wood = Wood - amount;
	}
	
	public void takeWool(int amount)
	{
		Wool = Wool - amount;
	}
	
	public void takeOre(int amount)
	{
		Ore = Ore - amount;
	}
	
	public void takeGrain(int amount)
	{
		Grain = Grain - amount;
	}
	
	public void takeBrick(int amount)
	{
		Brick = Brick - amount;
	}
	
	
	
	public void addWood(int amount)
	{
		Wood = Wood + amount;
	}
	
	public void addWool(int amount)
	{
		Wool = Wool + amount;
	}
	
	public void addGrain(int amount)
	{
		Grain = Grain + amount;
	}
	
	public void addOre(int amount)
	{
		Ore = Ore + amount;
	}
	
	public void addBrick(int amount)
	{
		Brick = Brick + amount;
	}
	
	
	
	public boolean Straße(int Anzahl)
	{
		if(Wood >= 1 && Brick >= 1)
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
	public boolean ControllStraße(int Anzahl)
	{
		if(Wood >= 1 && Brick >= 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean Dorf(int Anzahl)
	{
		if(Wood >= 1 && Brick >= 1 && Wool >= 1 && Grain >= 1)
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
		if(Wood >= 1 && Brick >= 1 && Wool >= 1 && Grain >= 1)
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
		if(Ore >= 3 && Grain >= 2)
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
		if(Ore >= 3 && Grain >= 2)
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