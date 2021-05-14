package HomeWork10;

public class OuterClass {

    int a = 9;

    public void methodOuter() {
        System.out.println("methodOuter");
    }

    class InnerClass {
        int b = 12;
    }

    static class StaticNestedClass {
        int c = 30;
    }

    static class Anonymous {
        static OuterClass outerClass = new OuterClass() {
            public void methodOuter() {
                super.methodOuter();
                System.out.println("Anonymous methodOuter");
            }
        };

        public static void main(String[] args) {
            outerClass.methodOuter();
        }
    }


}
