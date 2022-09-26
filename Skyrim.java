import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javax.imageio.ImageIO;
import java.io.IOException;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import java.lang.*;
import javafx.scene.media.*;


public class Skyrim extends Application
{
	private String LocationX = "";
	private String LocationY = "";
	private File Locations = new File("PathLocations.txt");
	private File NPCS = new File("NPCRace.txt");
	private File Items = new File("Items.txt");
	private File Professions = new File("Professions.txt");
	private File Relations = new File("Relations.txt");
	private File RewardDesc = new File("RewardDesc.txt");
	private File Rewards = new File("Rewards.txt");
	private File AbandonedPaths = new File("AbandonedPaths.txt");
	private File DensePaths = new File("DensePaths.txt");
	private File HauntedPaths = new File("HauntedPaths.txt");
	private File MistyPaths = new File("MistyPaths.txt");
	private File AbandonedRooms = new File("AbandonedRooms.txt");
	private File DenseRooms = new File("DenseRooms.txt");
	private File HauntedRooms = new File("HauntedRooms.txt");
	private File MistyRooms = new File("MistyRooms.txt");
	private Button Button1;
	private Button Button2;
	private Image Attackimg = new Image("file:ActionBar/Attack.png");
	private Image Spellimg = new Image("file:ActionBar/Spell.png");
	private Image Shoutimg = new Image("file:ActionBar/Shout.png");
	private Image Runimg = new Image("file:ActionBar/Run.png");
	private ImageView Attackview;
	private ImageView Spellview;
	private ImageView Shoutview;
	private ImageView Runview;
	private Button Attack;
	private Button Spell;
	private Button Shout;
	private Button Run;
	private Group Attackb;
	private Group Spellb;
	private Group Shoutb;
	private Group Runb;
	private ImageView Image = new ImageView();
	private ArrayList<String> LocationText = new ArrayList<String>();
	private ArrayList<String> NPCRacePicker = new ArrayList<String>();
	private ArrayList<String> ItemPicker = new ArrayList<String>();
	private ArrayList<String> ProfessionPicker = new ArrayList<String>();
	private ArrayList<String> RelationPicker = new ArrayList<String>();
	private ArrayList<String> RewardDescPicker = new ArrayList<String>();
	private ArrayList<String> RewardPicker = new ArrayList<String>();
	private ArrayList<String> AbandonedPathsPicker = new ArrayList<String>();
	private ArrayList<String> DensePathsPicker = new ArrayList<String>();
	private ArrayList<String> HauntedPathsPicker = new ArrayList<String>();
	private ArrayList<String> MistyPathsPicker = new ArrayList<String>();
	private ArrayList<String> AbandonedRoomsPicker = new ArrayList<String>();
	private ArrayList<String> DenseRoomsPicker = new ArrayList<String>();
	private ArrayList<String> HauntedRoomsPicker = new ArrayList<String>();
	private ArrayList<String> MistyRoomsPicker = new ArrayList<String>();
	private Label Text = new Label();
	private Label Stats = new Label();
	private String Loc1 = "";
	private String Loc2 = "";
	private String Dungeon = "";
	public Stage primaryStage;
	private Image AltmerIMG = new Image("file:NPC/Altmer.png");
	private Image ArgonianIMG = new Image("file:NPC/Argonian.png");
	private Image BretonIMG = new Image("file:NPC/Breton.png");
	private Image DarkElfIMG = new Image("file:NPC/DarkElf.png");
	private Image ImperialIMG = new Image("file:NPC/Imperial.png");
	private Image KhajiitIMG = new Image("file:NPC/Khajiit.png");
	private Image NordIMG = new Image("file:NPC/Nord.png");
	private Image OrcIMG = new Image("file:NPC/Orc.png");
	private Image RedguardIMG = new Image("file:NPC/Redguard.png");
	private Image WoodElfIMG = new Image("file:NPC/WoodElf.png");
	private Image DenseForestIMG = new Image("file:Dungeons/DenseForest.png");
	private Image HauntedCaveIMG = new Image("file:Dungeons/HauntedCave.jpg");
	private Image MistyMountainIMG = new Image("file:Dungeons/MistyMountain.png");
	private Image AbandonedFortIMG = new Image("file:Dungeons/AbandonedFort.gif");
	private String dungeonmem;
	private String moosic = "Soundtrack.mp3";
	private Media song = new Media(new File(moosic).toURI().toString());
	private MediaPlayer mediaplayer = new MediaPlayer(song);
	private int Health = 20;
	private int Armor = 0;
	private int EnemyHealth = 10;
	private int EnemyArmor = 0;
	private int EnemyBossHealth = 10;
	private int EnemyBossArmor = 0;
	private int TotalBossEnemyHealth = 15;
	private int TotalBossEnemyArmor = 5;
	private int TotalHealth = 20;
	private int TotalArmor = 0;
	private int Mana = 20;
	private int TotalMana = 20;
	private int TotalEnemyHealth = 10;
	private int TotalEnemyArmor = 0;
	private int StaticHealth = 20;
	private int StaticArmor = 0;
	private int StaticEnemyHealth = 10;
	private int StaticEnemyArmor = 0;
	private int StaticEnemyBossHealth = 10;
	private int StaticEnemyBossArmor = 0;
	private int StaticTotalBossEnemyHealth = 15;
	private int StaticTotalBossEnemyArmor = 5;
	private int StaticTotalHealth = 20;
	private int StaticTotalArmor = 0;
	private int StaticMana = 20;
	private int StaticTotalEnemyHealth = 10;
	private int StaticTotalEnemyArmor = 0;
	private int EnemyCount = 0;
	private int BossCount = 0;

	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public static int rng(int num)
	{
		Random rand = new Random();
		int number = rand.nextInt(num);
		return number;
	}
	
