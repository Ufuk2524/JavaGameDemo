package Concrete;

import Abstract.GameService;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{ 


	@Override
	public void add(Game entity) {
		System.out.println(entity.getGameName() +" "+ "isimli oyun maðazaya eklendi");
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getGameName() +" "+ "isimli oyun maðazadan kaldýrýldý.");
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getGameName() +" "+ "isimli oyun içeriði güncellenmiþtir."); 
	}
     

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" "+ "isimli oyunu"+" "+gamer.getFirstName()+" "+ gamer.getLastName()+" ad soyadlý müþteri"+"satýn aldý");
		
	}

	@Override
	public void sale(Gamer gamer, Game game, Campaing campaing) {
		double newPrice = game.getGamePrice() - (game.getGamePrice() * (campaing.getDiscount() / 100));
		System.out.println(game.getGameName() + "ismli oyunu " + campaing.getCampaingName()+" "+ " ile" + newPrice + " "
				+ "Tl ye satýldý. Satýn alan oyuncu :" + gamer.getFirstName() +" " + gamer.getLastName());
	}

	
}

	

