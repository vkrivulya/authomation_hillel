package HomeWork14;

@Task2Annotation(
        target = "2. Create your own annotation with 5 variables as metadata fields. Add usage of new annotation for method, class, variable.",
        createdBy = "Vitaliy",
        tags = ("annotations")
)
public class Task2 {

    public static void main(String[] args) {
        @Task2Annotation(
                target = "usage of new annotation for variable"
        )
        String local = "qwe";
    }

    @Task2Annotation(
            target = "usage of new annotation for constructor"
    )
    public Task2(int count) {
        this.count = count;
    }

    @Task2Annotation(
            target = "usage of new annotation for FIELD"
    )
    int count;


    @Task2Annotation(
            target = "usage of new annotation for method",
            createdBy = "Vitaliy",
            lastModified = "18/04/2021",
            priority = Task2Annotation.Priority.HIGH
    )
    void method() {
        System.out.println("usage of new annotation for method");
        deprecatedMethod();
    }

    @Deprecated
    void deprecatedMethod() {
        System.out.println("This method is deprecated");
    }
}
