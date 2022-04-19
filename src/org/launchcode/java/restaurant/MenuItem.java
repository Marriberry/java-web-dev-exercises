package org.launchcode.java.restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;
    private String menuDate;

    public MenuItem(double price, String description, String category, boolean newItem, String menuDate) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.menuDate = menuDate;
    }

    public String menuInfo() {
        return(this.category + ": " + this.description + " costs " + this.price + " and was added to our menu " + this.menuDate + ".");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public String getMenuDate() {
        return menuDate;
    }

    public void setMenuDate(String menuDate) {
        this.menuDate = menuDate;
    }
}
