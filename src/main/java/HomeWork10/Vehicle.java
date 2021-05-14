package HomeWork10;

public abstract class Vehicle {
    //(2 points) 3 level of inheritance (classes similar to the image below)
    // with described variables and methods (add some actions to methods body,
    // for example print some text to console).

    int speed;
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    void speedUp(int value) {
        System.out.println("speedUp: " + value);
    }

    void applyBreak(int value) {
        System.out.println("applyBreak: " + value);
    }

    public void move() {
        System.out.println("Vehicle is move");
    }

    public void move(int speed) {
        System.out.println("Vehicle moves at speed: " + speed);
    }

    abstract void proportions();

}
