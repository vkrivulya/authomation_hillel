package HomeWork11;

public enum HorizonSide {
    //2. Write a program which contains enum and realization of abstract method in it.
    // Please choose any example, enum should contain 4 values, each different realization
    //of abstract method.

    NORTH {
        @Override
        public HorizonSide move() {
            System.out.println("Moving north");
            return null;
        }
    },
    SOUTH {
        @Override
        public HorizonSide move() {
            System.out.println("Moving south");
            return null;
        }
    },
    WEST {
        @Override
        public HorizonSide move() {
            System.out.println("Moving west");
            return null;
        }
    },
    EAST {
        @Override
        public HorizonSide move() {
            System.out.println("Moving east");
            return null;
        }
    };

    public abstract HorizonSide move();


}
