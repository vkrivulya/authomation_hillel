package HomeWork13;

import java.util.*;

//5. Create HashMap with 3 user defined objects Employee (id, name, city).
// Employee is separate class with described fields and overriden toString(),equals() and hashcode() methods.
// Compare these 3 objects of Employee as values of maps (they need to have different keys)
public class Task5 {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(43, new Employee(1, "John", "Kyiv"));
        employeeMap.put(44, new Employee(2, "Anna", "Lviv"));
        employeeMap.put(45, new Employee(3, "Igor", "Dnipro"));
        employeeMap.put(46, new Employee(3, "Igor", "Dnipro"));

        System.out.println(employeeMap.get(43).equals(employeeMap.get(44)));
        System.out.println(employeeMap.get(43).equals(employeeMap.get(45)));
        System.out.println(employeeMap.get(43).equals(employeeMap.get(46)));
        System.out.println(employeeMap.get(44).equals(employeeMap.get(45)));
        System.out.println(employeeMap.get(44).equals(employeeMap.get(46)));
        System.out.println(employeeMap.get(45).equals(employeeMap.get(46)));

    }
}

