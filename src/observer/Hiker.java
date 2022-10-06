package observer;

public class Hiker implements IObserver {

    private String name;

    public Hiker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() { //called by observable objects
        System.out.println("The hiker noticed something");
    }
}
