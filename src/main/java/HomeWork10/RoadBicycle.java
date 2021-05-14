package HomeWork10;

public class RoadBicycle extends Bicycle {
    private int rudderDepth;

    public RoadBicycle() {
        super();
    }

    @Override
    void color() {
        System.out.println("abstract color_method  implementation");
    }

    public void setRudderDepth(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }


    @Override
    void proportions() {
        System.out.println("abstract proportions_method  implementation");
    }
}
