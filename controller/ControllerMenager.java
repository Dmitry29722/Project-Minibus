package controller;

import model.Minibus;
import model.Passenger;


public interface ControllerMenager {
	public void saveBase();
	public void addPerson(Passenger passenger);
	public Passenger getPassenger(String name);
	public String getAllPassengers();
	public void addMinibus(Minibus minibus);
	public Minibus getMinibus(String name);
	public String getAllMinibuses();
}
