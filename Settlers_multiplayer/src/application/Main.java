package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent mainroot = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		Stage mainstage = new Stage();
		
		Scene mainscene = new Scene(mainroot);
		
		//String css = this.getClass().getResource("application.css").toExternalForm();
		//mainscene.getStylesheets().add(css);
		mainstage.setTitle("Siedler von Catan");
		mainstage.getIcons().add(new Image("Siedler_von_Catan_Logo.jpg"));
		
		mainstage.setScene(mainscene);
		mainstage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}