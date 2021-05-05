package Entities;

public class Game {
	private int id;
	private String gameName;
	private String gameType; 
	private String Description;
	private String compatibility;
	private int gamePrice;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, String gameType, String description, int gamePrice,String compatibility) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameType = gameType;
		Description = description;
		this.gamePrice = gamePrice;
		this.compatibility =  compatibility;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	public String getcompatibility() {
		return compatibility;
	}
	public void setcompatibility(String compatibility) {
		this.compatibility = compatibility;
	}

}
