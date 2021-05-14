package HomeTask8;

public class Worker {
    //1) Create class Worker with next fields: String name, int age, String position, int salary.
    // Give some default values to these fields and add constructor which add new values to them.
    // Add getters and setters. Use all of methods in main in other class.
    //2) Add method toString() to Worker class. Add usage of toString() to main in other class.

    private String name = "DefaultName";
    private int age = 16;
    private int salary = 100;


    Worker() {
        name = "Liza";
        age = 21;
        salary = 1000;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
