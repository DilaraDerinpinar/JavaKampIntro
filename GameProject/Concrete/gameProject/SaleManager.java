package gameProject;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Campaign campaign, Game game) {
		// TODO Auto-generated method stub
		System.out.println("yeni kampanyam�zla gelen indirimli fiyat�n�z: ");
		double discountPrice=game.getGamePrice() - (game.getGamePrice()*(campaign.getDiscount()/100));
		
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� kullan�c� "
				+ game.getGameName() + " oyununu " + game.getGamePrice() + " yerine " 
				+ discountPrice + " fiyat�na alm��t�r");
		
		
		
	}

}
