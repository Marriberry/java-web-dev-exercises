package org.launchcode.java.restaurant;

public class Menu {
    public static void main(String[] args) {
        MenuItem appetizer = new MenuItem(7.99, "Toasted Rav", "appetizer", false, "March 18, 2022");
        System.out.println(appetizer.menuInfo());
    }

}