	private String ButtonLabel1;
	private String ButtonLabel2;
	private String LocationText1;
	private String LocationText2;
	private String NPCText;
	private String NPCTextF;
	private String Enemy;
	private String ItemText;
	private String ProfessionText;
	private String AbandonedPathName;
	private String AbandonedPathName2;
	private String AbandonedRoomText;
	private String DensePathName;
	private String DensePathName2;
	private String DenseRoomText;
	private String HauntedPathName;
	private String HauntedPathName2;
	private String HauntedRoomText;
	private String MistyPathName;
	private String MistyPathName2;
	private String MistyRoomText;
	private int rngfixer = rng(3);
	public void whilesandstuff() throws IOException
	{ 
	  Scanner AbandonedPathFile = new Scanner(AbandonedPaths);
	  while(AbandonedPathFile.hasNext())
					{
						String AbanPath = AbandonedPathFile.nextLine();
						AbandonedPathsPicker.add(AbanPath);
						String AbanPath2 = AbandonedPathFile.nextLine();
						AbandonedPathsPicker.add(AbanPath2);
					}
	  
	  Scanner DensePathFile = new Scanner(DensePaths);
	  while(DensePathFile.hasNext())
					{
						String DenPath = DensePathFile.nextLine();
						DensePathsPicker.add(DenPath);
						String DenPath2 = DensePathFile.nextLine();
						DensePathsPicker.add(DenPath2);
					}
					
	  DensePathName = DensePathsPicker.get(rng(30));
	  DensePathName2 = DensePathsPicker.get(rng(30));
	  DensePathFile.close();
	
	  Scanner HauntedPathFile = new Scanner(HauntedPaths);
	  while(HauntedPathFile.hasNext())
					{
						String HauPath = HauntedPathFile.nextLine();
						HauntedPathsPicker.add(HauPath);
						String HauPath2 = HauntedPathFile.nextLine();
						HauntedPathsPicker.add(HauPath2);
					}
					
	  HauntedPathName = HauntedPathsPicker.get(rng(30));
	  HauntedPathName2 = HauntedPathsPicker.get(rng(30));
	  HauntedPathFile.close();
	
	  Scanner MistyPathFile = new Scanner(MistyPaths);
	  while(MistyPathFile.hasNext())
					{
						String MisPath = MistyPathFile.nextLine();
						MistyPathsPicker.add(MisPath);
						String MisPath2 = MistyPathFile.nextLine();
						MistyPathsPicker.add(MisPath2);
					}
					
	  MistyPathName = MistyPathsPicker.get(rng(30));
	  MistyPathName2 = MistyPathsPicker.get(rng(30));
	  MistyPathFile.close();
	  
	  Scanner AbandonedRoomFile = new Scanner(AbandonedRooms);
	  while(AbandonedRoomFile.hasNext())
					{
						String AbanRoom = AbandonedRoomFile.nextLine();
						AbandonedRoomsPicker.add(AbanRoom);
					}
					
	  AbandonedRoomText = AbandonedRoomsPicker.get(rng(12));
	  AbandonedRoomFile.close();
	  
	  Scanner DenseRoomFile = new Scanner(DenseRooms);
	  while(DenseRoomFile.hasNext())
					{
						String DenRoom = DenseRoomFile.nextLine();
						DenseRoomsPicker.add(DenRoom);
					}
					
	  DenseRoomText = DenseRoomsPicker.get(rng(10));
	  DenseRoomFile.close();
	  
	  Scanner HauntedRoomFile = new Scanner(HauntedRooms);
	  while(HauntedRoomFile.hasNext())
					{
						String HaunRoom = HauntedRoomFile.nextLine();
						ProfessionPicker.add(HaunRoom);
					}
					
	  HauntedRoomText = ProfessionPicker.get(rng(9));
	  HauntedRoomFile.close();
	
	  Scanner MistyRoomFile = new Scanner(MistyRooms);
	  while(MistyRoomFile.hasNext())
					{
						String MisRoom = MistyRoomFile.nextLine();
						ProfessionPicker.add(MisRoom);
					}
					
	  MistyRoomText = ProfessionPicker.get(rng(15));
	  MistyRoomFile.close();
	
	  Scanner ProfessionFile = new Scanner(Professions);
	  while(ProfessionFile.hasNext())
					{
						String Profession = ProfessionFile.nextLine();
						ProfessionPicker.add(Profession);
					}
					
	  ProfessionText = ProfessionPicker.get(rng(32));
	  ProfessionFile.close();
	  
	  Scanner ItemFile = new Scanner(Items);
	  while(ItemFile.hasNext())
					{
						String Item = ItemFile.nextLine();
						ItemPicker.add(Item);
					}
					
	  ItemText = ItemPicker.get(rng(41));
	  ItemFile.close();
	  
	  Scanner NPCFile = new Scanner(NPCS);
	  while(NPCFile.hasNext())
					{
						String NPC = NPCFile.nextLine();
						String NPCF = NPCFile.nextLine();
						NPCRacePicker.add(NPC);
						NPCRacePicker.add(NPCF);
					}
					
	  NPCText = NPCRacePicker.get(rng(10));
	  NPCTextF = NPCRacePicker.get(rng(10));
	  NPCFile.close();
	  Scanner LocationFile = new Scanner(Locations);
	  while(LocationFile.hasNext())
		{
			LocationX = LocationFile.nextLine();
			LocationY = LocationFile.nextLine();
			LocationText.add(LocationX);
			LocationText.add(LocationY);
		}
		 LocationFile.close();
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException
	{	
	  mediaplayer.play();
	  Image Fork = new Image("File:Crossroads.PNG");
	  Attackview = new ImageView(Attackimg);
	  Spellview = new ImageView(Spellimg);
	  Shoutview = new ImageView(Shoutimg);
	  Runview = new ImageView(Runimg);
	  Attackview.setFitHeight(80);
      Attackview.setPreserveRatio(true);
	  Spellview.setFitHeight(80);
      Spellview.setPreserveRatio(true);
	  Shoutview.setFitHeight(80);
      Shoutview.setPreserveRatio(true);
	  Runview.setFitHeight(80);
      Runview.setPreserveRatio(true);
	  Attack = new Button();
	  Spell = new Button();
	  Shout = new Button();
	  Run = new Button();
	  Attackb = new Group(Attack);
	  Spellb = new Group(Spell);
	  Shoutb = new Group(Shout);
	  Runb = new Group(Run);
	  Attack.setGraphic(Attackview);
	  Spell.setGraphic(Spellview);
	  Shout.setGraphic(Shoutview);
	  Run.setGraphic(Runview);
	  Image.setImage(Fork);
	  Image.setFitHeight(250);
      Image.setPreserveRatio(true);
	  whilesandstuff();
	  Font myFontloadBalgruf = Font.loadFont(getClass().getResourceAsStream("/font/Balgruf.ttf"), 17);
	  LocationText1 = LocationText.get(rng(14));
	  LocationText2 = LocationText.get(rng(14));
	  ButtonLabel1 = LocationText1;
	  ButtonLabel2 = LocationText2;
	  Button1 = new Button(ButtonLabel1);
	  Button1.setOnAction(new LandmarkPick1());
	  Button2 = new Button(ButtonLabel2);
	  Button2.setOnAction(new LandmarkPick2());
	  String TravelText = "You're at a crossroads between " + LocationText1 + " and " + LocationText2;
	  Text.setText(TravelText);
	  Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
	  HBox ActionBar = new HBox(10, Attackb, Spellb, Shoutb, Runb);
	  VBox TextBar = new VBox(10, Text);
	  VBox TaskBar = new VBox(10, Stats);
	  HBox Stage = new HBox(10, Button1, Image, Button2);
	  Stage.setAlignment(Pos.CENTER);
	  TextBar.setAlignment(Pos.CENTER);
	  ActionBar.setAlignment(Pos.CENTER);
	  BorderPane borderpane = new BorderPane();
	  borderpane.setBottom(ActionBar);
	  borderpane.setLeft(TaskBar);
	  borderpane.setCenter(Stage);
	  borderpane.setTop(TextBar);
	  borderpane.setStyle("-fx-background-color: BLACK;"); 
	  Button1.setFont(myFontloadBalgruf);
	  Button2.setFont(myFontloadBalgruf);
	  Text.setFont(myFontloadBalgruf);
	  Text.setTextFill(Color.WHITE);
	  Text.setWrapText(true);
	  Text.setTextAlignment(TextAlignment.CENTER);
	  Stats.setFont(myFontloadBalgruf);
	  Stats.setTextFill(Color.WHITE);
	  Stats.setWrapText(true);
	  Stats.setMaxWidth(128);
      Scene scene = new Scene(borderpane, 500, 300);
	  primaryStage.getIcons().add(new Image("file:Logo.JPG"));
	  primaryStage.setMaximized(true);
      primaryStage.setTitle("Skyrim Very Special Edition");
      primaryStage.setScene(scene);
      primaryStage.show();
	}
	
	class GO implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Health = 20;
			Armor = 0;
		    EnemyHealth = 10;
			EnemyArmor = 0;
			EnemyBossHealth = 10;
			EnemyBossArmor = 0;
			TotalBossEnemyHealth = 15;
			TotalBossEnemyArmor = 5;
			TotalHealth = 20;
			TotalArmor = 0;
			Mana = 20;
			TotalMana = 20;
			TotalEnemyHealth = 10;
			TotalEnemyArmor = 0;
			StaticHealth = 20;
			StaticArmor = 0;
			StaticEnemyHealth = 10;
			StaticEnemyArmor = 0;
			StaticEnemyBossHealth = 10;
			StaticEnemyBossArmor = 0;
			StaticTotalBossEnemyHealth = 15;
			StaticTotalBossEnemyArmor = 5;
			StaticTotalHealth = 20;
			StaticTotalArmor = 0;
			StaticMana = 20;
			StaticTotalEnemyHealth = 10;
			StaticTotalEnemyArmor = 0;
			EnemyCount = 0;
			BossCount = 0;
			Stats.setText("Health:  " + TotalHealth +
			" Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
			LocationText1 = LocationText.get(rng(14));
			LocationText2 = LocationText.get(rng(14));
			Button1.setText(LocationText1);
			Button2.setText(LocationText2);
			Button1.setOnAction(new LandmarkPick1());
			Button2.setOnAction(new LandmarkPick2());
			String TravelText = "You're at a crossroads between " + LocationText1 + " and " + LocationText2;
			Text.setText(TravelText);
			Image Fork = new Image("File:Crossroads.PNG");
			Image.setImage(Fork);
			Image.setFitHeight(250);
			Image.setPreserveRatio(true);
		}
	}
	
