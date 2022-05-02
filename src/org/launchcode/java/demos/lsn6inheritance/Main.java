package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());
        System.out.println(garfield.isSatisfied());
        System.out.println(garfield.noise());

        HouseCat spike = new HouseCat("Spike");
        // prints Hello, my name is Spike! from the Housecat subclass @override
        System.out.println(spike.noise());
        System.out.println(spike.getWeight());

        Cat plainCat = new Cat(8.6);
        // prints Meeeeeeeooowww! from the Cat class
        System.out.println(plainCat.noise());
    }
}
