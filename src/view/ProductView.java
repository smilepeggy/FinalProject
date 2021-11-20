package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import model.Product;
import view.entity.TableViewBuilder;

public class ProductView extends BorderPane {
	private TableViewBuilder<Product> productTableView;
	private Button exportBtn;
	private Button saveBtn;
	private Button addToInvoiceBtn;

	private TextField itemNumberTxf = new TextField();
	private TextField nameTxf = new TextField();
	private TextField purchasePriceTxf = new TextField();
	private TextField sellingPriceTxf = new TextField();
	private TextField currentAmountTxf = new TextField();
	private TextField maxAmountTxf = new TextField();
	private TextField minAmountTxf = new TextField();
	private TextField manufacturerTxf = new TextField();
	private TextField supplierTxf = new TextField();
	private TextField enterAmountTxf = new TextField();

	public ProductView() {
		initView();
	}

	private void initView() {
		createProductTable();
		createElementsToView();
		this.setTop(this.productTableView);
		this.setBottom(createProdetailsView());
	}

	private void createElementsToView() {
		this.exportBtn = new Button("Export Products");
		this.saveBtn = new Button("Save");
		this.addToInvoiceBtn = new Button("Add to Invoice");
		createProdetailsView();
	}

	private GridPane createProdetailsView() {
		final GridPane productDetailsWapper = new GridPane();

		productDetailsWapper.addRow(0, this.exportBtn);

		productDetailsWapper.addRow(1, new Label("Artikelnummer"));
		productDetailsWapper.addRow(1, this.itemNumberTxf);
		productDetailsWapper.addRow(1, new Label("Name"));
		productDetailsWapper.addRow(1, this.nameTxf);
		productDetailsWapper.addRow(1, new Label("Einkaufspreis"));
		productDetailsWapper.addRow(1, this.purchasePriceTxf);

		productDetailsWapper.addRow(2, new Label("Verkaufspreis"));
		productDetailsWapper.addRow(2, this.sellingPriceTxf);
		productDetailsWapper.addRow(2, new Label("Aktuellemenge"));
		productDetailsWapper.addRow(2, this.currentAmountTxf);
		productDetailsWapper.addRow(2, new Label("Maximalmenge"));
		productDetailsWapper.addRow(2, this.maxAmountTxf);

		productDetailsWapper.addRow(3, new Label("Mindestmenge"));
		productDetailsWapper.addRow(3, this.minAmountTxf);
		productDetailsWapper.addRow(3, new Label("Hersteller"));
		productDetailsWapper.addRow(3, this.supplierTxf);
		productDetailsWapper.addRow(3, new Label("Lieferant"));
		productDetailsWapper.addRow(3, this.manufacturerTxf);

		productDetailsWapper.addRow(4, new Label("Enter the Amount"));
		productDetailsWapper.addRow(4, this.enterAmountTxf);

		productDetailsWapper.addRow(5, this.saveBtn);
		productDetailsWapper.addRow(5, this.addToInvoiceBtn);

		return productDetailsWapper;
	}

	private void createProductTable() {
		this.productTableView = new TableViewBuilder<>();
		this.productTableView.getColumns().add(this.productTableView.build("Artikelnummer", "itemNumber"));
		this.productTableView.getColumns().add(this.productTableView.build("Name", "name"));
		this.productTableView.getColumns().add(this.productTableView.build("Einkaufspreis", "purchasePrice"));
		this.productTableView.getColumns().add(this.productTableView.build("Verkaufspreis", "sellingPrice"));
		this.productTableView.getColumns().add(this.productTableView.build("Aktuellemenge", "currentAmount"));
		this.productTableView.getColumns().add(this.productTableView.build("Maximalmenge", "maxAmount"));
		this.productTableView.getColumns().add(this.productTableView.build("Mindestmenge", "minAmount"));
		this.productTableView.getColumns().add(this.productTableView.build("Hersteller", "manufacturer"));
		this.productTableView.getColumns().add(this.productTableView.build("Lieferant", "supplier"));

		for (TableColumn<Product, ?> column : this.productTableView.getColumns()) {
			column.setPrefWidth(100);
		}
	}

	public TableViewBuilder<Product> getProductTableView() {
		return this.productTableView;
	}

}
