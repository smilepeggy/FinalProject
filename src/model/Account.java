package model;

public class Account {

	private int id;
	private String name;
	private boolean isAdmin;

	public Account(String name, boolean isAdmin) {
		this.name = name;
		this.isAdmin = isAdmin;
	}

	public Account(int id, String name, boolean isAdmin) {
		this(name, isAdmin);
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public boolean isAdmin() {
		return this.isAdmin;
	}

}
