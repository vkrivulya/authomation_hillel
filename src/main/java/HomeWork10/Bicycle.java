package HomeWork10;

public abstract class Bicycle extends Vehicle {

    public int id;
    protected int gear;

    public Bicycle(int gear) {
        this.gear = gear;
    }

    public Bicycle() {
        id = 0;
        gear = 1;
    }

    public Bicycle(int id, int gear) {
        this.id = id;
        this.gear = gear;
    }

    public void changeGear(int value) {
        System.out.println("New Gear = " + value);
    }

    public void move() {
        System.out.println("Bicycle is move too");
    }

    public void move(int speed) {
        System.out.println("Bicycle moves at speed: " + speed);
    }

    public int getId() {
        return id;
    }

    public int getGear() {
        return gear;
    }

    abstract void color();
}
