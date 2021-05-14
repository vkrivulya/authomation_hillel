package HomeWork10;

import java.util.Objects;

public class Helicopter extends Vehicle {
    int amountOfPasangers;
    int maxHeight;
    int tankSize;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return amountOfPasangers == that.amountOfPasangers &&
                maxHeight == that.maxHeight &&
                tankSize == that.tankSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfPasangers, maxHeight, tankSize);
    }


    @Override
    public String toString() {
        return "Helicopter{" +
                "amountOfPasangers=" + amountOfPasangers +
                ", maxHeight=" + maxHeight +
                ", tankSize=" + tankSize +
                '}';
    }

    public void move() {
        System.out.println("move up");
    }

    @Override
    void proportions() {
        System.out.println("abstract method implementation");
    }

}
