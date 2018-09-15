package controller;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.control.Alert;

import model.Minibus;
import model.Passenger;

public class Controller implements ControllerMenager{
	private  Map<String, Passenger> passengers=new HashMap<>();
	private static Map<String, Minibus> minibuses=new HashMap<>();
	
	
	@Override
	public void saveBase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPerson(Passenger passenger) {
		this.passengers.put(passenger.getName(), passenger);
	}

	@Override
	public Passenger getPassenger(String name) {
		return passengers.get(name);
	}

	@Override
	public String getAllPassengers() {
		StringBuffer allPassengers = new StringBuffer();
		String[] names = passengers.keySet().toArray(
				new String[passengers.keySet().size()]);
		for (String name : names) {
			allPassengers.append(name + "\n");
		}
		return allPassengers.toString();
	}

	@Override
	public void addMinibus(Minibus minibus) {
		minibuses.put(minibus.getCarNumber(), minibus);
	}

	@Override
	public Minibus getMinibus(String carNumber) {
		return minibuses.get(carNumber);
	}

	@Override
	public String getAllMinibuses() {
		StringBuffer allMinibuses = new StringBuffer();
		String[] names = minibuses.keySet().toArray(
				new String[minibuses.keySet().size()]);
		for (String name : names) {
			allMinibuses.append(name + "\n");
		}
		return allMinibuses.toString();
	}
	
	public  boolean checkForNull(String... values){
		for(String value:values){
		if (value.length()==0) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
		    alert.setTitle("Error");
		    alert.setHeaderText(null);
		    alert.setContentText("Fill in all the fields!");
		    alert.showAndWait();
		    return false;
		    }
		}
		return true;
	}

}
