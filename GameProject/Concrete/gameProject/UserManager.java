package gameProject;

public class UserManager implements UserService{

	
	private UserCheckService UserCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		
		UserCheckService = userCheckService;
	}
	
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName() + " adl� kullan�c� sisteme eklendi");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName() + " adl� kullan�c�n�n g�ncellemleri yap�ld�");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getId() + " id li kullan�c� silindi");
	}

	
	
	
}
