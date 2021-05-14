package HomeWork10;

public class MountainBicycle extends Bicycle {
    private int seatHeight;

    public MountainBicycle() {
        super();
    }

    @Override
    void color() {
        System.out.println("abstract color_method  implementation");
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }


    @Override
    void proportions() {
        System.out.println("abstract proportions_method implementation");
    }
}
