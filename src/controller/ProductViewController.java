package controller;

import view.ProductView;

public class ProductViewController {

	private ProductView productView;
	private MainViewController mainViewController;

	public ProductViewController(ProductView productView, MainViewController mainViewController) {
		this.productView = productView;
		this.mainViewController = mainViewController;
	}

	public ProductView getProductView() {
		return this.productView;
	}

	private void createProductDetailsBinds() {

	}
}
