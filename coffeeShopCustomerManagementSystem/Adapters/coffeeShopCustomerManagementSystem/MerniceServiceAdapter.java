package coffeeShopCustomerManagementSystem;

import java.rmi.RemoteException;
import java.util.Date;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		boolean result= true;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong("3634"), "dilara", "derinpinar", new Date(2000,10,10));
			
		} catch (RemoteException e){
			e.printStackTrace();
		}
		return result;
	}

}
