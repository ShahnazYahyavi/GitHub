package view;

import java.util.ArrayList;

import DataBase.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KommunalSkatView extends Application {
	static DataLayer dataLayer = new DataLayer();

	public static void main(String[] args) {

		dataLayer.openConnection();
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();
		Scene scene = new Scene(grid, 300, 275);
		ComboBox<String> kommunalCombo = new ComboBox<String>();
		grid.add(kommunalCombo, 1, 3);
		TextField procentText = new TextField();
		procentText.setEditable(false);
		grid.add(procentText, 1, 2);
		Button OKbt = new Button();
		grid.add(OKbt, 1, 4);
		OKbt.setText("OK");
		ArrayList<String> skats = new ArrayList<String>();
		System.out.println(skats);
		skats = dataLayer.getAllby();
		for (String s : skats)
			kommunalCombo.getItems().add(s);
		stage.setTitle("KommunalSkat");
		OKbt.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				procentText.setText("" + dataLayer.getprocent(kommunalCombo.getValue()) + "%");
			}

		});

		stage.setScene(scene);
		stage.show();

	}

}
