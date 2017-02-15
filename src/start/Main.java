































package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.CreateField;
import logic.DrawField;

public class Main extends Application {
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
		primaryStage.setTitle("MINER");
		primaryStage.setMinHeight(600);
		primaryStage.setMinWidth(600);
		Scene scene = new Scene(root, 600, 600);
		scene.getStylesheets().add(0,"/css/MainWindow.css");
		primaryStage.setScene(scene);

		primaryStage.show();
	}



	public static void main(String[] args) {
		
		DrawField DrField= new DrawField();
		DrField.makeField();
		
		launch(args);
	}
	
	

	
	
	
}
