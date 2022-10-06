package observable;

public class Mountain extends Observable {

    private String type;
    private boolean snowCap;

    public Mountain(String type, boolean snowCap) {
        this.type = type;
        this.snowCap = snowCap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSnowCap() {
        return snowCap;
    }

    public void setSnowCap(boolean snowCap) {
        this.snowCap = snowCap;
    }

    public void performAction(String actionMessage) {
        //Simulates something interesting happening. Should let observers know about it
        System.out.println("The " + type + " mountain did something");
        notifyObservers(); //this is from the parent class
    }
}
