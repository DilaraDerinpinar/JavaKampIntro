package gameProject;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun ekleme i�lemi tamamland� "+ game.getGameName());
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyundaki yeni fiyatlara g�z at�n:  " + game.getGamePrice());
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun silinme i�lemi ger�ekle�tiriliyor.. " + game.getGameName());
	}

	
	
	
}
