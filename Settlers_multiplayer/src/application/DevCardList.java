package application;

import java.util.ArrayList;
import java.util.Collections;

public class DevCardList {
	ArrayList<DevCard> devcards = new ArrayList<DevCard>();
	
	public DevCardList()
	{
		DevCard e0 = new DevCard("chapel");
        DevCard e1 = new DevCard("library");
        DevCard e2 = new DevCard("market");
        DevCard e3 = new DevCard("monopoly");
        DevCard e4 = new DevCard("palace");
        DevCard e5 = new DevCard("roadbuild");
        DevCard e6 = new DevCard("university");
        DevCard e7 = new DevCard("yop");
        
        devcards.add(e0);
        devcards.add(e1);
        devcards.add(e2);
        devcards.add(e3);
        devcards.add(e4);
        devcards.add(e5);
        devcards.add(e6);
        devcards.add(e7);
        
        Collections.shuffle(devcards);
	}
	
	
	public ArrayList<DevCard> gibListe()
	{
		return devcards;
	}
	
	public DevCard gibDevCard()
    {
        DevCard give = devcards.get(0);
        devcards.remove(0);
        return give;
    }
}