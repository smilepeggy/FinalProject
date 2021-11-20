package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class StartView extends BorderPane {

	private static final int WIDTH = 150;
	private TextField userNameTxf;
	private TextField userPasswordTxf;
	private Button loginBtn;
	private Label dateAndTimeLbl;

	public StartView() {
		createElementsToView();
	}

	private void createElementsToView() {
		final Label welcomeLbl = new Label("Welcome");
		this.dateAndTimeLbl = new Label("Date and Time");
		this.userNameTxf = new TextField();
		this.userPasswordTxf = new TextField();
		this.loginBtn = new Button("Login");
		this.userNameTxf.setPromptText("User Name");
		this.userPasswordTxf.setPromptText("User Passwort");
		this.userNameTxf.setMaxWidth(WIDTH);
		this.userPasswordTxf.setMaxWidth(WIDTH);
		this.loginBtn.setMaxWidth(WIDTH);

		final VBox vBox = new VBox();
		vBox.getChildren().addAll(welcomeLbl, this.userNameTxf, this.userPasswordTxf, this.loginBtn);
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(30);
		this.setCenter(vBox);
		this.setBottom(this.dateAndTimeLbl);
	}

	public TextField getUserNameTxf() {
		return this.userNameTxf;
	}

	public TextField getUserPasswordTxf() {
		return this.userPasswordTxf;
	}

	public Button getLoginBtn() {
		return this.loginBtn;
	}

	public Label getDateAndTimeLbl() {
		return this.dateAndTimeLbl;
	}

}
