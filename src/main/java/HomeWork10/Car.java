package HomeWork10;

public class Car extends Vehicle {
    static String carType = "Hatchback";
    static String transmission = "Automatic";

    public static String getCarType() {
        return carType;
    }

    public static String getTransmission() {
        return transmission;
    }

    @Override
    public void proportions() {
        System.out.println("abstract method implementation");
    }


}
