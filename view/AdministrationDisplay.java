package view;

import model.Minibus;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import controller.Controller;

public class AdministrationDisplay {
	
	private Controller controller=new Controller();	
	private Scene scene;
	private Button back;
	private Button addCar;
	private TextField textFieldBrandOfCar;
	private Label labelAddBrandOfCar;
	private TextField textFieldCarNumber;
	private Label labelAddCarNumber;
	private TextField textFieldNumberOfSeats;
	private Label labelAddNumberOfSeats;
	private Button addRoute;
	public AdministrationDisplay() {
		
			back = new Button("вернуться в меню");
			back.setOnAction(new EventHandler<ActionEvent>() {
				//вернуться
				@Override
				public void handle(ActionEvent arg0) {
					try {
					MainDisplay.mainDisplay.setScene(new MainDisplay().getMainScene());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			//Добавить машину
			labelAddBrandOfCar =new Label("Brand of car");
			textFieldBrandOfCar=new TextField();
			labelAddCarNumber =new Label("Car number");
			textFieldCarNumber=new TextField();
			labelAddNumberOfSeats =new Label("Number of seats");
			textFieldNumberOfSeats=new TextField();
			addCar = new Button("add car");
			addCar.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					if(controller.checkForNull(textFieldBrandOfCar.getText(),textFieldCarNumber.getText(),textFieldCarNumber.getText())){
					Minibus minibus=new Minibus();
					minibus.setBrandOfCar(textFieldBrandOfCar.getText());
					minibus.setCarNumber(textFieldCarNumber.getText());
					minibus.setNumberOfSeats(Integer.parseInt(textFieldCarNumber.getText()));
					controller.addMinibus(minibus);
					System.out.println(controller.getAllMinibuses());
					}
				}
			});
			//
			
			//
			GridPane layout = new GridPane();
			layout.add(labelAddBrandOfCar, 0, 1);
			layout.add(textFieldBrandOfCar, 1,1 );
			layout.add(labelAddCarNumber, 0, 2);
			layout.add(textFieldCarNumber, 1,2 );
			layout.add(labelAddNumberOfSeats, 0, 3);
			layout.add(textFieldNumberOfSeats, 1,3 );
			layout.add(addCar,0,4);
			layout.add(back, 0, 9);
			
			scene = new Scene(layout, 500, 500);

		}

		public Scene getScene() {
			return scene;
		}

		public void setScene(Scene scene) {
			this.scene = scene;
		}

	}
