package model;

public class Passenger {
	private String name;
	private String surname;
	private String telephoneNumber;
	private Route route=new Route();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassporyID() {
		return telephoneNumber;
	}
	public void setPassporyID(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
}
