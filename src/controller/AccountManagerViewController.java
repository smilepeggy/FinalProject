package controller;

import view.AccountManagerView;

public class AccountManagerViewController {

	private AccountManagerView accountManagerView;

	public AccountManagerViewController(AccountManagerView accountManagerView) {
		this.accountManagerView = accountManagerView;
	}

	public AccountManagerView getAccountManagerView() {
		return this.accountManagerView;
	};
}
