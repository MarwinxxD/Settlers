package application;

import java.util.*;

public class Tiles {
	Integer[] tileSpot = new Spots().generateTileNumbers();
	String resource;
	int tile;
	
	public Tiles(String _resource, int _tile)
	{
		resource = _resource;
		Collections.shuffle(Arrays.asList(tileSpot));
		tile = tileSpot[_tile];
	}
	
	public int getTile()
	{
		return tile;
	}
	
	public String getRessource()
	{
		return resource;
	}
}
