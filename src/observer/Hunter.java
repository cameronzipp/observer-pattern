package observer;

import observable.Observable;

import java.util.ArrayList;
import java.util.List;

public class Hunter implements IObserver{

    private String name;
    private List<String> huntingGear;

    public Hunter(String name) {
        this.name = name;
        huntingGear = new ArrayList<>();
    }

    public List<String> getHuntingGear() {
        return huntingGear;
    }


    @Override
    public void update() {
        System.out.println("The hunter noticed something");
    }
}
