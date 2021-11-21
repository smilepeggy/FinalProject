package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.VBox;
import model.Product;
import view.entity.TableViewBuilder;

public class InvoiceView extends VBox {
	private TableViewBuilder<Product> currentInvoiceTableView;

	private Button allInvoicesBtn;
	private Button deleteBtn;
	private Button clearBtn;
	private Button finishBtn;

	private Label totalPriceLbl = new Label("Total Price: ");

	public InvoiceView() {
		initView();
	}

	private void initView() {
		createCurrentInvoiceTableView();
		createElementsToView();
	}

	private void createElementsToView() {
		this.allInvoicesBtn = new Button("All Invoices");
		this.deleteBtn = new Button("Delete");
		this.clearBtn = new Button("clear");
		this.finishBtn = new Button("Finish");
		this.getChildren().addAll(this.allInvoicesBtn, new Label("Current Invoice: "), this.currentInvoiceTableView,
				this.totalPriceLbl, this.deleteBtn, this.clearBtn, this.finishBtn);
	}

	private void createCurrentInvoiceTableView() {
		this.currentInvoiceTableView = new TableViewBuilder<Product>();
		this.currentInvoiceTableView.getColumns()
				.add(this.currentInvoiceTableView.build("Artikelnummer", "itemNumber"));
		this.currentInvoiceTableView.getColumns().add(this.currentInvoiceTableView.build("Name", "name"));
		this.currentInvoiceTableView.getColumns()
				.add(this.currentInvoiceTableView.build("Verkaufspreis", "sellingPrice"));
		this.currentInvoiceTableView.getColumns().add(this.currentInvoiceTableView.build("Menge", "selectedAmount"));
		for (TableColumn<Product, ?> column : this.currentInvoiceTableView.getColumns()) {
			column.setPrefWidth(100);
		}

	}
}
