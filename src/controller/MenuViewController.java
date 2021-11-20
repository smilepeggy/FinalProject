package controller;

import view.InvoiceView;
import view.MenuView;
import view.ProductView;

public class MenuViewController {

	private MenuView menuView;
	private MainViewController mainViewController;

	public MenuViewController(MenuView menuView, MainViewController mainViewController) {
		this.menuView = menuView;
		this.mainViewController = mainViewController;
		setAllBtnsActions();
	}

	public MenuView getMenuView() {
		return this.menuView;
	}

	private void setAllBtnsActions() {
		this.menuView.getProductBtn().setOnAction(e -> {
			showProductView();
			this.mainViewController.getMainView().getMenuBtn().setVisible(true);
		});
		this.menuView.getInvoiceBtn().setOnAction(e -> {
			showInvoiceView();
			this.mainViewController.getMainView().getMenuBtn().setVisible(true);
		});

		this.mainViewController.getMainView().getMenuBtn().setOnAction(e -> {
			showMenuView();
		});
	}

	private void showMenuView() {
		this.mainViewController.showMenuView();
		this.mainViewController.getMainView().getMenuBtn().setVisible(false);
	}

	private void showProductView() {
		ProductViewController productViewController = new ProductViewController(new ProductView(),
				this.mainViewController);
		this.mainViewController.getMainView().setCenter(productViewController.getProductView());
	}

	private void showInvoiceView() {
		InvoiceViewController invoiceViewController = new InvoiceViewController(new InvoiceView());
		this.mainViewController.getMainView().setCenter(invoiceViewController.getInvoiceView());
	}
}
