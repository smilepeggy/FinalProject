package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.VBox;
import model.Invoice;
import view.entity.TableViewBuilder;

public class AllInvoicesView extends VBox {

	private TableViewBuilder<Invoice> allInvoicesTableView;
	private Button invoiceDetailBtn;

	public AllInvoicesView() {
		intiView();
	}

	private void intiView() {
		creatallInvoicesTableView();
		createElementsToView();
	}

	private void createElementsToView() {
		this.invoiceDetailBtn = new Button("Detail");
		this.getChildren().addAll(new Label("All Invoices: "), this.allInvoicesTableView, this.invoiceDetailBtn);
	}

	private void creatallInvoicesTableView() {
		this.allInvoicesTableView = new TableViewBuilder<>();
		this.allInvoicesTableView.getColumns().add(this.allInvoicesTableView.build("ID", "itemNumber"));
		this.allInvoicesTableView.getColumns().add(this.allInvoicesTableView.build("Date", "name"));
		this.allInvoicesTableView.getColumns().add(this.allInvoicesTableView.build("Total Price", "isAdmin"));

		for (TableColumn<Invoice, ?> column : this.allInvoicesTableView.getColumns()) {
			column.setPrefWidth(100);
		}
	}
}
