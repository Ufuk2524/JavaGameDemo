import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Asasin Creed Valhalla");
		game1.setGameType("Aksiyon /Savaþ");
		game1.setGamePrice(269);
		game1.setDescription(
				"Þanlý bir mücadeleye atýlan efsanevi bir Viking olarak oyna. Düþmanlar üzerine akýnlar yap, yerleþimlerini geniþlet. ");
		game1.setcompatibility("PlayStation 4, PlayStation 5, Xbox One");

		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Call of Duty : Black Ops Cold War");
		game2.setGameType("Birinci þahýs niþancý");
		game2.setGamePrice(509);
		game2.setDescription(
				"Treyarch ve Raven Software tarafýndan geliþtirilen ve Activision tarafýndan yayýnlanan birinci þahýs niþancý video oyunudur.");
		game2.setcompatibility("Windos 10 ,PlayStation 4, PlayStation 5, Xbox One");

		Game game3 = new Game();
		game3.setId(3);
		game3.setGameName("Pine");
		game3.setGameType("Simülasyon/Açýk dünya");
		game3.setGamePrice(40);
		game3.setDescription(
				"Ýnsanlarýn besin zincirinin tepesine asla ulaþamadýðý simüle edilmiþ bir dünyada geçen bir açýk dünya aksiyon macera oyunu.");

		Gamer gamer1 = new Gamer();
		gamer1.setGamerId(1);
		gamer1.setFirstName("Engin");
		gamer1.setLastName("Demiroð");
		gamer1.setDateOfBirth(06 - 01 - 1985);
		gamer1.setNationalityId("28412233141");
		gamer1.setEmail("engindemirod@gmail.com");

		Gamer gamer2 = new Gamer();
		gamer2.setGamerId(2);
		gamer2.setFirstName(" Ufuk ");
		gamer2.setLastName(" Olgun ");
		gamer2.setDateOfBirth(12 - 03 - 1995);
		gamer2.setNationalityId("23565441256");
		gamer2.setEmail("ufukolgn@gmail.com");

		Gamer gamer3 = new Gamer();
		gamer3.setGamerId(3);
		gamer3.setFirstName("Kerem");
		gamer3.setLastName("Varýþ");
		gamer3.setDateOfBirth(01 - 01 - 1986);
		gamer3.setNationalityId("32564789522");

		Campaing campaing1 = new Campaing();
		campaing1.setCampaingId(1);
		campaing1.setCampaingName("Nisan kampanyasý");
		campaing1.setDescription("18 Mayýs'a kadar sýnýrlý süreli fiyat ");
		campaing1.setDiscount(20);

		Campaing campaing2 = new Campaing();
		campaing2.setCampaingId(2);
		campaing2.setCampaingName("Evde kal kampanyasý");
		campaing2.setDescription("24 Saat sýnýrlý süreli : 1 mayýs iþçi bayramýna özel");
		campaing2.setDiscount(25);

		Campaing campaing3 = new Campaing();
		campaing3.setCampaingId(3);
		campaing3.setCampaingName("Yaz kampanyasý");
		campaing3.setDescription(
				"Yazlarý rahat rahat çýkýp sevdiklerimizle birlikte olucaðýmýz nice yazlar için :Siz evde kalýn Kodloma.Ýo kampanyalara devam edicek ");
		
		System.out.println(game1.getGameName() +" "+ game1.getGameType() +" "+ game1.getDescription() +" "+ game1.getGamePrice() +" "+ game1.getcompatibility());
		
		System.out.println(game2.getGameName()+ " "+ game2.getGameType() +" "+ game2.getDescription() +" "+ game2.getGamePrice() +" "+ game2.getcompatibility());
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game3);
		gameManager.sale(gamer1, game2, campaing3);
		gameManager.sale(gamer2, game1, campaing3);
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.save(gamer1);
		gamerManager.delete(gamer2);
		gamerManager.update(gamer3);
		
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.add(campaing1);
		campaingManager.delete(campaing2);
		campaingManager.update(campaing3);
		
	}

}
