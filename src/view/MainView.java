package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainView extends BorderPane {
	private static final int WIDTH = 100;

	private Label loginNameLbl;
	private Label dateAndTimeLbl;
	private Button menuBtn;

	public MainView() {
		createElementsToView();
	}

	private void createElementsToView() {
		this.loginNameLbl = new Label("Login as ");
		this.dateAndTimeLbl = new Label();
		this.menuBtn = new Button("Menu");
		this.menuBtn.setVisible(false);
		this.menuBtn.setMaxWidth(WIDTH);
		final HBox hBox = new HBox();
		final VBox vBox = new VBox();
		vBox.getChildren().addAll(this.loginNameLbl, this.dateAndTimeLbl);
		hBox.getChildren().addAll(vBox, this.menuBtn);
		this.setBottom(hBox);
	}

	public Label getLoginNameLbl() {
		return this.loginNameLbl;
	}

	public Label getDateAndTimeLbl() {
		return this.dateAndTimeLbl;
	}

	public Button getMenuBtn() {
		return this.menuBtn;
	}
}
