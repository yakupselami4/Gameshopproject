
public class Main {

	public static void main(String[] args) {
		
		User user1= new User();
		user1.FirstName="Yakup Selami";
		user1.LastName="Öztürk";
		user1.DateOfBird="20 Nisan 2000";
		user1.TCNo="12345678912";
		user1.Nickname="Harvey Bullock";
		
		UserServiceManager usermanager2= new UserServiceManager();
		usermanager2.PrintUserProfile(user1);
		
		System.out.println("-------------------");
		Game game1= new Game();
		game1.name="Hades";
		game1.Genre="Roguelike";
		game1.price=40;
		game1.Developer="Superglant Games";
		game1.Metascore=93;
		game1.playable="PC,PS4,Nintendo Switch,XBOXONE";
		
		GameServiceManager gameservice= new GameServiceManager();
		gameservice.PrintGameProfile(game1);
		System.out.println("-------------------");
		
		Game game2= new Game();
		game2.name="They Are Billions";
		game2.Genre="Strategy";
		game2.price=87.50;
		game2.Developer="Numantlan Games";
		game2.Metascore=77;
		game2.playable="PC,PS4,Nintendo Switch,XBOXONE";
		
		GameServiceManager gameservice1= new GameServiceManager();
		gameservice1.PrintGameProfile(game2);
		
		System.out.println("-------------------");
		Campaign SummerSale= new Campaign();
		SummerSale.CampaignDate="3 ay";
		SummerSale.CampaignName="Yaz Ýndirimi";
		SummerSale.CampaignRatio=5;
		System.out.println("-------------------");
		GameServiceManager gamemanager= new GameServiceManager();
		gamemanager.AddGame(game1);
		gamemanager.CampaignforGame(game1);
		gamemanager.UptadeGame(game1);
		gamemanager.DeleteGame(game1);
		System.out.println("-------------------");
		UserServiceManager usermanager= new UserServiceManager();
		usermanager.AddUser(user1);
		usermanager.UptadeUser(user1);
		usermanager.DeleteUser(user1);
		System.out.println("-------------------");

		
		CampaignServiceManager campaignmanager= new CampaignServiceManager();
		campaignmanager.AddCampaign(SummerSale);
		campaignmanager.UptadeCampaign(SummerSale);
		campaignmanager.DeleteCampaign(SummerSale);
		System.out.println("-------------------");
		CheckIfRealPerson checkperson= new CheckIfRealPerson();
		checkperson.CheckRealPerson(user1);
		


	}

}
