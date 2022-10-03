package observable;

import observer.IObserver;
import java.util.HashSet;
import java.util.Set;

//This class should be inherited by all "Observable" objects. "Observable" objects do interesting things
//which they will inform "Observers" when they happen
public abstract class Observable {

    //store a list of observers
    private Set<IObserver> observers;

    public Observable() {
        observers = new HashSet<>();
    }

    public void addObserver(IObserver observer) { //this will quietly reject duplicate observers
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() { //this method tells all observers something has changed
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
