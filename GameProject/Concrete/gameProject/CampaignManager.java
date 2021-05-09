package gameProject;

public class CampaignManager implements CampaignService{

	
	
	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya ekleme iþlemi tamamlandý: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + "'in indirim oraný güncellendi: " + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya tarihi geçtiði için silme iþlemi gerçekleþttiriliyor " + campaign.getCampaignName());
	}

	
	
	
}
