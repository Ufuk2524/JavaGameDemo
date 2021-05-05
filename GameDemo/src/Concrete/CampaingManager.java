package Concrete;

import Abstract.CampaingSerivice;
import Entities.Campaing;

public class CampaingManager implements CampaingSerivice {

	@Override
	public void add(Campaing entity) {
		System.out.println(entity.getCampaingName() +" "+ "Ýsimli kampanya eklendi");
		
	}

	@Override
	public void delete(Campaing entity) {
		System.out.println(entity.getCampaingName() +" "+ "Ýsimli kampanya silindi");
		
	}

	@Override
	public void update(Campaing entity) {
		System.out.println(entity.getCampaingName()+" "+ "Ýsimli  kampanya  içeriði güncellendi");
		
	}

	@Override
	public void list(Campaing entity) {
		System.out.println(entity.getCampaingName()+" "+ "Tüm kampanyalar listelendi");
		
	}

}
