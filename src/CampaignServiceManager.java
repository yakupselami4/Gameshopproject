
public class CampaignServiceManager implements CampaignService{
	@Override
	public void AddCampaign(Campaign campaign) {
		
		
		System.out.println("Kampanya sisteme eklendi: "+campaign.CampaignName+" "+"Þu kadar süre geçerli: "+campaign.CampaignDate);
	}
	@Override
	public void DeleteCampaign(Campaign campaign) {
		
		System.out.println("Kampanya sistemden silindi:  "+campaign.CampaignName);
	}
	@Override
	public void UptadeCampaign(Campaign campaign) {
		
		System.out.println("Kampanyanýz güncellendi: "+campaign.CampaignName);
	}

}
