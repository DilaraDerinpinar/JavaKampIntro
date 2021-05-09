package gameProject;

import java.util.Date;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		User user1=new User(1,"atanur","öðe",new Date(2000,14,4),"45343");
	
		Game game1=new Game(33,"sims4",90.0);
		
		Campaign campaign1=new Campaign(44,"Dev Kampanya", 30);
		
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		
		GameManager gameManager=new GameManager();
		
		CampaignManager campaignManager=new CampaignManager();
		
		SaleManager saleManager=new SaleManager();
		
		userManager.add(user1);
		gameManager.add(game1);
		campaignManager.add(campaign1);
		saleManager.sale(user1, campaign1, game1);
		
		
		
		
	}

}
