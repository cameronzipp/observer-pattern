package observable;

public class WildernessAnimal extends Observable {

    private String type;
    private String location;

    public WildernessAnimal(String type, String location) {
        this.type = type;
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void performAction(String actionMessage) {
        //Simulates something interesting happening. Should let observers know about it
        System.out.println("The " + type + "animal did something");
    }
}
