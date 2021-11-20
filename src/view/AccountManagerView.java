package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Account;
import view.entity.TableViewBuilder;

public class AccountManagerView extends VBox {
	private TableViewBuilder<Account> accountTableView;

	private Button createBtn;
	private Button deleteBtn;
	private TextField nameTxf;
	private TextField passwordTxf;

	public AccountManagerView() {
		intiView();
	}

	private void intiView() {
		createAccountTableView();
		createElementsToView();
	}

	private void createElementsToView() {

		this.createBtn = new Button("Create");
		this.deleteBtn = new Button("Delete");
		this.nameTxf = new TextField();
		this.passwordTxf = new TextField();
		final HBox hBox01 = new HBox();
		final HBox hBox02 = new HBox();
		hBox01.getChildren().addAll(new Label("Name: "), this.nameTxf, new Label("Password: "), this.passwordTxf);
		hBox02.getChildren().addAll(this.createBtn, this.deleteBtn);
		this.getChildren().addAll(this.accountTableView, hBox01, hBox02);

	}

	private void createAccountTableView() {
		this.accountTableView = new TableViewBuilder<>();
		this.accountTableView.getColumns().add(this.accountTableView.build("ID", "itemNumber"));
		this.accountTableView.getColumns().add(this.accountTableView.build("Name", "name"));
		this.accountTableView.getColumns().add(this.accountTableView.build("Admin", "isAdmin"));

		for (TableColumn<Account, ?> column : this.accountTableView.getColumns()) {
			column.setPrefWidth(100);
		}
	}
}
