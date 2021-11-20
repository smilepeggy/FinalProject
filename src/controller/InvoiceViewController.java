package controller;

import view.InvoiceView;

public class InvoiceViewController {

	private InvoiceView invoiceView;

	public InvoiceViewController(InvoiceView invoiceView) {
		this.invoiceView = invoiceView;
	}

	public InvoiceView getInvoiceView() {
		return this.invoiceView;
	}
}
