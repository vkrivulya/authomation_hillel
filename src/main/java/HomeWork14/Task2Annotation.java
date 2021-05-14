package HomeWork14;

import java.lang.annotation.*;

//2. Create your own annotation with 5 variables as metadata fields.
// Add usage of new annotation for method, class, variable.
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Inherited
@Documented
public @interface Task2Annotation {
    public enum Priority {LOW, MEDIUM, HIGH}

    Priority priority() default Priority.LOW;

    String target() default "";

    boolean lazy() default false;

    String[] tags() default "";

    String createdBy() default "QA";

    String lastModified() default "17/04/2021";

}
