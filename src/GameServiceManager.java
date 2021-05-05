
public class GameServiceManager implements GameService{
	@Override
	public void AddGame(Game game) {
		System.out.println("Oyun sisteme kaydedildi: "+game.name);
	}
	@Override
	public void DeleteGame(Game game) {
		
		System.out.println("Oyun sistemden siliniyor: "+game.name);
		game=null;
		System.out.println("Silme i�lemi sona erdi");
		
	}
	@Override
	public void UptadeGame(Game game) {
		
		System.out.println("Oyun bilgileri g�ncellendi: "+game.name);
	}
	@Override
	public void CampaignforGame(Game game) {
		Campaign campaign= new Campaign();
		double newgameprice=game.price-campaign.CampaignRatio;
		System.out.println("Oyununuzun yeni fiyat�: "+newgameprice);
	}
	@Override
	public void PrintGameProfile(Game game) {
		
		System.out.println("Oyun bilgileri: "+System.lineSeparator()+
				"Oyunun ismi: "+game.name+System.lineSeparator()
				+"Oyunun T�r�: "+game.Genre+System.lineSeparator()
				+"Oyunun Geli�tiricisi: "+game.Developer+System.lineSeparator()
				+"Oyunun fiyat�: "+game.price+System.lineSeparator()
				+"Oyunun oynan�labilece�i platformlar: "+game.playable);
		
	
	}

}
