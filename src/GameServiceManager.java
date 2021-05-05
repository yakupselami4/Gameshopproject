
public class GameServiceManager implements GameService{
	@Override
	public void AddGame(Game game) {
		System.out.println("Oyun sisteme kaydedildi: "+game.name);
	}
	@Override
	public void DeleteGame(Game game) {
		
		System.out.println("Oyun sistemden siliniyor: "+game.name);
		game=null;
		System.out.println("Silme iþlemi sona erdi");
		
	}
	@Override
	public void UptadeGame(Game game) {
		
		System.out.println("Oyun bilgileri güncellendi: "+game.name);
	}
	@Override
	public void CampaignforGame(Game game) {
		Campaign campaign= new Campaign();
		double newgameprice=game.price-campaign.CampaignRatio;
		System.out.println("Oyununuzun yeni fiyatý: "+newgameprice);
	}
	@Override
	public void PrintGameProfile(Game game) {
		
		System.out.println("Oyun bilgileri: "+System.lineSeparator()+
				"Oyunun ismi: "+game.name+System.lineSeparator()
				+"Oyunun Türü: "+game.Genre+System.lineSeparator()
				+"Oyunun Geliþtiricisi: "+game.Developer+System.lineSeparator()
				+"Oyunun fiyatý: "+game.price+System.lineSeparator()
				+"Oyunun oynanýlabileceði platformlar: "+game.playable);
		
	
	}

}
