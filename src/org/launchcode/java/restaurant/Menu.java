package org.launchcode.java.restaurant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    // an empty constructor, it just creates an empty list for the menuItems and uses the current time for lastUpdated
    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = new ArrayList<MenuItem>();
    }

    // a constructor that allows the user to create the menu with a pre-existing list of menuItems
    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = items;
    }

    // getter for .lastUpdated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // getter for .getMenuItems()
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // add new item to the existing menu
    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.menuItems.add(item);
        return this.menuItems;
    }

    // remove item from the existing menu
    public ArrayList<MenuItem> removeItem(MenuItem item) {
        int toBeRemoved = -1;
        for(int i = 0; i < menuItems.size(); i++) {
            if(menuItems.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.menuItems.remove(toBeRemoved);
        return this.menuItems;
    }

    public String menuUpdated() {
        return "The menu was last updated on: " + this.lastUpdated;
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }

    public void printMenu() {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i).getDescription());
        }
    }
}