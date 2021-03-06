package lt.codeacademy.reactprojektas.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UsernameValidator.class)
public @interface UniqueUsername {

    String message() default "{validate.unique}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
