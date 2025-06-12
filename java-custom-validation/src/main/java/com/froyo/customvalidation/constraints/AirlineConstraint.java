package com.froyo.customvalidation.constraints;

import com.froyo.customvalidation.AirlineValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = AirlineValidator.class)
@Documented
public @interface AirlineConstraint {

    String message() default "Airline NO VALIDA.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
