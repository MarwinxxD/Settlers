package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.util.ArrayList;
import javafx.scene.control.TextField;

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
	@FXML
	private Label P3Brick;
	@FXML
	private Label P3Grain;
	@FXML
	private Label P3Ore;
	@FXML
	private Label P3Wood;
	@FXML
	private Label P3Wool;
	@FXML
	private Label P4Brick;
	@FXML
	private Label P4Grain;
	@FXML
	private Label P4Ore;
	@FXML
	private Label P4Wood;
	@FXML
	private Label P4Wool;
	
	@FXML
	private ImageView ImageB1;
	@FXML
	private ImageView ImageB2;
	@FXML
	private ImageView ImageB3;
	@FXML
	private ImageView ImageB4;
	@FXML
	private ImageView ImageB5;
	@FXML
	private ImageView ImageB6;
	@FXML
	private ImageView ImageB7;
	@FXML
	private ImageView ImageB8;
	@FXML
	private ImageView ImageB9;
	@FXML
	private ImageView ImageB10;
	@FXML
	private ImageView ImageB11;
	@FXML
	private ImageView ImageB12;
	@FXML
	private ImageView ImageB13;
	@FXML
	private ImageView ImageB14;
	@FXML
	private ImageView ImageB15;
	@FXML
	private ImageView ImageB16;
	@FXML
	private ImageView ImageB17;
	@FXML
	private ImageView ImageB18;
	@FXML
	private ImageView ImageB19;
	@FXML
	private ImageView ImageB20;
	@FXML
	private ImageView ImageB21;
	@FXML
	private ImageView ImageB22;
	@FXML
	private ImageView ImageB23;
	@FXML
	private ImageView ImageB24;
	@FXML
	private ImageView ImageB25;
	@FXML
	private ImageView ImageB26;
	@FXML
	private ImageView ImageB27;
	@FXML
	private ImageView ImageB28;
	@FXML
	private ImageView ImageB29;
	@FXML
	private ImageView ImageB30;
	@FXML
	private ImageView ImageB31;
	@FXML
	private ImageView ImageB32;
	@FXML
	private ImageView ImageB33;
	@FXML
	private ImageView ImageB34;
	@FXML
	private ImageView ImageB35;
	@FXML
	private ImageView ImageB36;
	@FXML
	private ImageView ImageB37;
	@FXML
	private ImageView ImageB38;
	@FXML
	private ImageView ImageB39;
	@FXML
	private ImageView ImageB40;
	@FXML
	private ImageView ImageB41;
	@FXML
	private ImageView ImageB42;
	@FXML
	private ImageView ImageB43;
	@FXML
	private ImageView ImageB44;
	@FXML
	private ImageView ImageB45;
	@FXML
	private ImageView ImageB46;
	@FXML
	private ImageView ImageB47;
	@FXML
	private ImageView ImageB48;
	@FXML
	private ImageView ImageB49;
	@FXML
	private ImageView ImageB50;
	@FXML
	private ImageView ImageB51;
	@FXML
	private ImageView ImageB52;
	@FXML
	private ImageView ImageB53;
	@FXML
	private ImageView ImageB54;
	
	@FXML
	private ImageView S1;
	@FXML
	private ImageView S2;
	@FXML
	private ImageView S3;
	@FXML
	private ImageView S4;
	@FXML
	private ImageView S5;
	@FXML
	private ImageView S6;
	@FXML
	private ImageView S7;
	@FXML
	private ImageView S8;
	@FXML
	private ImageView S9;
	@FXML
	private ImageView S10;
	@FXML
	private ImageView S11;
	@FXML
	private ImageView S12;
	@FXML
	private ImageView S13;
	@FXML
	private ImageView S14;
	@FXML
	private ImageView S15;
	@FXML
	private ImageView S16;
	@FXML
	private ImageView S17;
	@FXML
	private ImageView S18;
	@FXML
	private ImageView S19;
	@FXML
	private ImageView S20;
	@FXML
	private ImageView S21;
	@FXML
	private ImageView S22;
	@FXML
	private ImageView S23;
	@FXML
	private ImageView S24;
	@FXML
	private ImageView S25;
	@FXML
	private ImageView S26;
	@FXML
	private ImageView S27;
	@FXML
	private ImageView S28;
	@FXML
	private ImageView S29;
	@FXML
	private ImageView S30;
	@FXML
	private ImageView S31;
	@FXML
	private ImageView S32;
	@FXML
	private ImageView S33;
	@FXML
	private ImageView S34;
	@FXML
	private ImageView S35;
	@FXML
	private ImageView S36;
	@FXML
	private ImageView S37;
	@FXML
	private ImageView S38;
	@FXML
	private ImageView S39;
	@FXML
	private ImageView S40;
	@FXML
	private ImageView S41;
	@FXML
	private ImageView S42;
	@FXML
	private ImageView S43;
	@FXML
	private ImageView S44;
	@FXML
	private ImageView S45;
	@FXML
	private ImageView S46;
	@FXML
	private ImageView S47;
	@FXML
	private ImageView S48;
	@FXML
	private ImageView S49;
	@FXML
	private ImageView S50;
	@FXML
	private ImageView S51;
	@FXML
	private ImageView S52;
	@FXML
	private ImageView S53;
	@FXML
	private ImageView S54;
	@FXML
	private ImageView S55;
	@FXML
	private ImageView S56;
	@FXML
	private ImageView S57;
	@FXML
	private ImageView S58;
	@FXML
	private ImageView S59;
	@FXML
	private ImageView S60;
	@FXML
	private ImageView S61;
	@FXML
	private ImageView S62;
	@FXML
	private ImageView S63;
	@FXML
	private ImageView S64;
	@FXML
	private ImageView S65;
	@FXML
	private ImageView S66;
	@FXML
	private ImageView S67;
	@FXML
	private ImageView S68;
	@FXML
	private ImageView S69;
	@FXML
	private ImageView S70;
	@FXML
	private ImageView S71;
	@FXML
	private ImageView S72;

	
	@FXML
	private Label NumF1;
	@FXML
	private Label NumF2;
	@FXML
	private Label NumF3;
	@FXML
	private Label NumF4;
	@FXML
	private Label NumF5;
	@FXML
	private Label NumF6;
	@FXML
	private Label NumF7;
	@FXML
	private Label NumF8;
	@FXML
	private Label NumF9;
	@FXML
	private Label NumF10;
	@FXML
	private Label NumF11;
	@FXML
	private Label NumF12;
	@FXML
	private Label NumF13;
	@FXML
	private Label NumF14;
	@FXML
	private Label NumF15;
	@FXML
	private Label NumF16;
	@FXML
	private Label NumF17;
	@FXML
	private Label NumF18;
	@FXML
	private Label NumF19;
	
	@FXML
	private Label NF1;
	@FXML
	private Label NF2;
	@FXML
	private Label NF3;
	@FXML
	private Label NF4;
	@FXML
	private Label NF5;
	@FXML
	private Label NF6;
	@FXML
	private Label NF7;
	@FXML
	private Label NF8;
	@FXML
	private Label NF9;
	@FXML
	private Label NF10;
	@FXML
	private Label NF11;
	@FXML
	private Label NF12;
	@FXML
	private Label NF13;
	@FXML
	private Label NF14;
	@FXML
	private Label NF15;
	@FXML
	private Label NF16;
	@FXML
	private Label NF17;
	@FXML
	private Label NF18;
	@FXML
	private Label NF19;
	
	@FXML
	private Label playerField;
	
	@FXML
	private ImageView chapel;
	@FXML
	private ImageView library;
	@FXML
	private ImageView market;
	@FXML
	private ImageView monopoly;
	@FXML
	private ImageView palace;
	@FXML
	private ImageView roadbuild;
	@FXML
	private ImageView university;
	@FXML
	private ImageView yop;
	
	@FXML
	private Label P1VP;
	@FXML
	private Label P2VP;
	@FXML
	private Label P3VP;
	@FXML
	private Label P4VP;
	
	@FXML
	private ImageView R1;
	@FXML
	private ImageView R2;
	@FXML
	private ImageView R3;
	@FXML
	private ImageView R4;
	@FXML
	private ImageView R5;
	@FXML
	private ImageView R6;
	@FXML
	private ImageView R7;
	@FXML
	private ImageView R8;
	@FXML
	private ImageView R9;
	@FXML
	private ImageView R10;
	@FXML
	private ImageView R11;
	@FXML
	private ImageView R12;
	@FXML
	private ImageView R13;
	@FXML
	private ImageView R14;
	@FXML
	private ImageView R15;
	@FXML
	private ImageView R16;
	@FXML
	private ImageView R17;
	@FXML
	private ImageView R18;
	@FXML
	private ImageView R19;
	
	@FXML
	private ImageView Dice1;
	@FXML
	private ImageView Dice2;
	
	@FXML
	private Button P1AddWd;
	@FXML
	private Button P1AddWl;
	@FXML
	private Button P1AddB;
	@FXML
	private Button P1AddO;
	@FXML
	private Button P1AddG;
	@FXML
	private Button P2AddWd;
	@FXML
	private Button P2AddWl;
	@FXML
	private Button P2AddB;
	@FXML
	private Button P2AddO;
	@FXML
	private Button P2AddG;
	@FXML
	private Button P3AddWd;
	@FXML
	private Button P3AddWl;
	@FXML
	private Button P3AddB;
	@FXML
	private Button P3AddO;
	@FXML
	private Button P3AddG;
	@FXML
	private Button P4AddWd;
	@FXML
	private Button P4AddWl;
	@FXML
	private Button P4AddB;
	@FXML
	private Button P4AddO;
	@FXML
	private Button P4AddG;
	
	
	@FXML
	private Button yopWd;
	@FXML
	private Button yopWl;
	@FXML
	private Button yopBr;
	@FXML
	private Button yopO;
	@FXML
	private Button yopG;
	@FXML
	private Label yopText;
	
	@FXML
	private TextField playercount;
	@FXML
	private TextField playernumber;
	
	@FXML
	private Label P3;
	@FXML
	private Label P4;
	
	
	Image blueCity = new Image("blue_city.png");
	Image blueVillage = new Image("blue_settlement.png");
	Image blueStreet = new Image("blue_road.png");
	Image redCity = new Image("red_city.png");
	Image redVillage = new Image("red_settlement.png");
	Image redStreet = new Image("red_road.png");
	Image whiteCity = new Image("white_city.png");
	Image whiteVillage = new Image("white_settlement.png");
	Image whiteStreet = new Image("white_road.png");
	Image orangeCity = new Image("orange_city.png");
	Image orangeVillage = new Image("orange_settlement.png");
	Image orangeStreet = new Image("orange_road.png");
	Image chapelI = new Image("chapel.png");
	Image libraryI = new Image("library.png");
	Image marketI = new Image("market.png");
	Image monopolyI = new Image("monopoly.png");
	Image palaceI = new Image("palace.png");
	Image roadbuildI = new Image("roadbuild.png");
	Image universityI = new Image("university.png");
	Image yopI = new Image("yop.png");
	
	Image chapelB = new Image("chapelblack.png");
	Image libraryB = new Image("libraryblack.png");
	Image marketB = new Image("marketblack.png");
	Image monopolyB = new Image("monopolyblack.png");
	Image palaceB = new Image("palaceblack.png");
	Image roadbuildB = new Image("roadbuildblack.png");
	Image universityB = new Image("uniblack.png");
	Image yopB = new Image("yopblack.png");
	
	Image black = new Image("black.png");
	Image robber = new Image("robber.png");
	Image leer = new Image("leeres Feld.PNG");
	Image one = new Image("one.png");
	Image two = new Image("two.png");
	Image three = new Image("three.png");
	Image four = new Image("four.png");
	Image five = new Image("five.png");
	Image six = new Image("six.png");
	
	
	ArrayList<ImageView> villagep = new ArrayList<ImageView>();
	
	ArrayList<ImageView> streetp = new ArrayList<ImageView>();
	
	ArrayList<ImageView> rob = new ArrayList<ImageView>();
	
	ArrayList<InteractionsPunkt> punkte = fillI();
	
	DevCardList DevCards = new DevCardList();
	
	ArrayList<Label> go = new ArrayList<Label>();
	
	boolean start = false;
	
	int yopNum = 0;
	
	int zustand = 0;
	
	ArrayList <Integer> zustandList = new ArrayList<Integer>();
	
	ArrayList <Player> playerList = new ArrayList<Player>();
	
	public void Createplayers()
	{
		if(Integer.parseInt(playercount.getText()) < 2)
		{
			System.out.println("es müssen mindestens zwei Spieler sein!");
		}
		
		if(Integer.parseInt(playercount.getText()) == 2)
		{
			Player P1 = new Player("red");
			Player P2 = new Player("blue");
			zustandList.add(0);
			zustandList.add(1);
			
			playerList.add(P1);
			playerList.add(P2);
		}
		else if(Integer.parseInt(playercount.getText()) == 3)
		{
			Player P1 = new Player("red");
			Player P2 = new Player("blue");
			Player P3 = new Player("white");
			zustandList.add(0);
			zustandList.add(1);
			zustandList.add(2);
			
			playerList.add(P1);
			playerList.add(P2);
			playerList.add(P3);
		}
		else if(Integer.parseInt(playercount.getText()) == 4)
		{
			Player P1 = new Player("red");
			Player P2 = new Player("blue");
			Player P3 = new Player("white");
			Player P4 = new Player("orange");
			zustandList.add(0);
			zustandList.add(1);
			zustandList.add(2);
			zustandList.add(3);
			
			playerList.add(P1);
			playerList.add(P2);
			playerList.add(P3);
			playerList.add(P4);
		}
	}
	
	public ArrayList<InteractionsPunkt> fillI()
	{
		ArrayList<InteractionsPunkt> hihi = new ArrayList<InteractionsPunkt>();
		for(int i = 0; i < 54; i++)
		{
			hihi.add(new InteractionsPunkt());
		}
		return hihi;
	}
	
	public void setStart(ActionEvent e)
	{
		start = true;
		Createplayers();
		
		if(playerList.size() < 3)
		{
			P3VP.setVisible(false);
			P4VP.setVisible(false);
			P3.setVisible(false);
			P4.setVisible(false);
		}
		if(playerList.size() < 4)
		{
			P4VP.setVisible(false);
			P4.setVisible(false);
		}
		
		yopWd.setVisible(false);
		yopWl.setVisible(false);
		yopBr.setVisible(false);
		yopO.setVisible(false);
		yopG.setVisible(false);
		yopText.setVisible(false);
		
		go.add(NumF1);
		go.add(NumF2);
		go.add(NumF3);
		go.add(NumF4);
		go.add(NumF5);
		go.add(NumF6);
		go.add(NumF7);
		go.add(NumF8);
		go.add(NumF9);
		go.add(NumF10);
		go.add(NumF11);
		go.add(NumF12);
		go.add(NumF13);
		go.add(NumF14);
		go.add(NumF15);
		go.add(NumF16);
		go.add(NumF17);
		go.add(NumF18);
		go.add(NumF19);
		
		rob.add(R1);
		rob.add(R2);
		rob.add(R3);
		rob.add(R4);
		rob.add(R5);
		rob.add(R6);
		rob.add(R7);
		rob.add(R8);
		rob.add(R9);
		rob.add(R10);
		rob.add(R11);
		rob.add(R12);
		rob.add(R13);
		rob.add(R14);
		rob.add(R15);
		rob.add(R16);
		rob.add(R17);
		rob.add(R18);
		rob.add(R19);
		
		
		
		villagep.add(0, ImageB1);
		villagep.add(1, ImageB2);
		villagep.add(2, ImageB3);
		villagep.add(3, ImageB4);
		villagep.add(4, ImageB5);
		villagep.add(5, ImageB6);
		villagep.add(6, ImageB7);
		villagep.add(7, ImageB8);
		villagep.add(8, ImageB9);
		villagep.add(9, ImageB10);
		villagep.add(10, ImageB11);
		villagep.add(11, ImageB12);
		villagep.add(12, ImageB13);
		villagep.add(13, ImageB14);
		villagep.add(14, ImageB15);
		villagep.add(15, ImageB16);
		villagep.add(16, ImageB17);
		villagep.add(17, ImageB18);
		villagep.add(18, ImageB19);
		villagep.add(19, ImageB20);
		villagep.add(20, ImageB21);
		villagep.add(21, ImageB22);
		villagep.add(22, ImageB23);
		villagep.add(23, ImageB24);
		villagep.add(24, ImageB25);
		villagep.add(25, ImageB26);
		villagep.add(26, ImageB27);
		villagep.add(27, ImageB28);
		villagep.add(28, ImageB29);
		villagep.add(29, ImageB30);
		villagep.add(30, ImageB31);
		villagep.add(31, ImageB32);
		villagep.add(32, ImageB33);
		villagep.add(33, ImageB34);
		villagep.add(34, ImageB35);
		villagep.add(35, ImageB36);
		villagep.add(36, ImageB37);
		villagep.add(37, ImageB38);
		villagep.add(38, ImageB39);
		villagep.add(39, ImageB40);
		villagep.add(40, ImageB41);
		villagep.add(41, ImageB42);
		villagep.add(42, ImageB43);
		villagep.add(43, ImageB44);
		villagep.add(44, ImageB45);
		villagep.add(45, ImageB46);
		villagep.add(46, ImageB47);
		villagep.add(47, ImageB48);
		villagep.add(48, ImageB49);
		villagep.add(49, ImageB50);
		villagep.add(50, ImageB51);
		villagep.add(51, ImageB52);
		villagep.add(52, ImageB53);
		villagep.add(53, ImageB54);
		
		
		
		streetp.add(0, S1);
		streetp.add(1, S2);
		streetp.add(2, S3);
		streetp.add(3, S4);
		streetp.add(4, S5);
		streetp.add(5, S6);
		streetp.add(6, S7);
		streetp.add(7, S8);
		streetp.add(8, S9);
		streetp.add(9, S10);
		streetp.add(10, S11);
		streetp.add(11, S12);
		streetp.add(12, S13);
		streetp.add(13, S14);
		streetp.add(14, S15);
		streetp.add(15, S16);
		streetp.add(16, S17);
		streetp.add(17, S18);
		streetp.add(18, S19);
		streetp.add(19, S20);
		streetp.add(20, S21);
		streetp.add(21, S22);
		streetp.add(22, S23);
		streetp.add(23, S24);
		streetp.add(24, S25);
		streetp.add(25, S26);
		streetp.add(26, S27);
		streetp.add(27, S28);
		streetp.add(28, S29);
		streetp.add(29, S30);
		streetp.add(30, S31);
		streetp.add(31, S32);
		streetp.add(32, S33);
		streetp.add(33, S34);
		streetp.add(34, S35);
		streetp.add(35, S36);
		streetp.add(36, S37);
		streetp.add(37, S38);
		streetp.add(38, S39);
		streetp.add(39, S40);
		streetp.add(40, S41);
		streetp.add(41, S42);
		streetp.add(42, S43);
		streetp.add(43, S44);
		streetp.add(44, S45);
		streetp.add(45, S46);
		streetp.add(46, S47);
		streetp.add(47, S48);
		streetp.add(48, S49);
		streetp.add(49, S50);
		streetp.add(50, S51);
		streetp.add(51, S52);
		streetp.add(52, S53);
		streetp.add(53, S54);
		streetp.add(54, S55);
		streetp.add(55, S56);
		streetp.add(56, S57);
		streetp.add(57, S58);
		streetp.add(58, S59);
		streetp.add(59, S60);
		streetp.add(60, S61);
		streetp.add(61, S62);
		streetp.add(62, S63);
		streetp.add(63, S64);
		streetp.add(64, S65);
		streetp.add(65, S66);
		streetp.add(66, S67);
		streetp.add(67, S68);
		streetp.add(68, S69);
		streetp.add(69, S70);
		streetp.add(70, S71);
		streetp.add(71, S72);
		
		
		Tiles tiles = new Tiles();
		ArrayList<Integer> tileSpot = tiles.getList();
		NumF1.setText("nwl" + tileSpot.get(0));
		NumF1.setVisible(false);
		NumF2.setText("nwd" + tileSpot.get(1));
		NumF2.setVisible(false);
		NumF3.setText("nwl" + tileSpot.get(2));
		NumF3.setVisible(false);
		NumF4.setText("no" + tileSpot.get(3));
		NumF4.setVisible(false);
		NumF5.setText("nb" + tileSpot.get(4));
		NumF5.setVisible(false);
		NumF6.setText("ng" + tileSpot.get(5));
		NumF6.setVisible(false);
		NumF7.setText("ng" + tileSpot.get(6));
		NumF7.setVisible(false);
		NumF8.setText("no" + tileSpot.get(7));
		NumF8.setVisible(false);
		NumF9.setText("nwl" + tileSpot.get(8));
		NumF9.setVisible(false);
		NumF10.setText("r7");
		NumF10.setVisible(false);
		NumF11.setText("nwd" + tileSpot.get(9));
		NumF11.setVisible(false);
		NumF12.setText("nb" + tileSpot.get(10));
		NumF12.setVisible(false);
		NumF13.setText("ng" + tileSpot.get(11));
		NumF13.setVisible(false);
		NumF14.setText("nwl" + tileSpot.get(12));
		NumF14.setVisible(false);
		NumF15.setText("nb" + tileSpot.get(13));
		NumF15.setVisible(false);
		NumF16.setText("nwd" + tileSpot.get(14));
		NumF16.setVisible(false);
		NumF17.setText("ng" + tileSpot.get(15));
		NumF17.setVisible(false);
		NumF18.setText("no" + tileSpot.get(16));
		NumF18.setVisible(false);
		NumF19.setText("nwd" + tileSpot.get(17));
		NumF19.setVisible(false);
		
		NF1.setText("" + tileSpot.get(0));
		NF2.setText("" + tileSpot.get(1));
		NF3.setText("" + tileSpot.get(2));
		NF4.setText("" + tileSpot.get(3));
		NF5.setText("" + tileSpot.get(4));
		NF6.setText("" + tileSpot.get(5));
		NF7.setText("" + tileSpot.get(6));
		NF8.setText("" + tileSpot.get(7));
		NF9.setText("" + tileSpot.get(8));
		NF10.setText("7");
		NF11.setText("" + tileSpot.get(9));
		NF12.setText("" + tileSpot.get(10));
		NF13.setText("" + tileSpot.get(11));
		NF14.setText("" + tileSpot.get(12));
		NF15.setText("" + tileSpot.get(13));
		NF16.setText("" + tileSpot.get(14));
		NF17.setText("" + tileSpot.get(15));
		NF18.setText("" +tileSpot.get(16));
		NF19.setText("" +tileSpot.get(17));
		
		for(int i = 0; i < playerList.size(); i++)
		{
			playerList.get(i).addBrick(1);
			playerList.get(i).addGrain(1);
			playerList.get(i).addWood(1);
			playerList.get(i).addWool(1);
			playerList.get(i).setRoad(2);
			
			/*playerList.get(i).addBrick(200);
			playerList.get(i).addGrain(200);
			playerList.get(i).addWood(200);
			playerList.get(i).addWool(200);
			playerList.get(i).addOre(200);*/
			
			PsetBrick(i + 1, playerList.get(i).getBrick() + "");
			PsetOre(i + 1, playerList.get(i).getOre() + "");
			PsetWood(i + 1, playerList.get(i).getWood() + "");
			PsetWool(i + 1, playerList.get(i).getWool() + "");
			PsetGrain(i + 1, playerList.get(i).getGrain() + "");
		}
		
		
		punkte.get(0).setAP1(Integer.parseInt(NumF12.getText().substring(2)));
		punkte.get(0).setSP1(NumF12.getText().substring(1, 2));
		punkte.get(0).setR1(NumF12.getText().substring(0, 1));
		punkte.get(0).setAP2(Integer.parseInt(NumF13.getText().substring(2)));
		punkte.get(0).setSP2(NumF13.getText().substring(1, 2));
		punkte.get(0).setR2(NumF13.getText().substring(0, 1));
		
		punkte.get(1).setAP1(Integer.parseInt(NumF13.getText().substring(2)));
		punkte.get(1).setSP1(NumF13.getText().substring(1, 2));
		punkte.get(1).setR1(NumF13.getText().substring(0, 1));
		
		punkte.get(2).setAP1(Integer.parseInt(NumF13.getText().substring(2)));
		punkte.get(2).setSP1(NumF13.getText().substring(1, 2));
		punkte.get(2).setR1(NumF13.getText().substring(0, 1));
		punkte.get(2).setAP2(Integer.parseInt(NumF19.getText().substring(3)));
		punkte.get(2).setSP2(NumF19.getText().substring(1, 3));
		punkte.get(2).setR2(NumF19.getText().substring(0, 1));
		
		punkte.get(3).setAP1(Integer.parseInt(NumF19.getText().substring(3)));
		punkte.get(3).setSP1(NumF19.getText().substring(1, 3));
		punkte.get(3).setR1(NumF19.getText().substring(0, 1));
		
		punkte.get(4).setAP1(Integer.parseInt(NumF19.getText().substring(3)));
		punkte.get(4).setSP1(NumF19.getText().substring(1, 3));
		punkte.get(4).setR1(NumF19.getText().substring(0, 1));
		
		punkte.get(5).setAP1(Integer.parseInt(NumF19.getText().substring(3)));
		punkte.get(5).setSP1(NumF19.getText().substring(1, 3));
		punkte.get(5).setR1(NumF19.getText().substring(0, 1));
		punkte.get(5).setAP2(Integer.parseInt(NumF18.getText().substring(2)));
		punkte.get(5).setSP2(NumF18.getText().substring(1, 2));
		punkte.get(5).setR2(NumF18.getText().substring(0, 1));
		
		punkte.get(6).setAP1(Integer.parseInt(NumF18.getText().substring(2)));
		punkte.get(6).setSP1(NumF18.getText().substring(1, 2));
		punkte.get(6).setR1(NumF18.getText().substring(0, 1));
		
		punkte.get(7).setAP1(Integer.parseInt(NumF18.getText().substring(2)));
		punkte.get(7).setSP1(NumF18.getText().substring(1, 2));
		punkte.get(7).setR1(NumF18.getText().substring(0, 1));
		punkte.get(7).setAP2(Integer.parseInt(NumF17.getText().substring(2)));
		punkte.get(7).setSP2(NumF17.getText().substring(1, 2));
		punkte.get(7).setR2(NumF17.getText().substring(0, 1));
		
		punkte.get(8).setAP1(Integer.parseInt(NumF17.getText().substring(2)));
		punkte.get(8).setSP1(NumF17.getText().substring(1, 2));
		punkte.get(8).setR1(NumF17.getText().substring(0, 1));
		
		punkte.get(9).setAP1(Integer.parseInt(NumF17.getText().substring(2)));
		punkte.get(9).setSP1(NumF17.getText().substring(1, 2));
		punkte.get(9).setR1(NumF17.getText().substring(0, 1));
		
		punkte.get(10).setAP1(Integer.parseInt(NumF16.getText().substring(3)));
		punkte.get(10).setSP1(NumF16.getText().substring(1, 3));
		punkte.get(10).setR1(NumF16.getText().substring(0, 1));
		punkte.get(10).setAP2(Integer.parseInt(NumF17.getText().substring(2)));
		punkte.get(10).setSP2(NumF17.getText().substring(1, 2));
		punkte.get(10).setR2(NumF17.getText().substring(0, 1));
		
		punkte.get(11).setAP1(Integer.parseInt(NumF16.getText().substring(3)));
		punkte.get(11).setSP1(NumF16.getText().substring(1, 3));
		punkte.get(11).setR1(NumF16.getText().substring(0, 1));
		
		punkte.get(12).setAP1(Integer.parseInt(NumF8.getText().substring(2)));
		punkte.get(12).setSP1(NumF8.getText().substring(1, 2));
		punkte.get(12).setR1(NumF8.getText().substring(0, 1));
		punkte.get(12).setAP2(Integer.parseInt(NumF16.getText().substring(3)));
		punkte.get(12).setSP2(NumF16.getText().substring(1, 3));
		punkte.get(12).setR1(NumF8.getText().substring(0, 1));
		
		punkte.get(13).setAP1(Integer.parseInt(NumF8.getText().substring(2)));
		punkte.get(13).setSP1(NumF8.getText().substring(1, 2));
		punkte.get(13).setR1(NumF8.getText().substring(0, 1));
		
		punkte.get(14).setAP1(Integer.parseInt(NumF8.getText().substring(2)));
		punkte.get(14).setSP1(NumF8.getText().substring(1, 2));
		punkte.get(14).setR1(NumF8.getText().substring(0, 1));
		
		punkte.get(15).setAP1(Integer.parseInt(NumF7.getText().substring(2)));
		punkte.get(15).setSP1(NumF7.getText().substring(1, 2));
		punkte.get(15).setR1(NumF7.getText().substring(0, 1));
		punkte.get(15).setAP2(Integer.parseInt(NumF8.getText().substring(2)));
		punkte.get(15).setSP2(NumF8.getText().substring(1, 2));
		punkte.get(15).setR2(NumF8.getText().substring(0, 1));
		
		punkte.get(16).setAP1(Integer.parseInt(NumF7.getText().substring(2)));
		punkte.get(16).setSP1(NumF7.getText().substring(1, 2));
		punkte.get(16).setR1(NumF7.getText().substring(0, 1));
		
		punkte.get(17).setAP1(Integer.parseInt(NumF1.getText().substring(3)));
		punkte.get(17).setSP1(NumF1.getText().substring(1, 3));
		punkte.get(17).setR1(NumF1.getText().substring(0, 1));
		punkte.get(17).setAP2(Integer.parseInt(NumF7.getText().substring(2)));
		punkte.get(17).setSP2(NumF7.getText().substring(1, 2));
		punkte.get(17).setR2(NumF7.getText().substring(0, 1));

		punkte.get(18).setAP1(Integer.parseInt(NumF1.getText().substring(3)));
		punkte.get(18).setSP1(NumF1.getText().substring(1, 3));
		punkte.get(18).setR1(NumF1.getText().substring(0, 1));
		
		punkte.get(19).setAP1(Integer.parseInt(NumF1.getText().substring(3)));
		punkte.get(19).setSP1(NumF1.getText().substring(1, 3));
		punkte.get(19).setR1(NumF1.getText().substring(0, 1));
		
		punkte.get(20).setAP1(Integer.parseInt(NumF1.getText().substring(3)));
		punkte.get(20).setSP1(NumF1.getText().substring(1, 3));
		punkte.get(20).setR1(NumF1.getText().substring(0, 1));
		punkte.get(20).setAP2(Integer.parseInt(NumF2.getText().substring(3)));
		punkte.get(20).setSP2(NumF2.getText().substring(1, 3));
		punkte.get(20).setR2(NumF2.getText().substring(0, 1));
		
		punkte.get(21).setAP1(Integer.parseInt(NumF2.getText().substring(3)));
		punkte.get(21).setSP1(NumF2.getText().substring(1, 3));
		punkte.get(21).setR1(NumF2.getText().substring(0, 1));
		
		punkte.get(22).setAP1(Integer.parseInt(NumF2.getText().substring(3)));
		punkte.get(22).setSP1(NumF2.getText().substring(1, 3));
		punkte.get(22).setR1(NumF2.getText().substring(0, 1));
		punkte.get(22).setAP2(Integer.parseInt(NumF3.getText().substring(3)));
		punkte.get(22).setSP2(NumF3.getText().substring(1, 3));
		punkte.get(22).setR2(NumF3.getText().substring(0, 1));
		
		punkte.get(23).setAP1(Integer.parseInt(NumF3.getText().substring(3)));
		punkte.get(23).setSP1(NumF3.getText().substring(1, 3));
		punkte.get(23).setR1(NumF3.getText().substring(0, 1));
		
		punkte.get(24).setAP1(Integer.parseInt(NumF3.getText().substring(3)));
		punkte.get(24).setSP1(NumF3.getText().substring(1, 3));
		punkte.get(24).setR1(NumF3.getText().substring(0, 1));
		
		punkte.get(25).setAP1(Integer.parseInt(NumF3.getText().substring(3)));
		punkte.get(25).setSP1(NumF3.getText().substring(1, 3));
		punkte.get(25).setR1(NumF3.getText().substring(0, 1));
		punkte.get(25).setAP2(Integer.parseInt(NumF4.getText().substring(2)));
		punkte.get(25).setSP2(NumF4.getText().substring(1, 2));
		punkte.get(25).setR2(NumF4.getText().substring(0, 1));
		
		punkte.get(26).setAP1(Integer.parseInt(NumF4.getText().substring(2)));
		punkte.get(26).setSP1(NumF4.getText().substring(1, 2));
		punkte.get(26).setR1(NumF4.getText().substring(0, 1));
		
		punkte.get(27).setAP1(Integer.parseInt(NumF4.getText().substring(2)));
		punkte.get(27).setSP1(NumF4.getText().substring(1, 2));
		punkte.get(27).setR1(NumF4.getText().substring(0, 1));
		punkte.get(27).setAP2(Integer.parseInt(NumF12.getText().substring(2)));
		punkte.get(27).setSP2(NumF12.getText().substring(1, 2));
		punkte.get(27).setR2(NumF12.getText().substring(0, 1));
		
		punkte.get(28).setAP1(Integer.parseInt(NumF12.getText().substring(2)));
		punkte.get(28).setSP1(NumF12.getText().substring(1, 2));
		punkte.get(28).setR1(NumF12.getText().substring(0, 1));
		
		punkte.get(29).setAP1(Integer.parseInt(NumF12.getText().substring(2)));
		punkte.get(29).setSP1(NumF12.getText().substring(1, 2));
		punkte.get(29).setR1(NumF12.getText().substring(0, 1));
		
		punkte.get(30).setAP1(Integer.parseInt(NumF11.getText().substring(3)));
		punkte.get(30).setSP1(NumF11.getText().substring(1, 3));
		punkte.get(30).setR1(NumF11.getText().substring(0, 1));
		punkte.get(30).setAP2(Integer.parseInt(NumF12.getText().substring(2)));
		punkte.get(30).setSP2(NumF12.getText().substring(1, 2));
		punkte.get(30).setR2(NumF12.getText().substring(0, 1));
		punkte.get(30).setAP3(Integer.parseInt(NumF13.getText().substring(2)));
		punkte.get(30).setSP3(NumF13.getText().substring(1, 2));
		punkte.get(30).setR3(NumF13.getText().substring(0, 1));
		
		punkte.get(31).setAP1(Integer.parseInt(NumF11.getText().substring(3)));
		punkte.get(31).setSP1(NumF11.getText().substring(1, 3));
		punkte.get(31).setR1(NumF11.getText().substring(0, 1));
		punkte.get(31).setAP2(Integer.parseInt(NumF13.getText().substring(2)));
		punkte.get(31).setSP2(NumF13.getText().substring(1, 2));
		punkte.get(31).setR2(NumF13.getText().substring(0, 1));
		punkte.get(31).setAP3(Integer.parseInt(NumF14.getText().substring(3)));
		punkte.get(31).setSP3(NumF14.getText().substring(1, 3));
		punkte.get(31).setR3(NumF14.getText().substring(0, 1));
		
		punkte.get(32).setAP1(Integer.parseInt(NumF13.getText().substring(2)));
		punkte.get(32).setSP1(NumF13.getText().substring(1, 2));
		punkte.get(32).setR1(NumF13.getText().substring(0, 1));
		punkte.get(32).setAP2(Integer.parseInt(NumF14.getText().substring(3)));
		punkte.get(32).setSP2(NumF14.getText().substring(1, 3));
		punkte.get(32).setR2(NumF14.getText().substring(0, 1));
		punkte.get(32).setAP3(Integer.parseInt(NumF19.getText().substring(3)));
		punkte.get(32).setSP3(NumF19.getText().substring(1, 3));
		punkte.get(32).setR3(NumF19.getText().substring(0, 1));
		
		punkte.get(33).setAP1(Integer.parseInt(NumF14.getText().substring(3)));
		punkte.get(33).setSP1(NumF14.getText().substring(1, 3));
		punkte.get(33).setR1(NumF14.getText().substring(0, 1));
		punkte.get(33).setAP2(Integer.parseInt(NumF18.getText().substring(2)));
		punkte.get(33).setSP2(NumF18.getText().substring(1, 2));
		punkte.get(33).setR2(NumF18.getText().substring(0, 1));
		punkte.get(33).setAP3(Integer.parseInt(NumF19.getText().substring(3)));
		punkte.get(33).setSP3(NumF19.getText().substring(1, 3));
		punkte.get(33).setR3(NumF19.getText().substring(0, 1));
		
		punkte.get(34).setAP1(Integer.parseInt(NumF14.getText().substring(3)));
		punkte.get(34).setSP1(NumF14.getText().substring(1, 3));
		punkte.get(34).setR1(NumF14.getText().substring(0, 1));
		punkte.get(34).setAP2(Integer.parseInt(NumF15.getText().substring(2)));
		punkte.get(34).setSP2(NumF15.getText().substring(1, 2));
		punkte.get(34).setR2(NumF15.getText().substring(0, 1));
		punkte.get(34).setAP3(Integer.parseInt(NumF18.getText().substring(2)));
		punkte.get(34).setSP3(NumF18.getText().substring(1, 2));
		punkte.get(34).setR3(NumF18.getText().substring(0, 1));
		
		punkte.get(35).setAP1(Integer.parseInt(NumF15.getText().substring(2)));
		punkte.get(35).setSP1(NumF15.getText().substring(1, 2));
		punkte.get(35).setR1(NumF15.getText().substring(0, 1));
		punkte.get(35).setAP2(Integer.parseInt(NumF17.getText().substring(2)));
		punkte.get(35).setSP2(NumF17.getText().substring(1, 2));
		punkte.get(35).setR2(NumF17.getText().substring(0, 1));
		punkte.get(35).setAP3(Integer.parseInt(NumF18.getText().substring(2)));
		punkte.get(35).setSP3(NumF18.getText().substring(1, 2));
		punkte.get(35).setR3(NumF18.getText().substring(0, 1));
		
		punkte.get(36).setAP1(Integer.parseInt(NumF15.getText().substring(2)));
		punkte.get(36).setSP1(NumF15.getText().substring(1, 2));
		punkte.get(36).setR1(NumF15.getText().substring(0, 1));
		punkte.get(36).setAP2(Integer.parseInt(NumF16.getText().substring(3)));
		punkte.get(36).setSP2(NumF16.getText().substring(1, 3));
		punkte.get(36).setR2(NumF16.getText().substring(0, 1));
		punkte.get(36).setAP3(Integer.parseInt(NumF17.getText().substring(2)));
		punkte.get(36).setSP3(NumF17.getText().substring(1, 2));
		punkte.get(36).setR3(NumF17.getText().substring(0, 1));
		
		punkte.get(37).setAP1(Integer.parseInt(NumF9.getText().substring(3)));
		punkte.get(37).setSP1(NumF9.getText().substring(1, 3));
		punkte.get(37).setR1(NumF9.getText().substring(0, 1));
		punkte.get(37).setAP2(Integer.parseInt(NumF15.getText().substring(2)));
		punkte.get(37).setSP2(NumF15.getText().substring(1, 2));
		punkte.get(37).setR2(NumF15.getText().substring(0, 1));
		punkte.get(37).setAP3(Integer.parseInt(NumF16.getText().substring(3)));
		punkte.get(37).setSP3(NumF16.getText().substring(1, 3));
		punkte.get(37).setR3(NumF16.getText().substring(0, 1));
		
		punkte.get(38).setAP1(Integer.parseInt(NumF8.getText().substring(2)));
		punkte.get(38).setSP1(NumF8.getText().substring(1, 2));
		punkte.get(38).setR1(NumF8.getText().substring(0, 1));
		punkte.get(38).setAP2(Integer.parseInt(NumF9.getText().substring(3)));
		punkte.get(38).setSP2(NumF9.getText().substring(1, 3));
		punkte.get(38).setR2(NumF9.getText().substring(0, 1));
		punkte.get(38).setAP1(Integer.parseInt(NumF16.getText().substring(3)));
		punkte.get(38).setSP3(NumF16.getText().substring(1, 3));
		punkte.get(38).setR3(NumF16.getText().substring(0, 1));
		
		punkte.get(39).setAP1(Integer.parseInt(NumF7.getText().substring(2)));
		punkte.get(39).setSP1(NumF7.getText().substring(1, 2));
		punkte.get(39).setR1(NumF7.getText().substring(0, 1));
		punkte.get(39).setAP2(Integer.parseInt(NumF8.getText().substring(2)));
		punkte.get(39).setSP2(NumF8.getText().substring(1, 2));
		punkte.get(39).setR2(NumF8.getText().substring(0, 1));
		punkte.get(39).setAP3(Integer.parseInt(NumF9.getText().substring(3)));
		punkte.get(39).setSP3(NumF9.getText().substring(1, 3));
		punkte.get(39).setR3(NumF9.getText().substring(0, 1));
		
		punkte.get(40).setAP1(Integer.parseInt(NumF6.getText().substring(2)));
		punkte.get(40).setSP1(NumF6.getText().substring(1, 2));
		punkte.get(40).setR1(NumF6.getText().substring(0, 1));
		punkte.get(40).setAP2(Integer.parseInt(NumF7.getText().substring(2)));
		punkte.get(40).setSP2(NumF7.getText().substring(1, 2));
		punkte.get(40).setR2(NumF7.getText().substring(0, 1));
		punkte.get(40).setAP3(Integer.parseInt(NumF9.getText().substring(3)));
		punkte.get(40).setSP3(NumF9.getText().substring(1, 3));
		punkte.get(40).setR3(NumF9.getText().substring(0, 1));
		
		punkte.get(41).setAP1(Integer.parseInt(NumF1.getText().substring(3)));
		punkte.get(41).setSP1(NumF1.getText().substring(1, 3));
		punkte.get(41).setR1(NumF1.getText().substring(0, 1));
		punkte.get(41).setAP2(Integer.parseInt(NumF6.getText().substring(2)));
		punkte.get(41).setSP2(NumF6.getText().substring(1, 2));
		punkte.get(41).setR2(NumF6.getText().substring(0, 1));
		punkte.get(41).setAP3(Integer.parseInt(NumF7.getText().substring(2)));
		punkte.get(41).setSP3(NumF7.getText().substring(1, 2));
		punkte.get(41).setR3(NumF7.getText().substring(0, 1));
		
		punkte.get(42).setAP1(Integer.parseInt(NumF1.getText().substring(3)));
		punkte.get(42).setSP1(NumF1.getText().substring(1, 3));
		punkte.get(42).setR1(NumF1.getText().substring(0, 1));
		punkte.get(42).setAP2(Integer.parseInt(NumF2.getText().substring(3)));
		punkte.get(42).setSP2(NumF2.getText().substring(1, 3));
		punkte.get(42).setR2(NumF2.getText().substring(0, 1));
		punkte.get(42).setAP3(Integer.parseInt(NumF6.getText().substring(2)));
		punkte.get(42).setSP3(NumF6.getText().substring(1, 2));
		punkte.get(42).setR3(NumF6.getText().substring(0, 1));
		
		punkte.get(43).setAP1(Integer.parseInt(NumF2.getText().substring(3)));
		punkte.get(43).setSP1(NumF2.getText().substring(1, 3));
		punkte.get(43).setR1(NumF2.getText().substring(0, 1));
		punkte.get(43).setAP2(Integer.parseInt(NumF5.getText().substring(2)));
		punkte.get(43).setSP2(NumF5.getText().substring(1, 2));
		punkte.get(43).setR2(NumF5.getText().substring(0, 1));
		punkte.get(43).setAP3(Integer.parseInt(NumF6.getText().substring(2)));
		punkte.get(43).setSP3(NumF6.getText().substring(1, 2));
		punkte.get(43).setR3(NumF6.getText().substring(0, 1));
		
		punkte.get(44).setAP1(Integer.parseInt(NumF2.getText().substring(3)));
		punkte.get(44).setSP1(NumF2.getText().substring(1, 3));
		punkte.get(44).setR1(NumF2.getText().substring(0, 1));
		punkte.get(44).setAP2(Integer.parseInt(NumF3.getText().substring(3)));
		punkte.get(44).setSP2(NumF3.getText().substring(1, 3));
		punkte.get(44).setR2(NumF3.getText().substring(0, 1));
		punkte.get(44).setAP3(Integer.parseInt(NumF5.getText().substring(2)));
		punkte.get(44).setSP3(NumF5.getText().substring(1, 2));
		punkte.get(44).setR3(NumF5.getText().substring(0, 1));
		
		punkte.get(45).setAP1(Integer.parseInt(NumF3.getText().substring(3)));
		punkte.get(45).setSP1(NumF3.getText().substring(1, 3));
		punkte.get(45).setR1(NumF3.getText().substring(0, 1));
		punkte.get(45).setAP2(Integer.parseInt(NumF4.getText().substring(2)));
		punkte.get(45).setSP2(NumF4.getText().substring(1, 2));
		punkte.get(45).setR2(NumF4.getText().substring(0, 1));
		punkte.get(45).setAP3(Integer.parseInt(NumF5.getText().substring(2)));
		punkte.get(45).setSP3(NumF5.getText().substring(1, 2));
		punkte.get(45).setR3(NumF5.getText().substring(0, 1));
		
		punkte.get(46).setAP1(Integer.parseInt(NumF4.getText().substring(2)));
		punkte.get(46).setSP1(NumF4.getText().substring(1, 2));
		punkte.get(46).setR1(NumF4.getText().substring(0, 1));
		punkte.get(46).setAP2(Integer.parseInt(NumF5.getText().substring(2)));
		punkte.get(46).setSP2(NumF5.getText().substring(1, 2));
		punkte.get(46).setR2(NumF5.getText().substring(0, 1));
		punkte.get(46).setAP3(Integer.parseInt(NumF11.getText().substring(3)));
		punkte.get(46).setSP3(NumF11.getText().substring(1, 3));
		punkte.get(46).setR3(NumF11.getText().substring(0, 1));
		
		punkte.get(47).setAP1(Integer.parseInt(NumF4.getText().substring(2)));
		punkte.get(47).setSP1(NumF4.getText().substring(1, 2));
		punkte.get(47).setR1(NumF4.getText().substring(0, 1));
		punkte.get(47).setAP2(Integer.parseInt(NumF11.getText().substring(3)));
		punkte.get(47).setSP2(NumF11.getText().substring(1, 3));
		punkte.get(47).setR2(NumF11.getText().substring(0, 1));
		punkte.get(47).setAP3(Integer.parseInt(NumF12.getText().substring(2)));
		punkte.get(47).setSP3(NumF12.getText().substring(1, 2));
		punkte.get(47).setR3(NumF12.getText().substring(0, 1));
		
		punkte.get(48).setAP1(Integer.parseInt(NumF10.getText().substring(1)));
		punkte.get(48).setAP2(Integer.parseInt(NumF11.getText().substring(3)));
		punkte.get(48).setSP2(NumF11.getText().substring(1, 3));
		punkte.get(48).setR2(NumF11.getText().substring(0, 1));
		punkte.get(48).setAP3(Integer.parseInt(NumF14.getText().substring(3)));
		punkte.get(48).setSP3(NumF14.getText().substring(1, 3));
		punkte.get(48).setR3(NumF14.getText().substring(0, 1));
		
		punkte.get(49).setAP1(Integer.parseInt(NumF10.getText().substring(1)));
		punkte.get(49).setAP2(Integer.parseInt(NumF14.getText().substring(3)));
		punkte.get(49).setSP2(NumF14.getText().substring(1, 3));
		punkte.get(49).setR2(NumF14.getText().substring(0, 1));
		punkte.get(49).setAP3(Integer.parseInt(NumF15.getText().substring(2)));
		punkte.get(49).setSP3(NumF15.getText().substring(1, 2));
		punkte.get(49).setR3(NumF15.getText().substring(0, 1));
		
		punkte.get(50).setAP1(Integer.parseInt(NumF9.getText().substring(3)));
		punkte.get(50).setSP1(NumF9.getText().substring(1, 3));
		punkte.get(50).setR1(NumF9.getText().substring(0, 1));
		punkte.get(50).setAP2(Integer.parseInt(NumF10.getText().substring(1)));
		punkte.get(50).setAP3(Integer.parseInt(NumF15.getText().substring(2)));
		punkte.get(50).setSP3(NumF15.getText().substring(1, 2));
		punkte.get(50).setR3(NumF15.getText().substring(0, 1));
		
		punkte.get(51).setAP1(Integer.parseInt(NumF6.getText().substring(2)));
		punkte.get(51).setSP1(NumF6.getText().substring(1, 2));
		punkte.get(51).setR1(NumF6.getText().substring(0, 1));
		punkte.get(51).setAP2(Integer.parseInt(NumF9.getText().substring(3)));
		punkte.get(51).setSP2(NumF9.getText().substring(1, 3));
		punkte.get(51).setR2(NumF9.getText().substring(0, 1));
		punkte.get(51).setAP3(Integer.parseInt(NumF10.getText().substring(1)));
		
		punkte.get(52).setAP1(Integer.parseInt(NumF5.getText().substring(2)));
		punkte.get(52).setSP1(NumF5.getText().substring(1, 2));
		punkte.get(52).setR1(NumF5.getText().substring(0, 1));
		punkte.get(52).setAP2(Integer.parseInt(NumF6.getText().substring(2)));
		punkte.get(52).setSP2(NumF6.getText().substring(1, 2));
		punkte.get(52).setR2(NumF6.getText().substring(0, 1));
		punkte.get(52).setAP3(Integer.parseInt(NumF10.getText().substring(1)));
		
		punkte.get(53).setAP1(Integer.parseInt(NumF5.getText().substring(2)));
		punkte.get(53).setSP1(NumF5.getText().substring(1, 2));
		punkte.get(53).setR1(NumF5.getText().substring(0, 1));
		punkte.get(53).setAP2(Integer.parseInt(NumF10.getText().substring(1)));
		punkte.get(53).setAP3(Integer.parseInt(NumF11.getText().substring(3)));
		punkte.get(53).setSP3(NumF11.getText().substring(1, 3));
		punkte.get(53).setR3(NumF11.getText().substring(0, 1));

		P2Wood.setVisible(false);
		P2Wool.setVisible(false);
		P2Brick.setVisible(false);
		P2Ore.setVisible(false);
		P2Grain.setVisible(false);
		P3Wood.setVisible(false);
		P3Wool.setVisible(false);
		P3Brick.setVisible(false);
		P3Ore.setVisible(false);
		P3Grain.setVisible(false);
		P4Wood.setVisible(false);
		P4Wool.setVisible(false);
		P4Brick.setVisible(false);
		P4Ore.setVisible(false);
		P4Grain.setVisible(false);
		
		
		
		playernumber.setVisible(false);
		playercount.setVisible(false);
	}
	
	public void PsetBrick(int _i, String _text)
	{
		if(_i == 1)
		{
			P1Brick.setText(_text);
		}
		if(_i == 2)
		{
			P2Brick.setText(_text);
		}
		if(_i == 3)
		{
			P3Brick.setText(_text);
		}
		if(_i == 4)
		{
			P4Brick.setText(_text);
		}
	}
	public void PsetWood(int _i, String _text)
	{
		if(_i == 1)
		{
			P1Wood.setText(_text);
		}
		if(_i == 2)
		{
			P2Wood.setText(_text);
		}
		if(_i == 3)
		{
			P3Wood.setText(_text);
		}
		if(_i == 4)
		{
			P4Wood.setText(_text);
		}
	}
	public void PsetWool(int _i, String _text)
	{
		if(_i == 1)
		{
			P1Wool.setText(_text);
		}
		if(_i == 2)
		{
			P2Wool.setText(_text);
		}
		if(_i == 3)
		{
			P3Wool.setText(_text);
		}
		if(_i == 4)
		{
			P4Wool.setText(_text);
		}
	}
	public void PsetOre(int _i, String _text)
	{
		if(_i == 1)
		{
			P1Ore.setText(_text);
		}
		if(_i == 2)
		{
			P2Ore.setText(_text);
		}
		if(_i == 3)
		{
			P3Ore.setText(_text);
		}
		if(_i == 4)
		{
			P4Ore.setText(_text);
		}
	}
	public void PsetGrain(int _i, String _text)
	{
		if(_i == 1)
		{
			P1Grain.setText(_text);
		}
		if(_i == 2)
		{
			P2Grain.setText(_text);
		}
		if(_i == 3)
		{
			P3Grain.setText(_text);
		}
		if(_i == 4)
		{
			P4Grain.setText(_text);
		}
	}
	
	public void Pvisible(int _i)
	{
		if(_i == 1)
		{
			P1Wood.setVisible(true);
			P1Wool.setVisible(true);
			P1Brick.setVisible(true);
			P1Ore.setVisible(true);
			P1Grain.setVisible(true);
		}
		if(_i == 2)
		{
			P2Wood.setVisible(true);
			P2Wool.setVisible(true);
			P2Brick.setVisible(true);
			P2Ore.setVisible(true);
			P2Grain.setVisible(true);
		}
		if(_i == 3)
		{
			P3Wood.setVisible(true);
			P3Wool.setVisible(true);
			P3Brick.setVisible(true);
			P3Ore.setVisible(true);
			P3Grain.setVisible(true);
		}
		if(_i == 4)
		{
			P4Wood.setVisible(true);
			P4Wool.setVisible(true);
			P4Brick.setVisible(true);
			P4Ore.setVisible(true);
			P4Grain.setVisible(true);
		}
	}
	public void Pinvisible(int _i)
	{
		if(_i == 1)
		{
			P1Wood.setVisible(false);
			P1Wool.setVisible(false);
			P1Brick.setVisible(false);
			P1Ore.setVisible(false);
			P1Grain.setVisible(false);
		}
		if(_i == 2)
		{
			P2Wood.setVisible(false);
			P2Wool.setVisible(false);
			P2Brick.setVisible(false);
			P2Ore.setVisible(false);
			P2Grain.setVisible(false);
		}
		if(_i == 3)
		{
			P3Wood.setVisible(false);
			P3Wool.setVisible(false);
			P3Brick.setVisible(false);
			P3Ore.setVisible(false);
			P3Grain.setVisible(false);
		}
		if(_i == 4)
		{
			P4Wood.setVisible(false);
			P4Wool.setVisible(false);
			P4Brick.setVisible(false);
			P4Ore.setVisible(false);
			P4Grain.setVisible(false);
		}
	}
	
	public void ändereZustand()
	{
		if(start)
		{
			if(playerList.get(zustand).getRobber() != 0)
			{
				playerList.get(zustand).takeRobber(1);
			}
				
			zustand = zustand + 1;
			if(zustand == zustandList.size())
			{
				zustand = 0;
			}
			
			Pinvisible(1);
			Pinvisible(2);
			Pinvisible(3);
			Pinvisible(4);
			Pvisible(zustand + 1);
				
			if(zustand == 0)
			{
				playerField.setText("Aktuell: Rot");
			}
			else if(zustand == 1)
			{
				playerField.setText("Aktuell: Blau");
			}
			else if(zustand == 2)
			{
				playerField.setText("Aktuell: Weiß");
			}
			else if(zustand == 3)
			{
				playerField.setText("Aktuell: Orange");
			}
				
				
			if(chapel.getImage() == chapelB)
			{
				chapel.setImage(chapelB);
			}
			else
			{
				chapel.setImage(black);
			}
				
			if(library.getImage() == libraryB)
			{
				library.setImage(libraryB);
			}
			else
			{
				library.setImage(black);
			}
				
			if(market.getImage() == marketB)
			{
				market.setImage(marketB);
			}
			else
			{
				market.setImage(black);
			}
				
			if(monopoly.getImage() == monopolyB)
			{
				monopoly.setImage(monopolyB);
			}
			else
			{
				monopoly.setImage(black);
			}
				
			if(palace.getImage() == palaceB)
			{
				palace.setImage(palaceB);
			}
			else
			{
				palace.setImage(black);
			}
				
			if(roadbuild.getImage() == roadbuildB)
			{
				roadbuild.setImage(roadbuildB);
			}
			else
			{
				roadbuild.setImage(black);
			}
				
			if(university.getImage() == universityB)
			{
				university.setImage(universityB);
			}
			else
			{
				university.setImage(black);
			}
				
			if(yop.getImage() == yopB)
			{
				yop.setImage(yopB);
			}
			else
			{
				yop.setImage(black);
			}
				
				
		    for(int i = 0; i < playerList.get(zustand).gibDevCards().size(); i++)
		    {
		    	if(playerList.get(zustand).gibDevCards().get(i) != null)
		    	{
		    		String test = playerList.get(zustand).gibDevCards().get(i).getCard();
		    		switch(test) {
		    			 case "chapel":
		    			  chapel.setImage(chapelI);
		    		    break;
		    		  case "library":
		    			  library.setImage(libraryI);
		    		    break;
		    		  case "market":
		    			  market.setImage(marketI);
		      		    break;
		    		  case "monopoly":
		    			  monopoly.setImage(monopolyI);
		      		    break;
		    		  case "palace":
		    			  palace.setImage(palaceI);
		      		    break;
		    		  case "roadbuild":
		    			  roadbuild.setImage(roadbuildI);
		      		    break;
		    		  case "university":
		    			 university.setImage(universityI);
		     		    break;
		    		  case "yop":
		    			  yop.setImage(yopI);
		      		    break;
		    		  default:
		    		    // code block
		    		}
		    	}
		   	}
		}
		else
		{
			System.out.println("Spiel ist nicht gestartet");
		}
	}
	
	public void Street(MouseEvent e)
	{
		if(start)
		{
			final Node source = (Node) e.getSource();
			String id = source.getId();
			
			for(int n = 0; n < zustandList.size(); n++)
			{
				if(zustandList.get(n) == zustand)
				{
					if(playerList.get(n).getRoad() > 0)
					{
						for(int i = 0; i < 72; i++)
						{
							if(streetp.get(i).getImage().getUrl().substring(73, 77).equals("leer"))
							{
								if(streetp.get(i).getId() == id)
								{
									switch(zustand)
									{
									case 0: 
											P1Brick.setText(playerList.get(n).getBrick() + "");
											P1Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(redStreet);
											break;
									case 1:
											P2Brick.setText(playerList.get(n).getBrick() + "");
											P2Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(blueStreet);
											break;
									case 2:
											P3Brick.setText(playerList.get(n).getBrick() + "");
											P3Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(whiteStreet);
											break;
									case 3:
											P4Brick.setText(playerList.get(n).getBrick() + "");
											P4Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(orangeStreet);
											break;
									}
								}
							}
							else
							{
								System.out.println("Die Straße gehört schon wem");
							}
						}
						playerList.get(n).setRoad(-1);
					}
					else if(playerList.get(n).ControllStraße(1))
					{
						for(int i = 0; i < 72; i++)
						{
							if(streetp.get(i).getImage().getUrl().substring(73, 77).equals("leer"))
							{
								if(streetp.get(i).getId() == id)
								{
									playerList.get(n).Straße(1);
									switch(zustand)
									{
									case 0: 
											P1Brick.setText(playerList.get(n).getBrick() + "");
											P1Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(redStreet);
											break;
									case 1:
											P2Brick.setText(playerList.get(n).getBrick() + "");
											P2Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(blueStreet);
											break;
									case 2:
											P3Brick.setText(playerList.get(n).getBrick() + "");
											P3Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(whiteStreet);
											break;
									case 3:
											P4Brick.setText(playerList.get(n).getBrick() + "");
											P4Wood.setText(playerList.get(n).getWood() + "");
											streetp.get(i).setImage(orangeStreet);
											break;
									}
								}
							}
							else
							{
								System.out.println("Die Straße gehört schon wem");
							}
						}
					}
					else
					{
						System.out.println("nicht genug Ressourcen für eine Straße");
					}
				}
			}
		}
		else
		{
			System.out.println("Spiel ist nicht gestartet");
		}
	}
	
    public void Village(MouseEvent e)
    {
    	final Node source = (Node) e.getSource();
		String id = source.getId();
    	if(start)
    	{
    		for(int n = 0; n < zustandList.size(); n++)
			{
				if(zustandList.get(n) == zustand)
				{
					if(playerList.get(n).ControllStadt(1) || playerList.get(n).ControllDorf(1))
					{
							if(!punkte.get(Integer.parseInt(id.substring(6)) - 1).getVillage())
							{
								if(playerList.get(n).Dorf(1))
								{
									for(int i = 0; i < 54; i++)
									{
										if(villagep.get(i).getId() == id)
										{
											punkte.get(i).setVillage(true);
											switch(zustand)
											{
											case 0: 
													P1Brick.setText(playerList.get(n).getBrick() + "");
													P1Wood.setText(playerList.get(n).getWood() + "");
													P1Wool.setText(playerList.get(n).getBrick() + "");
													P1Grain.setText(playerList.get(n).getGrain() + "");
													villagep.get(i).setImage(redVillage);
													break;
											case 1:
													P2Brick.setText(playerList.get(n).getBrick() + "");
													P2Wood.setText(playerList.get(n).getWood() + "");
													P2Wool.setText(playerList.get(n).getBrick() + "");
													P2Grain.setText(playerList.get(n).getGrain() + "");
													villagep.get(i).setImage(blueVillage);
													break;
											case 2:
													P3Brick.setText(playerList.get(n).getBrick() + "");
													P3Wood.setText(playerList.get(n).getWood() + "");
													P3Wool.setText(playerList.get(n).getBrick() + "");
													P3Grain.setText(playerList.get(n).getGrain() + "");
													villagep.get(i).setImage(whiteVillage);
													break;
											case 3:
													P4Brick.setText(playerList.get(n).getBrick() + "");
													P4Wood.setText(playerList.get(n).getWood() + "");
													P4Wool.setText(playerList.get(n).getBrick() + "");
													P4Grain.setText(playerList.get(n).getGrain() + "");
													villagep.get(i).setImage(orangeVillage);
													break;
											}
										}
									}
									PsetBrick(n, playerList.get(n).getBrick() + "");
									PsetWool(n, playerList.get(n).getWool() + "");
									PsetWood(n, playerList.get(n).getWood() + "");
									PsetGrain(n, playerList.get(n).getGrain() + "");
								}
								else
								{
									System.out.println("nicht genug Ressourcen für ein Dorf");
								}
							}
							else if(playerList.get(n).ControllStadt(1))
							{
									for(int i = 0; i < 54; i++)
									{
										if(villagep.get(i).getImage().getUrl().substring(73, 76).equals(playerList.get(n).getFarbe()) || villagep.get(i).getImage().getUrl().substring(73, 77).equals(playerList.get(n).getFarbe())
											|| villagep.get(i).getImage().getUrl().substring(73, 78).equals(playerList.get(n).getFarbe()) || villagep.get(i).getImage().getUrl().substring(73, 79).equals(playerList.get(n).getFarbe()))
										{
											if(villagep.get(i).getId() == id)
											{
												playerList.get(n).Stadt(1);
												punkte.get(i).setVillage(true);
												switch(zustand)
												{
												case 0:
														P1Ore.setText(playerList.get(n).getBrick() + "");
														P1Grain.setText(playerList.get(n).getWood() + "");
														villagep.get(i).setImage(redCity);
														break;
												case 1:
														P2Ore.setText(playerList.get(n).getBrick() + "");
														P2Grain.setText(playerList.get(n).getWood() + "");
														villagep.get(i).setImage(blueCity);
														break;
												case 2:
														P3Ore.setText(playerList.get(n).getBrick() + "");
														P3Grain.setText(playerList.get(n).getWood() + "");
														villagep.get(i).setImage(whiteCity);
														break;
												case 3:
														P4Ore.setText(playerList.get(n).getBrick() + "");
														P4Grain.setText(playerList.get(n).getWood() + "");
														villagep.get(i).setImage(orangeCity);
														break;
												}
											}
										}
										else
										{
											System.out.println("das ist nicht deine Siedlung");
										}
									}
									PsetGrain(n, playerList.get(n).getWool() + "");
									PsetOre(n, playerList.get(n).getOre() + "");
							}
							else
							{
								System.out.println("nicht genug Ressourcen für eine Stadt");
							}
					}
					else
					{
						System.out.println("nicht genug Ressourcen für ein Dorf oder eine Stadt!!");
					}
					
					switch(zustand)
					{
					case 0: 
						P1VP.setText("VP: " + playerList.get(n).getVP());
						break;
					case 1:
						P2VP.setText("VP: " + playerList.get(n).getVP());
						break;
					case 2:
						P3VP.setText("VP: " + playerList.get(n).getVP());
						break;
					case 3:
						P4VP.setText("VP: " + playerList.get(n).getVP());
						break;
					}
				}
			}
    	}
    	else
    	{
    		System.out.println("Spiel ist nicht gestartet");
    	}
	}
     
    public void BuyDevCard(ActionEvent e)
    {
    	if(start)
    	{
    		for(int i = 0; i < zustandList.size(); i++)
			{
				if(zustandList.get(i) == zustand)
				{
					if(playerList.get(i).DevCardControll() && DevCards.gibListe().size() > 0)
				    {
				    	DevCard add = DevCards.gibDevCard();
				    	playerList.get(i).DevCard(1);
				    	playerList.get(i).addDevCard(add);

						PsetWool(i, playerList.get(i).getWool() + "");
						PsetGrain(i, playerList.get(i).getGrain() + "");
						PsetOre(i, playerList.get(i).getOre() + "");
						
				    	String test = add.getCard();
					    switch(test) {
							 case "chapel":
							  chapel.setImage(chapelI);
						    break;
						  case "library":
							  library.setImage(libraryI);
						    break;
						  case "market":
							  market.setImage(marketI);
						    break;
						  case "monopoly":
							  monopoly.setImage(monopolyI);
						    break;
						  case "palace":
							  palace.setImage(palaceI);
						    break;
						  case "roadbuild":
							  roadbuild.setImage(roadbuildI);
						    break;
						  case "university":
							 university.setImage(universityI);
						    break;
						  case "yop":
							  yop.setImage(yopI);
						    break;
						  default:
						    // code block
						}
				    }
				    else
			    	{
			    		System.out.println("nicht genug Ressourcen für DevCards oder keine DevCards mehr");
			    	}
				}
			}
    	}
    	else
    	{
    		System.out.println("Spiel ist nicht gestartet");
    	}
    }
    
    public void yopWd()
    {
    	for(int i = 0; i < zustandList.size(); i++)
		{
			if(zustandList.get(i) == zustand)
			{
				playerList.get(i).addWood(1);
				PsetWood(i, playerList.get(i).getWood() + "");
			}
			yopNum = yopNum -1;
	    	if(yopNum <= 0)
	    	{
	    		yopText.setVisible(false);
		    	yopWd.setVisible(false);
				yopWl.setVisible(false);
				yopBr.setVisible(false);
				yopO.setVisible(false);
				yopG.setVisible(false);
	    	}
		}
    }
    public void yopWl()
    {
    	for(int i = 0; i < zustandList.size(); i++)
		{
			if(zustandList.get(i) == zustand)
			{
				playerList.get(i).addWool(1);
				PsetWool(i, playerList.get(i).getWool() + "");
			}
			yopNum = yopNum -1;
	    	if(yopNum <= 0)
	    	{
	    		yopText.setVisible(false);
		    	yopWd.setVisible(false);
				yopWl.setVisible(false);
				yopBr.setVisible(false);
				yopO.setVisible(false);
				yopG.setVisible(false);
	    	}
		}
    }
    public void yopG()
    {
    	for(int i = 0; i < zustandList.size(); i++)
		{
			if(zustandList.get(i) == zustand)
			{
				playerList.get(i).addGrain(1);
				PsetGrain(i, playerList.get(i).getGrain() + "");
			}
			yopNum = yopNum -1;
	    	if(yopNum <= 0)
	    	{
	    		yopText.setVisible(false);
		    	yopWd.setVisible(false);
				yopWl.setVisible(false);
				yopBr.setVisible(false);
				yopO.setVisible(false);
				yopG.setVisible(false);
	    	}
		}
    }
    public void yopBr()
    {
    	for(int i = 0; i < zustandList.size(); i++)
		{
			if(zustandList.get(i) == zustand)
			{
				playerList.get(i).addBrick(1);
				PsetBrick(i, playerList.get(i).getBrick() + "");
			}
			yopNum = yopNum -1;
	    	if(yopNum <= 0)
	    	{
	    		yopText.setVisible(false);
		    	yopWd.setVisible(false);
				yopWl.setVisible(false);
				yopBr.setVisible(false);
				yopO.setVisible(false);
				yopG.setVisible(false);
	    	}
		}
    }
    public void yopO()
    {
    	for(int i = 0; i < zustandList.size(); i++)
		{
			if(zustandList.get(i) == zustand)
			{
				playerList.get(i).addOre(1);
				PsetOre(i, playerList.get(i).getOre() + "");
			}
			yopNum = yopNum -1;
	    	if(yopNum <= 0)
	    	{
	    		yopText.setVisible(false);
		    	yopWd.setVisible(false);
				yopWl.setVisible(false);
				yopBr.setVisible(false);
				yopO.setVisible(false);
				yopG.setVisible(false);
	    	}
		}
    }
    
    public void entferneDevCard(MouseEvent e)
    {
    	if(start)
    	{
	    	final Node source = (Node) e.getSource();
			String id = source.getId();
			
			for(int n = 0; n < zustandList.size(); n++)
			{
				if(zustandList.get(n) == zustand)
				{
					switch(id) {
  				  case "chapel":
  					  chapel.setImage(black);
  					  for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "chapel")
  						  {
  							  playerList.get(n).cards.remove(i);
  							  playerList.get(n).VPPlus();
  							  P1VP.setText("VP: " + playerList.get(n).getVP());
  							  chapel.setImage(chapelB);
  						  }
  					  }
  				    break;
  				  case "library":
  					  library.setImage(black);
  					  for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "library")
  						  {
  							  playerList.get(n).cards.remove(i);
  							  playerList.get(n).VPPlus();
  							  P1VP.setText("VP: " + playerList.get(n).getVP());
  							  library.setImage(libraryB);
  						  }
  					  }
  				    break;
  				  case "market":
  					  market.setImage(black);
  					  for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "market")
  						  {
  							  playerList.get(n).cards.remove(i);
  							  playerList.get(n).VPPlus();
  							  P1VP.setText("VP: " + playerList.get(n).getVP());
  							  market.setImage(marketB);
  						  }
  					  }
    				    break;
  				  case "monopoly":
  					  monopoly.setImage(black);
  					  for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "monopoly")
  						  {
  							  playerList.get(n).cards.remove(i);
  							  playerList.get(n).VPPlus();
  							  P1VP.setText("VP: " + playerList.get(n).getVP());
  							  monopoly.setImage(monopolyB);
  						  }
  					  }
    				    break;
  				  case "palace":
  					  palace.setImage(black);
  					  for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "palace")
  						  {
  							  playerList.get(n).cards.remove(i);
  							  playerList.get(n).VPPlus();
  							  P1VP.setText("VP: " + playerList.get(n).getVP());
  							  palace.setImage(palaceB);
  						  }
  					  }
    				    break;
  				  case "roadbuild":
  					  roadbuild.setImage(black);
  					  for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "roadbuild")
  						  {
  							  playerList.get(n).cards.remove(i);
  							  playerList.get(n).setRoad(2);
  							  roadbuild.setImage(roadbuildB);
  						  }
  					  }
    				    break;
  				  case "university":
  					 university.setImage(black);
  					 for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "university")
  						  {
  							  playerList.get(n).cards.remove(i);
  							  playerList.get(n).VPPlus();
  							  P1VP.setText("VP: " + playerList.get(n).getVP());
  							  university.setImage(universityB);
  						  }
  					  }
    				    break;
  				  case "yop":
  					  yop.setImage(black);
  					  for(int i = 0; i < playerList.get(n).cards.size(); i++)
  					  {
  						  if(playerList.get(n).cards.get(i).getCard() == "yop")
  						  {
  							  yopNum++;
  							  yopNum++;
  							  yopText.setVisible(true);
  							  yopWd.setVisible(true);
  							  yopWl.setVisible(true);
  							  yopBr.setVisible(true);
  							  yopO.setVisible(true);
  							  yopG.setVisible(true);
  							  playerList.get(n).cards.remove(i);
  							  yop.setImage(yopB);
  						  }
  					  }
    				    break;
  				  default:
  				    // code block
					}
				}
			}
    	}
    	else
    	{
    		System.out.println("Spiel ist nicht gestartet");
    	}

    }
    
    public void setRäuber(MouseEvent e)
	{
    	if(start)
    	{
	    	final Node source = (Node) e.getSource();
			String id = source.getId();
			
			for(int n = 0; n < zustandList.size(); n++)
			{
				if(zustandList.get(n) == zustand)
				{
					if(playerList.get(n).getRobber() == 1)
					{
						for(int i = 0; i < 19; i++)
						{
							if(rob.get(i).getId().equals(id))
							{
								for(int m = 0; m < 19; m++)
								{
									go.get(m).setText("n" + go.get(m).getText());
								}
								go.get(i).setText("r" + go.get(i).getText().substring(1));
								
								
								
								punkte.get(0).setR1(NumF12.getText().substring(0, 1));
								punkte.get(0).setR2(NumF13.getText().substring(0, 1));
								punkte.get(1).setR1(NumF13.getText().substring(0, 1));
								punkte.get(2).setR1(NumF13.getText().substring(0, 1));
								punkte.get(2).setR2(NumF19.getText().substring(0, 1));
								punkte.get(3).setR1(NumF19.getText().substring(0, 1));
								punkte.get(4).setR1(NumF19.getText().substring(0, 1));
								punkte.get(5).setR1(NumF19.getText().substring(0, 1));
								punkte.get(5).setR2(NumF18.getText().substring(0, 1));
								punkte.get(6).setR1(NumF18.getText().substring(0, 1));
								punkte.get(7).setR1(NumF18.getText().substring(0, 1));
								punkte.get(7).setR2(NumF17.getText().substring(0, 1));
								punkte.get(8).setR1(NumF17.getText().substring(0, 1));
								punkte.get(9).setR1(NumF17.getText().substring(0, 1));
								punkte.get(10).setR1(NumF16.getText().substring(0, 1));
								punkte.get(10).setR2(NumF17.getText().substring(0, 1));
								punkte.get(11).setR1(NumF16.getText().substring(0, 1));
								punkte.get(12).setR1(NumF8.getText().substring(0, 1));
								punkte.get(12).setR1(NumF8.getText().substring(0, 1));
								punkte.get(13).setR1(NumF8.getText().substring(0, 1));
								punkte.get(14).setR1(NumF8.getText().substring(0, 1));
								punkte.get(15).setR1(NumF7.getText().substring(0, 1));
								punkte.get(15).setR2(NumF8.getText().substring(0, 1));
								punkte.get(16).setR1(NumF7.getText().substring(0, 1));
								punkte.get(17).setR1(NumF1.getText().substring(0, 1));
								punkte.get(17).setR2(NumF7.getText().substring(0, 1));
								punkte.get(18).setR1(NumF1.getText().substring(0, 1));
								punkte.get(19).setR1(NumF1.getText().substring(0, 1));
								punkte.get(20).setR1(NumF1.getText().substring(0, 1));
								punkte.get(20).setR2(NumF2.getText().substring(0, 1));
								punkte.get(21).setR1(NumF2.getText().substring(0, 1));
								punkte.get(22).setR1(NumF2.getText().substring(0, 1));
								punkte.get(22).setR2(NumF3.getText().substring(0, 1));
								punkte.get(23).setR1(NumF3.getText().substring(0, 1));
								punkte.get(24).setR1(NumF3.getText().substring(0, 1));
								punkte.get(25).setR1(NumF3.getText().substring(0, 1));
								punkte.get(25).setR2(NumF4.getText().substring(0, 1)); 
								punkte.get(26).setR1(NumF4.getText().substring(0, 1));
								punkte.get(27).setR1(NumF4.getText().substring(0, 1));
								punkte.get(27).setR2(NumF12.getText().substring(0, 1));
								punkte.get(28).setR1(NumF12.getText().substring(0, 1));
								punkte.get(29).setR1(NumF12.getText().substring(0, 1));
								punkte.get(30).setR1(NumF11.getText().substring(0, 1));
								punkte.get(30).setR2(NumF12.getText().substring(0, 1));
								punkte.get(30).setR3(NumF13.getText().substring(0, 1));
								punkte.get(31).setR1(NumF11.getText().substring(0, 1));
								punkte.get(31).setR2(NumF13.getText().substring(0, 1));
								punkte.get(31).setR3(NumF14.getText().substring(0, 1));
								punkte.get(32).setR1(NumF13.getText().substring(0, 1));
								punkte.get(32).setR2(NumF14.getText().substring(0, 1));
								punkte.get(32).setR3(NumF19.getText().substring(0, 1));
								punkte.get(33).setR1(NumF14.getText().substring(0, 1));
								punkte.get(33).setR2(NumF18.getText().substring(0, 1));
								punkte.get(33).setR3(NumF19.getText().substring(0, 1));
								punkte.get(34).setR1(NumF14.getText().substring(0, 1));
								punkte.get(34).setR2(NumF15.getText().substring(0, 1));
								punkte.get(34).setR3(NumF18.getText().substring(0, 1));
								punkte.get(35).setR1(NumF15.getText().substring(0, 1));
								punkte.get(35).setR2(NumF17.getText().substring(0, 1));
								punkte.get(35).setR3(NumF18.getText().substring(0, 1));
								punkte.get(36).setR1(NumF15.getText().substring(0, 1));
								punkte.get(36).setR2(NumF16.getText().substring(0, 1));
								punkte.get(36).setR3(NumF17.getText().substring(0, 1));
								punkte.get(37).setR1(NumF9.getText().substring(0, 1));
								punkte.get(37).setR2(NumF15.getText().substring(0, 1));
								punkte.get(37).setR3(NumF16.getText().substring(0, 1));
								punkte.get(38).setR1(NumF8.getText().substring(0, 1));
								punkte.get(38).setR2(NumF9.getText().substring(0, 1));
								punkte.get(38).setR3(NumF16.getText().substring(0, 1));
								punkte.get(39).setR1(NumF7.getText().substring(0, 1));
								punkte.get(39).setR2(NumF8.getText().substring(0, 1));
								punkte.get(39).setR3(NumF9.getText().substring(0, 1));
								punkte.get(40).setR1(NumF6.getText().substring(0, 1));
								punkte.get(40).setR2(NumF7.getText().substring(0, 1));
								punkte.get(40).setR3(NumF9.getText().substring(0, 1));
								punkte.get(41).setR1(NumF1.getText().substring(0, 1));
								punkte.get(41).setR2(NumF6.getText().substring(0, 1));
								punkte.get(41).setR3(NumF7.getText().substring(0, 1));
								punkte.get(42).setR1(NumF1.getText().substring(0, 1));
								punkte.get(42).setR2(NumF2.getText().substring(0, 1));
								punkte.get(42).setR3(NumF6.getText().substring(0, 1));
								punkte.get(43).setR1(NumF2.getText().substring(0, 1));
								punkte.get(43).setR2(NumF5.getText().substring(0, 1));
								punkte.get(43).setR3(NumF6.getText().substring(0, 1));
								punkte.get(44).setR1(NumF2.getText().substring(0, 1));
								punkte.get(44).setR2(NumF3.getText().substring(0, 1));
								punkte.get(44).setR3(NumF5.getText().substring(0, 1));
								punkte.get(45).setR1(NumF3.getText().substring(0, 1));
								punkte.get(45).setR2(NumF4.getText().substring(0, 1));
								punkte.get(45).setR3(NumF5.getText().substring(0, 1));
								punkte.get(46).setR1(NumF4.getText().substring(0, 1));
								punkte.get(46).setR2(NumF5.getText().substring(0, 1));
								punkte.get(46).setR3(NumF11.getText().substring(0, 1));
								punkte.get(47).setR1(NumF4.getText().substring(0, 1));
								punkte.get(47).setR2(NumF11.getText().substring(0, 1));
								punkte.get(47).setR3(NumF12.getText().substring(0, 1));
								punkte.get(48).setR2(NumF11.getText().substring(0, 1));
								punkte.get(48).setR3(NumF14.getText().substring(0, 1));
								punkte.get(49).setR2(NumF14.getText().substring(0, 1));
								punkte.get(49).setR3(NumF15.getText().substring(0, 1));
								punkte.get(50).setR1(NumF9.getText().substring(0, 1));
								punkte.get(50).setR3(NumF15.getText().substring(0, 1));
								punkte.get(51).setR1(NumF6.getText().substring(0, 1));
								punkte.get(51).setR2(NumF9.getText().substring(0, 1));
								punkte.get(52).setR1(NumF5.getText().substring(0, 1));
								punkte.get(52).setR2(NumF6.getText().substring(0, 1));
								punkte.get(53).setR1(NumF5.getText().substring(0, 1));
								punkte.get(53).setR3(NumF11.getText().substring(0, 1));
			
								
								
								R1.setFitHeight(17);
								R1.setFitWidth(16);
								R1.setImage(leer);
								
								R2.setFitHeight(17);
								R2.setFitWidth(16);
								R2.setImage(leer);
								  
								R3.setFitHeight(17);
								R3.setFitWidth(16);
								R3.setImage(leer);
								  
								R4.setFitHeight(17);
								R4.setFitWidth(16);
								R4.setImage(leer);
								  
								R5.setFitHeight(17);
								R5.setFitWidth(16);
								R5.setImage(leer);
								
								R6.setFitHeight(17);
								R6.setFitWidth(16);
								R6.setImage(leer);
								  
								R7.setFitHeight(17);
								R7.setFitWidth(16);
								R7.setImage(leer);
								  
								R8.setFitHeight(17);
								R8.setFitWidth(16);
								R8.setImage(leer);
								  
								R9.setFitHeight(17);
								R9.setFitWidth(16);
								R9.setImage(leer);
								  
								R10.setFitHeight(17);
								R10.setFitWidth(16);
								R10.setImage(leer);
								  
								R11.setFitHeight(17);
								R11.setFitWidth(16);
								R11.setImage(leer);
								  
								R12.setFitHeight(17);
								R12.setFitWidth(16);
								R12.setImage(leer);
								  
								R13.setFitHeight(17);
								R13.setFitWidth(16);
								R13.setImage(leer);
								  
								R14.setFitHeight(17);
								R14.setFitWidth(16);
								R14.setImage(leer);
								  
								R15.setFitHeight(17);
								R15.setFitWidth(16);
								R15.setImage(leer);
								  
								R16.setFitHeight(17);
								R16.setFitWidth(16);
								R16.setImage(leer);
								  
								R17.setFitHeight(17);
								R17.setFitWidth(16);
								R17.setImage(leer);
								  
								R18.setFitHeight(17);
								R18.setFitWidth(16);
								R18.setImage(leer);
								  
								R19.setFitHeight(17);
								R19.setFitWidth(16);
								R19.setImage(leer);
								
								rob.get(i).setFitHeight(38);
								rob.get(i).setFitWidth(33);
								rob.get(i).setImage(robber);
							}
						}
						playerList.get(n).takeRobber(1);
					}
					else
					{
						System.out.println("Es wurde keine 7 gewürfelt");
					}
				}
			}
    	}
    	else
    	{
    		System.out.println("Spiel ist nicht gestartet");
    	}

	}
    
    public void DiceShow(ActionEvent e)
    {
    	int Augenzahl;
    	if(start)
    	{
	        Dice dice = new Dice();
	        int roll1 = dice.DiceRoll();
	        int roll2 = dice.DiceRoll();
	        switch(roll1) {
	        case 1:
	        	Dice1.setImage(one);
	          break;
	        case 2:
	        	Dice1.setImage(two);
	          break;
	        case 3:
	        	Dice1.setImage(three);
	          break;
	        case 4:
	        	Dice1.setImage(four);
	          break;
	        case 5:
	        	Dice1.setImage(five);
	          break;
	        case 6:
	        	Dice1.setImage(six);
	          break;
	        default:
	          // code block
	        }
	        
	        switch(roll2) {
	        case 1:
	        	Dice2.setImage(one);
	          break;
	        case 2:
	        	Dice2.setImage(two);
	          break;
	        case 3:
	        	Dice2.setImage(three);
	          break;
	        case 4:
	        	Dice2.setImage(four);
	          break;
	        case 5:
	        	Dice2.setImage(five);
	          break;
	        case 6:
	        	Dice2.setImage(six);
	          break;
	        default:
	          // code block
	        }
	        
	        ArrayList<Integer> roll = new ArrayList<Integer>();
	        roll.add(2);
	        roll.add(3);
	        roll.add(4);
	        roll.add(5);
	        roll.add(6);
	        roll.add(8);
	        roll.add(9);
	        roll.add(10);
	        roll.add(11);
	        roll.add(12);
	        Augenzahl = roll1 + roll2;
	        
	        if(Augenzahl == 7)
	        {
	        	if(zustand == 0)
	        	{
	        		playerList.get(0).setRobber(1);
	        	}
	        	else if(zustand == 1)
	        	{
	        		playerList.get(1).setRobber(1);
	        	}
	        	else if(zustand == 2)
	        	{
	        		playerList.get(2).setRobber(1);
	        	}
	        	else if(zustand == 3)
	        	{
	        		playerList.get(3).setRobber(1);
	        	}
	        }
	        
	        ArrayList <String> colors = new ArrayList <String>();
	        colors.add("red");
	        colors.add("blue");
	        colors.add("white");
	        colors.add("orange");
	        
	        
	        for(int i = 0; i < 10; i++)
	        {
	        	if(roll.get(i) == Augenzahl)
	        	{
	        		for(int n = 0; n < 54; n++)
		    		  {
		    			  if(punkte.get(n).getAP1() == Augenzahl|| punkte.get(n).getAP2() == Augenzahl || punkte.get(n).getAP3() == Augenzahl)
		        		  {
		    				  if(punkte.get(n).getVillage())
		    				  {
		    					  for(int m = 0; m < 4; m++)
		    					  {
		    						  System.out.println(playerList.get(m).getFarbe());
		    							  if(punkte.get(n).getAP1() == Augenzahl)
			    						  {
			    							  if(punkte.get(n).getR1() != "r")
			    							  {
				    							  if(punkte.get(n).getSP1().equals("wd") && !punkte.get(n).getSP1().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
				    		    						  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addWood(1);
					    								  System.out.println("added 1 Wood to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
				    							  if(punkte.get(n).getSP1().equals("wl") && !punkte.get(n).getSP1().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
				    									  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addWool(1);
					    								  System.out.println("added 1 Wool to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
				    							  if(punkte.get(n).getSP1().equals("b") && !punkte.get(n).getSP1().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
					    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addBrick(1);
					    								  System.out.println("added 1 Brick to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
				    							  if(punkte.get(n).getSP1().equals("o") && !punkte.get(n).getSP1().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
					    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addOre(1);
					    								  System.out.println("added 1 Ore to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
				    							  if(punkte.get(n).getSP1().equals("g") && !punkte.get(n).getSP1().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addGrain(1);
					    								  System.out.println("added 1 Grain to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
			    							  }
			    						  }
			    						  if(punkte.get(n).getAP2() == Augenzahl)
			    						  {
			    							  if(punkte.get(n).getR2() != "r")
			    							  {
				    							  if(punkte.get(n).getSP2().equals("wd") && !punkte.get(n).getSP2().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
					    		    				      || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addWood(1);
				    									  System.out.println("added 1 Wood to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
				    							  if(punkte.get(n).getSP2().equals("wl") && !punkte.get(n).getSP2().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
					    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addWool(1);
				    									  System.out.println("added 1 Wool to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
				    							  if(punkte.get(n).getSP2().equals("b") && !punkte.get(n).getSP2().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addBrick(1);
						    								  System.out.println("added 1 Brick to P" + (m + 1) +  " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP2().equals("o") && !punkte.get(n).getSP2().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
				    								  {
				    									  playerList.get(m).addOre(1);
				    									  System.out.println("added 1 Ore to P" + (m + 1) +  " " + n);
				    								  }
				    							  }
				    							  if(punkte.get(n).getSP2().equals("g") && !punkte.get(n).getSP2().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addGrain(1);
						    								  System.out.println("added 1 Grain to P" + (m + 1) +  " " + n);
					    								  }
				    							  }
			    							  }
			    						  }
			    						  if(punkte.get(n).getAP3() == Augenzahl)
			    						  {
			    							  if(punkte.get(n).getR3() != "r")
			    							  {
				    							  if(punkte.get(n).getSP3().equals("wd") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    		    				      || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWood(1);
					    									  System.out.println("added 1 Wood to P" + (m + 1) +  " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("wl") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWool(1);
					    									  System.out.println("added 1 Wool to P" + (m + 1) +  " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("b") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addBrick(1);
						    								  System.out.println("added 1 Brick to P" + (m + 1) +  " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("o") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addOre(1);
					    									  System.out.println("added 1 Ore to P" + (m + 1) +  " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("g") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addGrain(1);
						    								  System.out.println("added 1 Grain to P" + (m + 1) + " " + n);
					    								  }
				    							  }
			    							  }
			    						  }
		    					  }
		    				  }
		    				  else if(punkte.get(n).getCity())
		    				  {
		    					  for(int m = 0; m < 4; m++)
		    					  {
		    							  if(punkte.get(n).getAP1() == Augenzahl)
			    						  {
			    							  if(punkte.get(n).getR1() != "r")
			    							  {
			    								  if(punkte.get(n).getSP3().equals("wd") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    		    				      || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWood(2);
					    									  System.out.println("added 1 Wood to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("wl") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWool(2);
					    									  System.out.println("added 1 Wool to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("b") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addBrick(2);
						    								  System.out.println("added 1 Brick to P" + m +" " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("o") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addOre(2);
					    									  System.out.println("added 1 Ore to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("g") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addGrain(2);
						    								  System.out.println("added 1 Grain to P1" + m + " " + n);
					    								  }
				    							  }
			    							  }
			    						  }
			    						  if(punkte.get(n).getAP2() == Augenzahl)
			    						  {
			    							  if(punkte.get(n).getR2() != "r")
			    							  {
			    								  if(punkte.get(n).getSP3().equals("wd") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    		    				      || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWood(2);
					    									  System.out.println("added 1 Wood to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("wl") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWool(2);
					    									  System.out.println("added 1 Wool to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("b") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addBrick(2);
						    								  System.out.println("added 1 Brick to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("o") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addOre(2);
					    									  System.out.println("added 1 Ore to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("g") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addGrain(2);
						    								  System.out.println("added 1 Grain to P" + m + " " + n);
					    								  }
				    							  }
			    							  }
			    						  }
			    						  if(punkte.get(n).getAP3() == Augenzahl)
			    						  {
			    							  if(punkte.get(n).getR3() != "r")
			    							  {
			    								  if(punkte.get(n).getSP3().equals("wd") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    		    				      || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWood(2);
					    									  System.out.println("added 1 Wood to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("wl") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addWool(2);
					    									  System.out.println("added 1 Wool to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("b") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
						    								  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addBrick(2);
						    								  System.out.println("added 1 Brick to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("o") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addOre(2);
					    									  System.out.println("added 1 Ore to P" + m + " " + n);
					    								  }
				    							  }
				    							  if(punkte.get(n).getSP3().equals("g") && !punkte.get(n).getSP3().equals(null))
				    							  {
				    								  if(villagep.get(n).getImage().getUrl().substring(73, 76).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 77).equals(playerList.get(m).getFarbe())
							    							  || villagep.get(n).getImage().getUrl().substring(73, 78).equals(playerList.get(m).getFarbe()) || villagep.get(n).getImage().getUrl().substring(73, 79).equals(playerList.get(m).getFarbe()))
					    								  {
					    									  playerList.get(m).addGrain(2);
						    								  System.out.println("added 1 Grain to P" + m + " " + n);
					    								  }
				    							  }
			    							  }
			    						  }
		    					  }
		    				  }
		        		  }
		    		  }
	        	}
	        }
	        for(int j = 0; j < 4; j++)
	        {
		        PsetBrick(j + 1, playerList.get(j).getBrick() + "");
				PsetWood(j + 1, playerList.get(j).getWood() + "");
				PsetWool(j + 1, playerList.get(j).getWool() + "");
				PsetOre(j + 1, playerList.get(j).getOre() + "");
				PsetGrain(j + 1, playerList.get(j).getGrain() + "");
	        }
    	}
    	else
    	{
    		System.out.println("Spiel ist nicht gestartet");
    	}
    }
}