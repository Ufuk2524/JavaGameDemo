package Concrete;


import Abstract.GamerCheckService;
import Abstract.GamerService;
import Adapters.MernisServiceAdapter;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;
	

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getNationalityId()+" "+" Kullanýcý E-devlet doðrulamasý ile eklendi.");
		}else {
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getNationalityId()+" : "+ " ad soyadlý müþteri kayýt edilemedi : Geçersiz kullanýcý");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+" ad soyadlý kullanýcý silindi ");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+" ad soyadlý kullanýcý bilgileri güncellendi.");
		
	}


}
