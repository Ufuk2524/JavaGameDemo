package Concrete;

import Abstract.CampaingSerivice;
import Entities.Campaing;

public class CampaingManager implements CampaingSerivice {

	@Override
	public void add(Campaing entity) {
		System.out.println(entity.getCampaingName() +" "+ "�simli kampanya eklendi");
		
	}

	@Override
	public void delete(Campaing entity) {
		System.out.println(entity.getCampaingName() +" "+ "�simli kampanya silindi");
		
	}

	@Override
	public void update(Campaing entity) {
		System.out.println(entity.getCampaingName()+" "+ "�simli  kampanya  i�eri�i g�ncellendi");
		
	}

	@Override
	public void list(Campaing entity) {
		System.out.println(entity.getCampaingName()+" "+ "T�m kampanyalar listelendi");
		
	}

}
