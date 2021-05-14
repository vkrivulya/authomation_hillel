package HomeTask8;

public class ConstructorsMain {
    // 4) Create class with 3 variables and 3 constructors.
    // Add usage of all constructor and variables in main method in other class
    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        constructors.setAge(23);
        constructors.setName("John");
        constructors.setGender("male");
        System.out.println("The result of using constructor 1:");
        System.out.println("name: " + constructors.getName());
        System.out.println("age: " + constructors.getAge());
        System.out.println("gender:" + constructors.getGender());

        Constructors constructors1 = new Constructors(26);
        System.out.println("The result of using constructor 2:");
        System.out.println("age: " + constructors1.getAge());


        Constructors constructors2 = new Constructors("Hanna", 28, "female");
        System.out.println("The result of using constructor 3:");
        System.out.print("name: " + constructors2.getName() + ", ");
        System.out.print("age: " + constructors2.getAge() + ", ");
        System.out.print("gender: " + constructors2.getGender());
    }
}
