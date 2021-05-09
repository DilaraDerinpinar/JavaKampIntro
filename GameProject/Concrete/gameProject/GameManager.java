package gameProject;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun ekleme iþlemi tamamlandý "+ game.getGameName());
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyundaki yeni fiyatlara göz atýn:  " + game.getGamePrice());
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun silinme iþlemi gerçekleþtiriliyor.. " + game.getGameName());
	}

	
	
	
}
