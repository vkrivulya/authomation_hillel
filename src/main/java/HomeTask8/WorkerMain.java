package HomeTask8;

public class WorkerMain {
    //1) Create class Worker with next fields: String name, int age, String position, int salary.
    // Give some default values to these fields and add constructor which add new values to them.
    // Add getters and setters. Use all of methods in main in other class.
    //2) Add method toString() to Worker class. Add usage of toString() to main in other class.
    public static void main(String[] args) {
        Worker main = new Worker();

        main.setAge(28);
        main.setName("Anna");
        main.setSalary(2000);

        System.out.println("age: " + main.getAge());
        System.out.println("name: " + main.getName());
        System.out.println("salary: " + main.getSalary());
        System.out.println(main);
        System.out.println(main.toString());

    }
}
