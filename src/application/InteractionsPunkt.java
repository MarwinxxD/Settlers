package application;

import javafx.scene.image.Image;

public class InteractionsPunkt {
	boolean straﬂe = false;
	boolean dorf = false;
	boolean stadt = false;
	Image dorf_b = new Image(getClass().getResourceAsStream("blue_settlement.png"));
	Image stadt_b = new Image(getClass().getResourceAsStream("blue_city.png"));
	Image straﬂe_b = new Image(getClass().getResourceAsStream("blue_road.png"));
	Image dorf_r = new Image(getClass().getResourceAsStream("blue_settlement.png"));
	Image stadt_r = new Image(getClass().getResourceAsStream("blue_city.png"));
	Image straﬂe_r = new Image(getClass().getResourceAsStream("blue_road.png"));
	
	
	public void Village()
	{
		if(dorf) {straﬂe = true;}
		dorf = true;
		System.out.println("Dorf");
	}
	
	public void Straﬂe()
	{
		straﬂe = true;
		System.out.println("Straﬂe");
	}
}
