package test;

import observable.Mountain;
import observable.WildernessAnimal;
import observer.Hiker;
import observer.Hunter;

public class Main {
    public static void main(String[] args) {
        //create observable
        WildernessAnimal animal = new WildernessAnimal("Bison", "Yellowstone Park");
        Mountain everest = new Mountain("dormant", true);

        //create observers
        Hiker hikerCameron = new Hiker("Cameron");
        Hiker hikerCody = new Hiker("Cody");
        Hunter hunterBob = new Hunter("Bob");

        //connect observables & observers
        animal.addObserver(hikerCameron);
        animal.addObserver(hikerCody);
        animal.addObserver(hunterBob);
        everest.addObserver(hikerCameron);

        //then we use our classes like normal
        animal.performAction("sat down on the road");
        everest.performAction("rumbles");

    }
}