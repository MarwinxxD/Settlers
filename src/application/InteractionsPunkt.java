package application;

import javafx.scene.image.Image;

public class InteractionsPunkt {
	boolean stra�e = false;
	boolean dorf = false;
	boolean stadt = false;
	Image dorf_b = new Image(getClass().getResourceAsStream("blue_settlement.png"));
	Image stadt_b = new Image(getClass().getResourceAsStream("blue_city.png"));
	Image stra�e_b = new Image(getClass().getResourceAsStream("blue_road.png"));
	Image dorf_r = new Image(getClass().getResourceAsStream("blue_settlement.png"));
	Image stadt_r = new Image(getClass().getResourceAsStream("blue_city.png"));
	Image stra�e_r = new Image(getClass().getResourceAsStream("blue_road.png"));
	
	
	public void Village()
	{
		if(dorf) {stra�e = true;}
		dorf = true;
		System.out.println("Dorf");
	}
	
	public void Stra�e()
	{
		stra�e = true;
		System.out.println("Stra�e");
	}
}
