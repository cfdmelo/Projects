package Desafio_01;

public abstract class AgendaTelefonica {

	protected String Name;
	protected String Address;
	protected String TelephoneNumber;
	protected String PhoneNumber;
	protected String Email;

	protected int x = 0;
	protected boolean addmore;
	int n = 1;
	
	public AgendaTelefonica(String Name) {
	this.Name = Name;
	}

	public abstract void schedule();
	
	public void scheduleVisual() {
		System.out.println("====== [ SCHEDULE ] ======");
		System.out.println("Nome:" + this.Name);
		System.out.println("Adress: " + this.Address);
		System.out.println("Telephone Number: " + this.TelephoneNumber);
		System.out.println("Phone Number: " + this.PhoneNumber);
		System.out.println("Email: " + this.Email);
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public boolean isAddmore() {
		return addmore;
	}

	public void setAddmore(boolean addmore) {
		this.addmore = addmore;
	}

	public void setAddress(String address) {
		Address = address;
	}
 
	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getName(String Name) {
		return Name;
	}

	public String getAddress(String Address) {
		return Address;
	}

	public String getTelephoneNumber(String telephoneNumber) {
		return TelephoneNumber;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getEmail(String Email) {
		return Email;
	}
}