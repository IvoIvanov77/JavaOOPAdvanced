package d_enumerations_and_anotations.exercises.inferno_infinity.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {

//    author, revision, description and reviewers

    String author() default "";
    int revision() default 0;
    String description() default "";
    String[] reviewers() default "";
}
