package etud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		BorderPane root = FXMLLoader.load(getClass().getClassLoader().getResource("GUI.fxml"));
		Scene scene = new Scene(root, 800, 600);

		stage.setTitle("Simulateur de foule");
		stage.setScene(scene);
		stage.show();
	}
}
