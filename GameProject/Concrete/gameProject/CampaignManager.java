package gameProject;

public class CampaignManager implements CampaignService{

	
	
	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya ekleme i�lemi tamamland�: " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + "'in indirim oran� g�ncellendi: " + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya tarihi ge�ti�i i�in silme i�lemi ger�ekle�ttiriliyor " + campaign.getCampaignName());
	}

	
	
	
}
