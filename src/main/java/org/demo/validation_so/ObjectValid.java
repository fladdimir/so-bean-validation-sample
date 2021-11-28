package org.demo.validation_so;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = TestValidateur.class)
public @interface ObjectValid {

    String message() default "test";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
