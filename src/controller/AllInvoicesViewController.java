package controller;

import view.AllInvoicesView;

public class AllInvoicesViewController {

	private AllInvoicesView allInvoicesView;

	public AllInvoicesViewController(AllInvoicesView allInvoicesView) {
		this.allInvoicesView = allInvoicesView;
	}

	public AllInvoicesView getAllInvoicesView() {
		return this.allInvoicesView;
	}
}
