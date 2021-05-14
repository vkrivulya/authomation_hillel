package HomeTask8;

import java.util.Objects;

public class First {
    //5) Create 2 classes, each contains 2 variables. In first class override equals and hashcode.
    // Create few instances of both classes and compare them using ‘==’ and equals()
    int age;
    String name;

    public First(String name) {
        this.name = name;
    }

    public First(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        First first = (First) o;
        return age == first.age &&
                Objects.equals(name, first.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
