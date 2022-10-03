package test;

import observable.WildernessAnimal;
import observer.Hiker;

public class Main {
    public static void main(String[] args) {
        //create observable
        WildernessAnimal animal = new WildernessAnimal("Bison", "Yellowstone Park");

        //create observers
        Hiker hiker = new Hiker("Cameron");
        Hiker anotherHiker = new Hiker("Cody");

        //connect observables & observers
        animal.addObserver(hiker);
        animal.addObserver(anotherHiker);

        //then we use our classes like normal
        animal.performAction("sat down on the road");


    }
}