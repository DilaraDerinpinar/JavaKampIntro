package gameProject;

public class SaleManager implements SaleService{

	@Override
	public void sale(User user, Campaign campaign, Game game) {
		// TODO Auto-generated method stub
		System.out.println("yeni kampanyamýzla gelen indirimli fiyatýnýz: ");
		double discountPrice=game.getGamePrice() - (game.getGamePrice()*(campaign.getDiscount()/100));
		
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kullanýcý "
				+ game.getGameName() + " oyununu " + game.getGamePrice() + " yerine " 
				+ discountPrice + " fiyatýna almýþtýr");
		
		
		
	}

}
