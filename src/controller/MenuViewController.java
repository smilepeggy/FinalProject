package controller;

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
		});
	}

	private void showProductView() {
		ProductViewController productViewController = new ProductViewController(new ProductView(),
				this.mainViewController);
		this.mainViewController.getMainView().setCenter(productViewController.getProductView());
	}
}
