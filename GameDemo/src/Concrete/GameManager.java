package Concrete;

import Abstract.GameService;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{ 


	@Override
	public void add(Game entity) {
		System.out.println(entity.getGameName() +" "+ "isimli oyun ma�azaya eklendi");
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getGameName() +" "+ "isimli oyun ma�azadan kald�r�ld�.");
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getGameName() +" "+ "isimli oyun i�eri�i g�ncellenmi�tir."); 
	}
     

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" "+ "isimli oyunu"+" "+gamer.getFirstName()+" "+ gamer.getLastName()+" ad soyadl� m��teri"+"sat�n ald�");
		
	}

	@Override
	public void sale(Gamer gamer, Game game, Campaing campaing) {
		double newPrice = game.getGamePrice() - (game.getGamePrice() * (campaing.getDiscount() / 100));
		System.out.println(game.getGameName() + "ismli oyunu " + campaing.getCampaingName()+" "+ " ile" + newPrice + " "
				+ "Tl ye sat�ld�. Sat�n alan oyuncu :" + gamer.getFirstName() +" " + gamer.getLastName());
	}

	
}

	

