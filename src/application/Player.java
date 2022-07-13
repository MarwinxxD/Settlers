package application;

import java.util.*;
import application.RessourceCard;

public class Player {
	
	ArrayList<RessourceCard> ressourceList = new ArrayList<RessourceCard>();
	Controller control = new Controller();
	String Farbe;
	
	public Player(String _farbe)
	{
		Farbe = _farbe;
	}
	
	
	int vp = 0;
	//boolean longestRoad = false;
	
	
	public int getVP()
	{
		return vp;
	}
	
	public int getWool()
	{
		int amount = 0;
		for(int i = 0; i < ressourceList.size(); i++)
		{
			if(ressourceList.get(i).type.equalsIgnoreCase("wool"))
			{
				amount ++;
			}
		}
		
		return amount;
	}
	
	public int getWood()
	{
		int amount = 0;
		for(int i = 0; i < ressourceList.size(); i++)
		{
			if(ressourceList.get(i).type.equalsIgnoreCase("wood"))
			{
				amount ++;
			}
		}
		
		return amount;
	}
	
	public int getOre()
	{
		int amount = 0;
		for(int i = 0; i < ressourceList.size(); i++)
		{
			if(ressourceList.get(i).type.equalsIgnoreCase("ore"))
			{
				amount ++;
			}
		}
		
		return amount;
	}
	
	public int getGrain()
	{
		int amount = 0;
		for(int i = 0; i < ressourceList.size(); i++)
		{
			if(ressourceList.get(i).type.equalsIgnoreCase("grain"))
			{
				amount ++;
			}
		}
		
		return amount;
	}
	
	public int getBrick()
	{
		int amount = 0;
		for(int i = 0; i < ressourceList.size(); i++)
		{
			if(ressourceList.get(i).type.equalsIgnoreCase("brick"))
			{
				amount ++;
			}
		}
		
		return amount;
	}
	
	
	
	public void takeWood(Player p, int amount)
	{
		int removed= 0;
		
		for(int i = 0; i < p.ressourceList.size(); i++)
		{
			if(p.ressourceList.get(i).type.equalsIgnoreCase("wood"));
			{
				p.ressourceList.remove(i);
				removed++;
			}
			if(removed == amount)
			{
				break;
			}
		}
		control.ressourcenFelder(this);
	}
	
	public void takeWool(Player p, int amount)
	{
		int removed= 0;
		
		for(int i = 0; i < p.ressourceList.size(); i++)
		{
			if(p.ressourceList.get(i).type.equalsIgnoreCase("wool"));
			{
				p.ressourceList.remove(i);
				removed++;
			}
			if(removed == amount)
			{
				break;
			}
		}
		control.ressourcenFelder(this);
	}
	
	public void takeOre(Player p, int amount)
	{
		int removed= 0;
		
		for(int i = 0; i < p.ressourceList.size(); i++)
		{
			if(p.ressourceList.get(i).type.equalsIgnoreCase("ore"));
			{
				p.ressourceList.remove(i);
				removed++;
			}
			if(removed == amount)
			{
				break;
			}
		}
		control.ressourcenFelder(this);
	}
	
	public void takeGrain(Player p, int amount)
	{
		int removed= 0;
		
		for(int i = 0; i < p.ressourceList.size(); i++)
		{
			if(p.ressourceList.get(i).type.equalsIgnoreCase("grain"));
			{
				p.ressourceList.remove(i);
				removed++;
			}
			if(removed == amount)
			{
				break;
			}
		}
		control.ressourcenFelder(this);
	}
	
	public void takeBrick(Player p, int amount)
	{
		int removed= 0;
		
		for(int i = 0; i < p.ressourceList.size(); i++)
		{
			if(p.ressourceList.get(i).type.equalsIgnoreCase("brick"));
			{
				p.ressourceList.remove(i);
				removed++;
			}
			if(removed == amount)
			{
				break;
			}
		}
		control.ressourcenFelder(this);
	}
	
	
	
	public void addWood(Player p, int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			p.ressourceList.add(new RessourceCard("wood"));
		}
		control.ressourcenFelder(this);
	}
	
	public void addWool(Player p, int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			p.ressourceList.add(new RessourceCard("wool"));
		}
		control.ressourcenFelder(this);
	}
	
	public void addGrain(Player p, int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			p.ressourceList.add(new RessourceCard("grain"));
		}
		control.ressourcenFelder(this);
	}
	
	public void addOre(Player p, int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			p.ressourceList.add(new RessourceCard("ore"));
		}
		control.ressourcenFelder(this);
	}
	
	public void addBrick(Player p, int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			p.ressourceList.add(new RessourceCard("brick"));
		}
		control.ressourcenFelder(this);
	}
	
	
	
	public void Straße(int Anzahl)
	{
		int removed= 0;
		
		if(getWood() >= 1 && getBrick() >= 1)
		{
			takeWood(this, 1);
			takeBrick(this, 1);
		}
		else
		{
			System.out.println("not enough resources");
		}
	}
	
	public void Dorf(int Anzahl)
	{
		int removed = 0;
		
		if(getWood() >= 1 && getBrick() >= 1 && getWool() >= 1 && getGrain() >= 1)
		{
			takeWood(this, 1);
			takeBrick(this, 1);
			takeWool(this, 1);
			takeGrain(this, 1);
			vp++;
		}
		else
		{
			System.out.println("not enough resources");
		}
	}
	
	public void Stadt(int Anzahl)
	{
		int removed = 0;
		
		if(getOre() >= 3 && getGrain() >= 1)
		{
			takeOre(this, 3);
			takeGrain(this, 2);
			vp++;
		}
		else
		{
			System.out.println("not enough resources");
		}
	}
	
	public void DevCard(int Anzahl)
	{
		int max = 12;
		int min = 2;
		int random = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		if(getOre() >= 1 && getWool() >= 1 && getGrain() >= 1)
		{
			takeOre(this, 1);
			takeWool(this, 1);
			takeGrain(this, 1);
		}
		
		/*if(random == )
		{
			
		}*/
	}
}
