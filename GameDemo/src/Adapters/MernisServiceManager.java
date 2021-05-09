package Adapters;

import java.rmi.RemoteException;

import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceManager implements MernisServiceAdapter{

	
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth());
		}catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		return false;
	}

}
}
