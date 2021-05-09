package gameProject;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{
	public boolean CheckIfRealPerson(User user) {
		// TODO Auto-generated method stub
		KPSPublicSoap client=new KPSPublicSoapProxy();
		
		boolean result=false;
		
		try
		{
			result=client.TCKimlikNoDogrula(
					
					Long.parseLong(user.getNationalityID()),
					user.getFirstName(),
					user.getLastName(),
					user.getDateOfBirth().getYear());
					
					
					
		}
		
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		catch(RemoteException e)
		{
			e.printStackTrace();
		}
			
		return result;
}
}
