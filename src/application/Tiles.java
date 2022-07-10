package application;


import java.util.*;

public class Tiles {
	ArrayList<Integer> tileSpot = new Spots().generateTileNumbers();
	RessourceCard resource;
	int tile;
	
	public Tiles(String _resource, int _tile)
	{
		resource = new RessourceCard(_resource);
		tile = tileSpot.get(_tile);
	}
	
	public int getTile()
	{
		return tile;
	}
	
	/*public String getRessource()
	{
		return resource;
	}*/
}
