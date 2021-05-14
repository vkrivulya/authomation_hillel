package HomeWork10;

public class Runner {
    public static void main(String[] args) {
        MountainBicycle mountainBicycle = new MountainBicycle();

        mountainBicycle.setSeatHeight(10);
        System.out.println("Seat Height is: " + mountainBicycle.getSeatHeight());

        RoadBicycle roadBicycle = new RoadBicycle();
        roadBicycle.setRudderDepth(4);
        System.out.println("Rudder Depth is: " + roadBicycle.getRudderDepth());

        Helicopter helicopter = new Helicopter();
        Helicopter helicopter1 = new Helicopter();
        System.out.println("Comparing two objects of a helicopter:");
        System.out.println("Compare with == " + (helicopter == helicopter1));
        System.out.println("Compare with equals  " + helicopter.equals(helicopter1));

        RoadBicycle roadBicycle1 = new RoadBicycle();
        System.out.println("Comparing two objects of a RoadBicycle:");
        System.out.println("Compare with == " + (roadBicycle == roadBicycle1));
        System.out.println("Compare with equals  " + roadBicycle.equals(roadBicycle1));

        System.out.println("Car type: " + Car.getCarType());
        System.out.println("transmission: " + Car.getTransmission());

        // 4. class Singleton and usage of it
        Singleton singleton = Singleton.getInstance();
        System.out.println("Outputting a variable from the Singleton class: " + singleton.s);

        //5. inner, static and anonymous classes, just examples written by your own.

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        System.out.println("Outputting a variable from the Outer class: " + outerClass.a);
        System.out.println("Outputting a variable from the Inner class: " + innerClass.b);
        System.out.println("Outputting a variable from the Static class: " + staticNestedClass.c);


    }
}
