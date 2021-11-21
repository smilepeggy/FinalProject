package controller;

import view.AccountManagerView;
import view.AllInvoicesView;
import view.InvoiceView;
import view.MenuView;
import view.ProductView;

public class MenuViewController {

	private MenuView menuView;
	private MainViewController mainViewController;
	private StartViewController startViewController;

	public MenuViewController(MenuView menuView, MainViewController mainViewController,
			StartViewController startViewController) {
		this.menuView = menuView;
		this.mainViewController = mainViewController;
		this.startViewController = startViewController;
		setAllBtnsActions();
	}

	public MenuView getMenuView() {
		return this.menuView;
	}

	private void setAllBtnsActions() {
		this.mainViewController.getMainView().getMenuBtn().setOnAction(e -> {
			showMenuView();
		});
		this.menuView.getLogoutBtn().setOnAction(e -> {
			showStartView();
		});
		this.menuView.getProductBtn().setOnAction(e -> {
			showProductView();
			this.mainViewController.getMainView().getMenuBtn().setVisible(true);
		});
		this.menuView.getInvoiceBtn().setOnAction(e -> {
			showInvoiceView();
			this.mainViewController.getMainView().getMenuBtn().setVisible(true);
		});
		this.menuView.getAccountManagerBtn().setOnAction(e -> {
			showAccountManagerView();
			this.mainViewController.getMainView().getMenuBtn().setVisible(true);
		});

		this.menuView.getInvoiceBtn().setOnAction(e -> {
			showAllInvoicesView();
			this.mainViewController.getMainView().getMenuBtn().setVisible(true);

		});

	}

	private void showStartView() {
		this.mainViewController.getMainView().setLeft(null);
		this.mainViewController.getMainView().setTop(null);
		this.mainViewController.getMainView().setBottom(null);
		this.mainViewController.getMainView().setCenter(this.startViewController.getStartView());
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

	private void showAccountManagerView() {
		AccountManagerViewController accountManagerViewController = new AccountManagerViewController(
				new AccountManagerView());
		this.mainViewController.getMainView().setCenter(accountManagerViewController.getAccountManagerView());
	}

	private void showAllInvoicesView() {
		AllInvoicesViewController allInvoicesViewController = new AllInvoicesViewController(new AllInvoicesView());
		this.mainViewController.getMainView().setCenter(allInvoicesViewController.getAllInvoicesView());

	}
}
