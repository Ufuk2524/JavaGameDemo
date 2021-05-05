package Entities;

public class Campaing {
	private int campaingId;
	private String campaingName;
	private String Description;
	private double Discount;
	
	public Campaing() {
		
	}
	
	public Campaing(int campaingId, String campaingName, String description, double discount) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		Description = description;
		Discount = discount;
	}  
 
	public int getCampaingId() {
		return campaingId;
	}



	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}



	public String getCampaingName() {
		return campaingName;
	}



	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public double getDiscount() {
		return Discount;
	}



	public void setDiscount(double discount) {
		Discount = discount;
	}

}
