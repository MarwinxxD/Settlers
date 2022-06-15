package application;

public class Player {
	
	int wood = 0;
	int wool = 0;
	int ore = 0;
	int brick = 0;
	int straw = 0;
	
	
	/*public void Diceroll()
	{
		if(adjacentTile == NumberRolled)
		{
			getRessourceOfTile()++;
		}
	}*/
	
	public void Straﬂe(int Anzahl)
	{
		wood--;
		brick--;
	}
	
	public void Dorf(int Anzahl)
	{
		wood--;
		wool--;
		brick--;
		straw--;
	}
	
	public void Stadt(int Anzahl)
	{
		ore = ore -3;
		straw = straw -2;
	}
	
	public void DevCard(int Anzahl)
	{
		ore--;
		wool--;
		straw--;
	}
}
