package HomeTask8;

public class Constructors {
    // 4) Create class with 3 variables and 3 constructors.
    // Add usage of all constructor and variables in main method in other class
    private String name;
    private int age;
    private String gender;

    public Constructors() {
        name = "Ann";
        age = 21;
        gender = "female";
    }


    public Constructors(int age) {
        this.age = age;
    }

    public Constructors(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
