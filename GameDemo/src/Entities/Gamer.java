package Entities;





public class Gamer {
	private int gamerId;
	private String firstName;
	private String lastName;
	private String NationalityId;
	private int DateOfBirth;
	private String Email;

	
	public Gamer() {
		
	}
	public Gamer(int gamerId, String firstName, String lastName, String nationalityId, int dateOfBirth , String Email) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		NationalityId = nationalityId;
		DateOfBirth = dateOfBirth;
		this.Email = Email;
	}
	
	
	public int getGamerId() {
		return gamerId;
	}


	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityId() {
		return NationalityId;
	}


	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


	public int getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	} 
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
				
	}
}
