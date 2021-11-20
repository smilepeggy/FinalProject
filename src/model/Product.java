package model;

public class Product {
    private double purchasePrice;
    private double sellingPrice;
    private int currentAmount;
    private int maxAmount;
    private int minAmount;
    private int itemNumber;
    private String manufacturer;
    private String supplier;
    private String name;

    public Product(double purchasePrice, double sellingPrice, int currentAmount, int maxAmount, int minAmount,
            int itemNumber, String manufacturer, String supplier, String name) {
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.currentAmount = currentAmount;
        this.maxAmount = maxAmount;
        this.minAmount = minAmount;
        this.itemNumber = itemNumber;
        this.manufacturer = manufacturer;
        this.supplier = supplier;
        this.name = name;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public int getCurrentAmount() {
        return this.currentAmount;
    }

    public int getMaxAmount() {
        return this.maxAmount;
    }

    public int getMinAmount() {
        return this.minAmount;
    }

    public int getItemNumber() {
        return this.itemNumber;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public String getName() {
        return this.name;
    }

}
