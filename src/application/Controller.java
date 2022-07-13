package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class Controller {
	@FXML
	private Label P1Brick;

	@FXML
	private Label P1Grain;

	@FXML
	private Label P1Ore;

	@FXML
	private Label P1Wood;

	@FXML
	private Label P1Wool;

	@FXML
	private Label P2Brick;

	@FXML
	private Label P2Grain;

	@FXML
	private Label P2Ore;

	@FXML
	private Label P2Wood;

	@FXML
	private Label P2Wool;
	 
	Image blueCity = new Image("blue_city.png");
	Image blueVillage = new Image("blue_settlement.png");
	Image blueStreet = new Image("blue_road.png");
	Image redCity = new Image("blue_city.png");
	Image redVillage = new Image("blue_settlement.png");
	Image redStreet = new Image("blue_road.png");
	
	public void ressourcenFelder(Player p)
	{
		P1Brick.setText(p.getBrick() + "");
		P1Wool.setText(p.getWool() + "");
		P1Wood.setText(p.getWood() + "");
		P1Grain.setText(p.getGrain() + "");
		P1Ore.setText(p.getOre() + "");
		
		P2Brick.setText(p.getBrick() + "");
		P2Wool.setText(p.getWool() + "");
		P2Wood.setText(p.getWood() + "");
		P2Grain.setText(p.getGrain() + "");
		P2Ore.setText(p.getOre() + "");
	}
	
	
}
