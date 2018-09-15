package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainDisplay extends Application {

	private Button addPassenger;
	private Button viewOrders;
	private Button searchPassenger;
	private Button administration;
	private Scene scene;
	public static Stage mainDisplay;

	public MainDisplay() {
		addPassenger = new Button("Add passenger");
		viewOrders = new Button("View orders");
		searchPassenger = new Button("Search passenger");
		administration = new Button("Administration");

		GridPane layout = new GridPane();
		layout.setMargin(addPassenger, new Insets(10, 5, 5, 10));
		layout.setMargin(viewOrders, new Insets(10, 5, 5, 10));
		layout.setMargin(searchPassenger, new Insets(10, 5, 5, 10));
		layout.setMargin(administration, new Insets(10, 5, 5, 10));
		// Добавить пасажира
		addPassenger.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

			}

		});

		// Поиск пасажира
		searchPassenger.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

			}

		});
		// Все поездки
		viewOrders.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

			}

		});
		// АДМИН
		administration.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				mainDisplay.setScene(new AdministrationDisplay().getScene());
			}
		});
		//
		layout.add(addPassenger, 0, 0);
		layout.add(viewOrders, 0, 1);
		layout.add(searchPassenger, 0, 2);
		layout.add(administration, 0, 3);
		scene = new Scene(layout, 300, 300);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		mainDisplay = primaryStage;

		mainDisplay.setScene(scene);
		mainDisplay.show();

	}

	public Scene getMainScene() {
		return this.scene;
	}

}
