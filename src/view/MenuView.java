package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MenuView extends BorderPane {
	private static final int WIDTH = 200;

	private Button productBtn;
	private Button allInvoicesBtn;
	private Button accountManagerBtn;
	private Button logoutBtn;
	private Label loginNameLbl;
	private Label dateAndTimeLbl;
	private Label appNameLbl;
	private Label imageLbl;

	public MenuView() {
		createElementsToView();
		loadImage();
	}

	private void createElementsToView() {

		this.productBtn = new Button("Product");
		this.allInvoicesBtn = new Button("All Invoices");
		this.accountManagerBtn = new Button("Account Manager");
		this.logoutBtn = new Button("Logout");
		this.loginNameLbl = new Label("Login as ");
		this.dateAndTimeLbl = new Label("Date and Time");
		this.appNameLbl = new Label("App name");
		this.imageLbl = new Label();

		this.productBtn.setMaxWidth(WIDTH);
		this.allInvoicesBtn.setMaxWidth(WIDTH);
		this.accountManagerBtn.setMaxWidth(WIDTH);
		this.logoutBtn.setMaxWidth(WIDTH);
		this.productBtn.setMaxWidth(WIDTH);

		final VBox vBoxLeft = new VBox();
		vBoxLeft.getChildren().addAll(this.productBtn, this.allInvoicesBtn, this.accountManagerBtn, this.logoutBtn,
				this.loginNameLbl);
		vBoxLeft.setAlignment(Pos.CENTER_LEFT);
		vBoxLeft.setSpacing(30);
		this.setLeft(vBoxLeft);

		final VBox vBoxRight = new VBox();
		vBoxRight.getChildren().addAll(this.appNameLbl, this.imageLbl);
		this.setCenter(vBoxRight);
		this.setBottom(this.dateAndTimeLbl);

	}

	private void loadImage() {
		Image logo = new Image("imgs/test.png", 300, 300, true, true);
		this.imageLbl.setGraphic(new ImageView(logo));
		this.imageLbl.setContentDisplay(ContentDisplay.TOP);
	}

	public Button getProductBtn() {
		return this.productBtn;
	}

	public Button getAllInvoicesBtn() {
		return this.allInvoicesBtn;
	}

	public Button getAccountManagerBtn() {
		return this.accountManagerBtn;
	}

	public Button getLogoutBtn() {
		return this.logoutBtn;
	}

	public Label getLoginNameLbl() {
		return this.loginNameLbl;
	}

	public Label getDateAndTimeLbl() {
		return this.dateAndTimeLbl;
	}

	public Label getAppNameLbl() {
		return this.appNameLbl;
	}

}
