package application;

import controller.StartViewController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.StartView;

public class Main extends Application {
	private static final int SCENE_WIDTH = 800, SCENE_HEIGHT = 500;
	private static final String CSS_PATH = "application.css";

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StartViewController startViewController = new StartViewController(new StartView());
		Scene scene = new Scene(startViewController.getStartView(), SCENE_WIDTH, SCENE_HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.getIcons().add(new Image("test.png"));
		primaryStage.setTitle("Final Project");
		primaryStage.show();

	}
}