	class restart implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Stats.setText("Health:  " + TotalHealth +
			" Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
			LocationText1 = LocationText.get(rng(14));
			LocationText2 = LocationText.get(rng(14));
			Button1.setText(LocationText1);
			Button2.setText(LocationText2);
			Button1.setOnAction(new LandmarkPick1());
			Button2.setOnAction(new LandmarkPick2());
			String TravelText = "You're at a crossroads between " + LocationText1 + " and " + LocationText2;
			Text.setText(TravelText);
			Image Fork = new Image("File:Crossroads.PNG");
			Image.setImage(Fork);
			Image.setFitHeight(250);
			Image.setPreserveRatio(true);
		}
	}
	private String StaticLoc = LocationText1;
	class LandmarkPick1 implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Stats.setText("Health:  " + TotalHealth +
					" Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
			if(NPCText.equals("Altmer"))
			{
				Image.setImage(AltmerIMG);
			}
			if(NPCText.equals("Argonian"))
			{
				Image.setImage(ArgonianIMG);
			}
			if(NPCText.equals("Breton"))
			{
				Image.setImage(BretonIMG);
			}
			if(NPCText.equals("Dark Elf"))
			{
				Image.setImage(DarkElfIMG);
			}
			if(NPCText.equals("Imperial"))
			{
				Image.setImage(ImperialIMG);
			}
			if(NPCText.equals("Khajiit"))
			{
				Image.setImage(KhajiitIMG);
			}
			if(NPCText.equals("Nord"))
			{
				Image.setImage(NordIMG);
			}
			if(NPCText.equals("Orc"))
			{
				Image.setImage(OrcIMG);
			}
			if(NPCText.equals("Redguard"))
			{
				Image.setImage(RedguardIMG);
			}
			if(NPCText.equals("Wood Elf"))
			{
				Image.setImage(WoodElfIMG);
			}
			
			String DungeonName = "";
			String DungeonTRandomizerLocation = ""; //because this one had to be so special
			String Pronoun = "";
			String Gender = "";
			if(rngfixer == 0)
			{
				DungeonName = "Abandoned Fort";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "cave";
			}
			if(rngfixer == 1)
			{
				DungeonName = "Dense Forest";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "forest";
			}
			if(rngfixer == 2)
			{
				DungeonName = "Haunted Cave";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "mountain pass";
			}
			if(rngfixer == 3)
			{
				DungeonName = "Misty Mountain";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "ruined fort";
			}
			if(rng(1) == 0)
			{
				Gender = "he";
				Pronoun = "his";
			}
			if(rng(1) == 1)
			{
				Gender = "she";
				Pronoun = "her";
			}
			
				String RelationT = "Once at the " + LocationText1 + " a " + NPCText + " greets you." + Gender + " looks quite sad. " + Gender + " tells you " + Pronoun + " " + NPCTextF + " was killed by a mysterious evil in a " +DungeonName + ". Will you avenge " + Pronoun + " " + NPCTextF + "?";
				String DungeonT = "Once at the " + LocationText1 + ", a " + NPCText + " greets you. " + Gender + " tells you of the terrible evil lurking in a nearby " + DungeonTRandomizerLocation + " that has been terrorizing the " + LocationText1 + ". Will you lend your spell and steel to " + Pronoun + " cause?";
				String RItemT = "At the " + LocationText1 + ", a " + NPCText + " greets you. " + Gender + " desperately needs you to retrieve a " + ItemText + " from a " + DungeonName + ". Will you help the " + NPCText + "?";
				String RLostItemT = "You meet a " + NPCText + " at the +  " +LocationText1 + ". " + Gender + "'s lost an item of great sentimental value— a " + ItemText + ". " + Gender + " begs you to retrieve it for  "+ Pronoun + " . Will you lend your aid to this desperate " + " " + ProfessionText + "?";
				
			if(rngfixer == 0)
			{
				Text.setText(RelationT);
			}
			
			if(rngfixer == 1)
			{
				Text.setText(DungeonT);
			}
			
			if(rngfixer == 2)
			{
				Text.setText(RItemT);
			}
			
			if(rngfixer == 3)
			{
				Text.setText(RLostItemT);
			}
			
			Image.setFitHeight(400);
			Image.setPreserveRatio(true);
			Button1.setText("Yes");
			Button2.setText("No");
			Button1.setOnAction(new DungeonClass());
			Button2.setOnAction(new restart());
		}
	}
	
	
	private String StaticLoc2 = LocationText2;
	class LandmarkPick2 implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Stats.setText("Health:  " + TotalHealth +
					" Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
			if(NPCText.equals("Altmer"))
			{
				Image.setImage(AltmerIMG);
			}
			if(NPCText.equals("Argonian"))
			{
				Image.setImage(ArgonianIMG);
			}
			if(NPCText.equals("Breton"))
			{
				Image.setImage(BretonIMG);
			}
			if(NPCText.equals("Dark Elf"))
			{
				Image.setImage(DarkElfIMG);
			}
			if(NPCText.equals("Imperial"))
			{
				Image.setImage(ImperialIMG);
			}
			if(NPCText.equals("Khajiit"))
			{
				Image.setImage(KhajiitIMG);
			}
			if(NPCText.equals("Nord"))
			{
				Image.setImage(NordIMG);
			}
			if(NPCText.equals("Orc"))
			{
				Image.setImage(OrcIMG);
			}
			if(NPCText.equals("Redguard"))
			{
				Image.setImage(RedguardIMG);
			}
			if(NPCText.equals("Wood Elf"))
			{
				Image.setImage(WoodElfIMG);
			}
			String DungeonName = "";
			String DungeonTRandomizerLocation = ""; //because this one had to be so special
			String Pronoun = "";
			String Gender = "";
			if(rngfixer == 0)
			{
				DungeonName = "Abandoned Fort";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "cave";
			}
			if(rngfixer == 1)
			{
				DungeonName = "Dense Forest";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "forest";
			}
			if(rngfixer == 2)
			{
				DungeonName = "Haunted Cave";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "mountain pass";
			}
			if(rngfixer == 3)
			{
				DungeonName = "Misty Mountain";
				dungeonmem = DungeonName;
				DungeonTRandomizerLocation = "ruined fort";
			}
			if(rng(1) == 0)
			{
				Gender = "he";
				Pronoun = "his";
			}
			if(rng(1) == 1)
			{
				Gender = "she";
				Pronoun = "her";
			}
				
				String RelationT = "Once at the " + LocationText2 + " a " + NPCText + " greets you." + Gender + " looks quite sad. " + Gender + " tells you " + Pronoun + " " + NPCTextF + " was killed by a mysterious evil in a " +DungeonName + ". Will you avenge " + Pronoun + " " + NPCTextF + "?";
				String DungeonT = "Once at the " + LocationText2 + ", a " + NPCText + " greets you. " + Gender + " tells you of the terrible evil lurking in a nearby " + DungeonTRandomizerLocation + " that has been terrorizing the " + LocationText2 + ". Will you lend your spell and steel to " + Pronoun + " cause?";
				String RItemT = "At the " + LocationText2 + ", a " + NPCText + " greets you. " + Gender + " desperately needs you to retrieve a " + ItemText + " from a " + DungeonName + ". Will you help the " + NPCText + "?";
				String RLostItemT = "You meet a " + NPCText + " at the +  " +LocationText2 + ". " + Gender + "'s lost an item of great sentimental value— a " + ItemText + ". " + Gender + " begs you to retrieve it for  "+ Pronoun + " . Will you lend your aid to this desperate " + " " + ProfessionText + "?";
			if(rngfixer == 0)
			{
				Text.setText(RelationT);
			}
			
			if(rngfixer == 1)
			{
				Text.setText(DungeonT);
			}
			
			if(rngfixer == 2)
			{
				Text.setText(RItemT);
			}
			
			if(rngfixer == 3)
			{
				Text.setText(RLostItemT);
			}

			Image.setFitHeight(400);
			Image.setPreserveRatio(true);
			Button1.setText("Yes");
			Button2.setText("No");
			Button1.setOnAction(new DungeonClass());
			Button2.setOnAction(new restart());
		}
	}
	private String dungeonentertext ="You arrive at your first dungeon. As the mighty Dovahkiin you obviously already know that you can use your weapon, cast spell, or shout to battle your enemies. And, seeing as how you're Skyrim's chosen one, you certainly will never ever need to ask to flee when facing an enemy too powerful for you. Nope, a powerful warrior like you won't ever need to flee. Or even take enough damage to ask, what is my health? Will you continue?.";
	private int dungeontextcount = 0;
    class DungeonClass implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Stats.setText("Health:  " + TotalHealth +
					" Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
			if(dungeontextcount == 0)
			{
				Text.setText(dungeonentertext);
				dungeontextcount++;
			}
			else
			{
				Text.setText("Will you enter the dungeon?");
			}
			
			if(dungeonmem.equals("Abandoned Fort"))
			{
				Image.setImage(AbandonedFortIMG);
			}
			if(dungeonmem.equals("Dense Forest"))
			{
				Image.setImage(DenseForestIMG);
			}
			if(dungeonmem.equals("Haunted Cave"))
			{
				Image.setImage(HauntedCaveIMG);
			}
			if(dungeonmem.equals("Misty Mountain"))
			{
				Image.setImage(AbandonedFortIMG);
			}
			Button1.setOnAction(new EnterTheDungeon());
		}
	}
	
    class EnterTheDungeon implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			if(dungeonmem.equals("Abandoned Fort"))
			{
				Image.setImage(AbandonedFortIMG);
			}
			if(dungeonmem.equals("Dense Forest"))
			{
				Image.setImage(DenseForestIMG);
			}
			if(dungeonmem.equals("Haunted Cave"))
			{
				Image.setImage(HauntedCaveIMG);
			}
			if(dungeonmem.equals("Misty Mountain"))
			{
				Image.setImage(AbandonedFortIMG);
			}
			
				  AbandonedPathName = AbandonedPathsPicker.get(rng(30));
			   	  AbandonedPathName2 = AbandonedPathsPicker.get(rng(30));
	  
			if(dungeonmem.equals("Abandoned Fort"))
			{
				Text.setText("There are two ways forward: " + AbandonedPathName + " and a " +  AbandonedPathName2+". Which do you choose?");
				Button1.setText(AbandonedPathName);
				Button2.setText(AbandonedPathName2);
			}
			if(dungeonmem.equals("Dense Forest"))
			{
				Text.setText("There are two ways forward: " + DensePathName + " and a " +  DensePathName2+". Which do you choose?");
				Button1.setText(DensePathName);
				Button2.setText(DensePathName2);
			}
			if(dungeonmem.equals("Haunted Cave"))
			{
				Text.setText("There are two ways forward: " + HauntedPathName + " and a " +  HauntedPathName2+". Which do you choose?");
				Button1.setText(HauntedPathName);
				Button2.setText(HauntedPathName2);
			}
			if(dungeonmem.equals("Misty Mountain"))
			{
				Text.setText("There are two ways forward: " + MistyPathName + " and a " +  MistyPathName2+". Which do you choose?");
				Button1.setText(MistyPathName);
				Button2.setText(MistyPathName2);
			}
			Enemy = NPCRacePicker.get(rng(10));
			Button1.setOnAction(new Combat());
			Button2.setOnAction(new Combat());
		}
	class Combat implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Attack.setOnAction(new Attack());
			Spell.setOnAction(new Spell());
			Shout.setOnAction(new Shout());
			Run.setOnAction(new Run());
			Button1.setOnAction(new none());
			Button2.setOnAction(new none());
		if(EnemyCount == 3)
		{
			if(Enemy.equals("Altmer"))
			{
				Image.setImage(AltmerIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Argonian"))
			{
				Image.setImage(ArgonianIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Breton"))
			{
				Image.setImage(BretonIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Dark Elf"))
			{
				Image.setImage(DarkElfIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Imperial"))
			{
				Image.setImage(ImperialIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Khajiit"))
			{
				Image.setImage(KhajiitIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Nord"))
			{
				Image.setImage(NordIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Orc"))
			{
				Image.setImage(OrcIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Redguard"))
			{
				Image.setImage(RedguardIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			if(Enemy.equals("Wood Elf"))
			{
				Image.setImage(WoodElfIMG);
				Text.setText("A wild boss "+ Enemy + " appears.");
				BossCount++;
			}
			Button1.setText("Enemy Health: " + TotalBossEnemyHealth);
			Button2.setText("Enemy Armor: " + TotalBossEnemyArmor);
		}
		if(EnemyCount < 3)
		{
			if(Enemy.equals("Altmer"))
			{
				Image.setImage(AltmerIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Argonian"))
			{
				Image.setImage(ArgonianIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Breton"))
			{
				Image.setImage(BretonIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Dark Elf"))
			{
				Image.setImage(DarkElfIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Imperial"))
			{
				Image.setImage(ImperialIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Khajiit"))
			{
				Image.setImage(KhajiitIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Nord"))
			{
				Image.setImage(NordIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Orc"))
			{
				Image.setImage(OrcIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Redguard"))
			{
				Image.setImage(RedguardIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			if(Enemy.equals("Wood Elf"))
			{
				Image.setImage(WoodElfIMG);
				Text.setText("A wild "+ Enemy + " appears.");
			}
			Button1.setText("Enemy Health: " + TotalEnemyHealth);
			Button2.setText("Enemy Armor: " + TotalEnemyArmor);
		}
	}
}
	class none implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{

		}
	}
	private int mod = 0;
	class Attack implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Text.setText("You slash at the " + Enemy);
			int Dice = rng(6);
			Attack.setOnAction(new Attack());
			Spell.setOnAction(new Spell());
			Shout.setOnAction(new Shout());
			Run.setOnAction(new Run());
			Button1.setOnAction(new none());
			Button2.setOnAction(new none());
			if(Dice == 0)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 2;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 2;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 1)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 3;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 3;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 2)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 5;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 5;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 3)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 5;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 5;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 4)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 6;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 6;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 5)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 7;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 7;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}	
		}
	}
	class Spell implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Text.setText("You cast a fireball at the " + Enemy);
			int Dice = rng(6);
			Attack.setOnAction(new Attack());
			Spell.setOnAction(new Spell());
			Shout.setOnAction(new Shout());
			Run.setOnAction(new Run());
			Button1.setOnAction(new none());
			Button2.setOnAction(new none());
			if(TotalMana <= 4)
			{
				Text.setText("You are out of mana!");
				Attack.setOnAction(new Attack());
				Spell.setOnAction(new none());
				Shout.setOnAction(new Shout());
				Run.setOnAction(new Run());
				Button1.setOnAction(new none());
				Button2.setOnAction(new none());
			}
			else
			{
				if(Dice == 0)
				{
					if(TotalEnemyArmor <= 0)
					{
					TotalEnemyHealth = EnemyHealth - 3;
					EnemyHealth = TotalEnemyHealth;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					}
					else if(TotalEnemyArmor > 0)
					{
					TotalEnemyArmor = EnemyArmor - 3;
					EnemyArmor = TotalEnemyArmor;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
					}
				}
				if(Dice == 1)
				{
					if(TotalEnemyArmor <= 0)
					{
					TotalEnemyHealth = EnemyHealth - 4;
					EnemyHealth = TotalEnemyHealth;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					}
					else if(TotalEnemyArmor > 0)
					{
					TotalEnemyArmor = EnemyArmor - 4;
					EnemyArmor = TotalEnemyArmor;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
					}
				}
				if(Dice == 2)
				{
					if(TotalEnemyArmor <= 0)
					{
					TotalEnemyHealth = EnemyHealth - 5;
					EnemyHealth = TotalEnemyHealth;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					}
					else if(TotalEnemyArmor > 0)
					{
					TotalEnemyArmor = EnemyArmor - 5;
					EnemyArmor = TotalEnemyArmor;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
					}
				}
				if(Dice == 3)
				{
					if(TotalEnemyArmor <= 0)
					{
					TotalEnemyHealth = EnemyHealth - 6;
					EnemyHealth = TotalEnemyHealth;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					}
					else if(TotalEnemyArmor > 0)
					{
					TotalEnemyArmor = EnemyArmor - 6;
					EnemyArmor = TotalEnemyArmor;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
					}
				}
				if(Dice == 4)
				{
					if(TotalEnemyArmor <= 0)
					{
					TotalEnemyHealth = EnemyHealth - 8;
					EnemyHealth = TotalEnemyHealth;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					}
					else if(TotalEnemyArmor > 0)
					{
					TotalEnemyArmor = EnemyArmor - 8;
					EnemyArmor = TotalEnemyArmor;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
					}
				}
				if(Dice == 5)
				{
					if(TotalEnemyArmor <= 0)
					{
					TotalEnemyHealth = EnemyHealth - 10;
					EnemyHealth = TotalEnemyHealth;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					}
					else if(TotalEnemyArmor > 0)
					{
					TotalEnemyArmor = EnemyArmor - 10;
					EnemyArmor = TotalEnemyArmor;
					TotalMana = Mana - 5;
					Mana = TotalMana;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
					}
				}	
			}
		}	
	}
	class Shout implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			Text.setText("You shout at the " + Enemy + " insulting their mother");
			int Dice = rng(6);
			Attack.setOnAction(new Attack());
			Spell.setOnAction(new Spell());
			Shout.setOnAction(new Shout());
			Run.setOnAction(new Run());
			Button1.setOnAction(new none());
			Button2.setOnAction(new none());
			if(Dice == 0)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 2;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 1;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 1)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 3;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 3;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 2)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 5;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 5;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 3)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 5;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 5;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 4)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 6;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 6;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
			if(Dice == 5)
			{
				if(TotalEnemyArmor <= 0)
				{
					TotalEnemyHealth = EnemyHealth - 7;
					EnemyHealth = TotalEnemyHealth;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
				}
				else if(TotalEnemyArmor > 0)
				{
					TotalEnemyArmor = EnemyArmor - 7;
					EnemyArmor = TotalEnemyArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
					if(TotalEnemyArmor < 0)
					{
						TotalEnemyArmor = 0;
						EnemyArmor = 0;
					}
				}
			}
		}
	}
	class Run implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			int Dice = rng(6);
			Attack.setOnAction(new Attack());
			Spell.setOnAction(new Spell());
			Shout.setOnAction(new Shout());
			Run.setOnAction(new Run());
			Button1.setOnAction(new none());
			Button2.setOnAction(new none());
			if(Dice == 0)
			{
				Text.setText("You fail to run due to your addiction to sugar");
				Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
			}
			if(Dice == 1)
			{
				Text.setText("You fail to run due to your diet of sweetrolls");
				Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
			}
			if(Dice == 2)
			{
				Text.setText("You fail to run due to your try-hard additude");
				Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
			}
			if(Dice == 3)
			{
				Text.setText("You fail to run due to your opponent calling your mother fat");
				Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
			}
			if(Dice == 4)
			{
				Text.setText("You fail to run due to you slipping on a banana");
				Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new EnemyAttack());
					Button2.setOnAction(new EnemyAttack());
					Attack.setOnAction(new EnemyAttack());
					Spell.setOnAction(new EnemyAttack());
					Shout.setOnAction(new EnemyAttack());
					Run.setOnAction(new EnemyAttack());
			}
			if(Dice == 5)
			{
				Text.setText("You ran, congrats coward");
				EnemyCount++;
				Button1.setText("Next Area");
				Button2.setText("Next Area");
				Button1.setOnAction(new EnterTheDungeon());
				Button2.setOnAction(new EnterTheDungeon());
				TotalEnemyHealth = StaticEnemyHealth;
				EnemyHealth = StaticEnemyHealth;
				EnemyArmor = StaticEnemyArmor;
				TotalEnemyArmor = StaticEnemyArmor;
				EnemyBossHealth = StaticEnemyBossHealth;
				EnemyBossArmor = StaticEnemyBossArmor;
			}
		}
	}
	class EnemyAttack implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			int Dice = rng(6);
			Text.setText("Damage Taken!");
			if(Dice == 0)
			{
				if(TotalArmor <= 0)
				{
				TotalHealth = Health - 0 - mod;
				Health = TotalHealth;
				Button1.setOnAction(new NextTurn());
				Button2.setOnAction(new NextTurn());
				Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
				}
				else if(TotalArmor > 0)
				{
					TotalArmor = Armor - 0 - mod;
					Armor = TotalArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new NextTurn());
					Button2.setOnAction(new NextTurn());
					Attack.setOnAction(new NextTurn());
					Spell.setOnAction(new NextTurn());
					Shout.setOnAction(new NextTurn());
					Run.setOnAction(new NextTurn());
					Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					if(TotalArmor < 0)
					{
						TotalArmor = 0;
						Armor = 0;
						Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					}
				}
			}
			if(Dice == 1)
			{
				if(TotalArmor <= 0)
				{
				TotalHealth = Health - 1 - mod;
				Health = TotalHealth;
				Button1.setOnAction(new NextTurn());
				Button2.setOnAction(new NextTurn());
				Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
				}
				else if(TotalArmor > 0)
				{
					TotalArmor = Armor - 1 - mod;
					Armor = TotalArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new NextTurn());
					Button2.setOnAction(new NextTurn());
					Attack.setOnAction(new NextTurn());
					Spell.setOnAction(new NextTurn());
					Shout.setOnAction(new NextTurn());
					Run.setOnAction(new NextTurn());
					Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					if(TotalArmor < 0)
					{
						TotalArmor = 0;
						Armor = 0;
						Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					}
				}
			}
			if(Dice == 2)
			{
				if(TotalArmor <= 0)
				{
				TotalHealth = Health - 1 - mod;
				Health = TotalHealth;
				Button1.setOnAction(new NextTurn());
				Button2.setOnAction(new NextTurn());
				Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
				}
				else if(TotalArmor > 0)
				{
					TotalArmor = Armor - 1 - mod;
					Armor = TotalArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new NextTurn());
					Button2.setOnAction(new NextTurn());
					Attack.setOnAction(new NextTurn());
					Spell.setOnAction(new NextTurn());
					Shout.setOnAction(new NextTurn());
					Run.setOnAction(new NextTurn());
					Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					if(TotalArmor < 0)
					{
						TotalArmor = 0;
						Armor = 0;
						Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					}
				}
			}
			if(Dice == 3)
			{
				if(TotalArmor <= 2)
				{
				TotalHealth = Health - 0 - mod;
				Health = TotalHealth;
				Button1.setOnAction(new NextTurn());
				Button2.setOnAction(new NextTurn());
				Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
				}
				else if(TotalArmor > 0)
				{
					TotalArmor = Armor - 2 - mod;
					Armor = TotalArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new NextTurn());
					Button2.setOnAction(new NextTurn());
					Attack.setOnAction(new NextTurn());
					Spell.setOnAction(new NextTurn());
					Shout.setOnAction(new NextTurn());
					Run.setOnAction(new NextTurn());
					Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					if(TotalArmor < 0)
					{
						TotalArmor = 0;
						Armor = 0;
						Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					}
				}
			}
			if(Dice == 4)
			{
				if(TotalArmor <= 0)
				{
				TotalHealth = Health - 3 - mod;
				Health = TotalHealth;
				Button1.setOnAction(new NextTurn());
				Button2.setOnAction(new NextTurn());
				Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
				}
				else if(TotalArmor > 0)
				{
					TotalArmor = Armor - 3 - mod;
					Armor = TotalArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new NextTurn());
					Button2.setOnAction(new NextTurn());
					Attack.setOnAction(new NextTurn());
					Spell.setOnAction(new NextTurn());
					Shout.setOnAction(new NextTurn());
					Run.setOnAction(new NextTurn());
					Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					if(TotalArmor < 0)
					{
						TotalArmor = 0;
						Armor = 0;
						Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					}
				}
			}
			if(Dice == 5)
			{
				if(TotalArmor <= 0)
				{
				TotalHealth = Health - 4 - mod;
				Health = TotalHealth;
				Button1.setOnAction(new NextTurn());
				Button2.setOnAction(new NextTurn());
				Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
				}
				else if(TotalArmor > 0)
				{
					TotalArmor = Armor - 4 - mod;
					Armor = TotalArmor;
					Button1.setText("Next Turn");
					Button2.setText("Next Turn");
					Button1.setOnAction(new NextTurn());
					Button2.setOnAction(new NextTurn());
					Attack.setOnAction(new NextTurn());
					Spell.setOnAction(new NextTurn());
					Shout.setOnAction(new NextTurn());
					Run.setOnAction(new NextTurn());
					Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					if(TotalArmor < 0)
					{
						TotalArmor = 0;
						Armor = 0;
						Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
					}
				}
			}

		}

	}
	class NextTurn implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			if(TotalEnemyHealth <= 0 && BossCount == 0)
			{
				EnemyCount++;
				Button1.setText("Next Area");
				Button2.setText("Next Area");
				Button1.setOnAction(new EnterTheDungeon());
				Button2.setOnAction(new EnterTheDungeon());
				TotalEnemyHealth = StaticEnemyHealth;
				EnemyHealth = StaticEnemyHealth;
				EnemyArmor = StaticEnemyArmor;
				TotalEnemyArmor = StaticEnemyArmor;
				EnemyBossHealth = StaticEnemyBossHealth;
				EnemyBossArmor = StaticEnemyBossArmor;
			}
			else if(TotalEnemyHealth <= 0 && BossCount == 1)
				{
					Text.setText("You have saved the day from evil and have gone out searching for a new quest");
					Button1.setText("Journey Out");
					Button2.setText("Journey Out");
					Button1.setOnAction(new restart());
					Button2.setOnAction(new restart());
					Attack.setOnAction(new restart());
					Spell.setOnAction(new restart());
					Shout.setOnAction(new restart());
					Run.setOnAction(new restart());
					mod++;
					StaticHealth+=2;
					StaticArmor++;
					StaticMana++;
					StaticEnemyHealth+=2;
					StaticEnemyArmor++;
					StaticEnemyBossHealth+=3;
					StaticEnemyBossArmor+=2;
					Health = StaticHealth;
					Armor = StaticArmor;
					Mana = StaticMana;
					TotalHealth = Health;
					TotalArmor = Armor;
					TotalMana = Mana;
					TotalEnemyHealth = StaticEnemyHealth;
					EnemyHealth = StaticEnemyHealth;
					EnemyArmor = StaticEnemyArmor;
					TotalEnemyArmor = StaticEnemyArmor;
					EnemyBossHealth = StaticEnemyBossHealth;
					EnemyBossArmor = StaticEnemyBossArmor;
					BossCount = 0;
					EnemyCount = 0;
				}
			else
			{
			Button1.setText("Enemy Health: " + TotalEnemyHealth);
			Button2.setText("Enemy Armor: " + TotalEnemyArmor);
			Attack.setOnAction(new Attack());
			Spell.setOnAction(new Spell());
			Shout.setOnAction(new Shout());
			Run.setOnAction(new Run());
			Button1.setOnAction(new none());
			Button2.setOnAction(new none());
			if(Health <= 0)
			{
				Health = StaticHealth;
				Armor = StaticArmor;
				Mana = StaticMana;
				TotalEnemyHealth = StaticEnemyHealth;
				EnemyHealth = StaticEnemyHealth;
				EnemyArmor = StaticEnemyArmor;
				TotalEnemyArmor = StaticEnemyArmor;
				EnemyBossHealth = StaticEnemyBossHealth;
				EnemyBossArmor = StaticEnemyBossArmor;
				Stats.setText("Health:  " + TotalHealth +
	  " Armor:  " + TotalArmor + "    Mana:  " + TotalMana);
				
					Button1.setText("GameOver");
					Button2.setText("GameOver");
			Button1.setOnAction(new GO());
			Button2.setOnAction(new GO());
					
			}
			}
		}

	}
	}
}

