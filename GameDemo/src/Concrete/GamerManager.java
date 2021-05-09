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
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getNationalityId()+" "+" Kullan�c� E-devlet do�rulamas� ile eklendi.");
		}else {
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getNationalityId()+" : "+ " ad soyadl� m��teri kay�t edilemedi : Ge�ersiz kullan�c�");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+" ad soyadl� kullan�c� silindi ");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+" ad soyadl� kullan�c� bilgileri g�ncellendi.");
		
	}


}
