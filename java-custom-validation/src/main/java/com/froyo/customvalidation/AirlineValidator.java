package com.froyo.customvalidation;

import com.froyo.customvalidation.constraints.AirlineConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

import static com.froyo.common.codevalues.AIRLINE.*;

@SuppressWarnings("ParameterNameDiffersFromOverriddenParameter")
public class AirlineValidator implements ConstraintValidator<AirlineConstraint, String> {

    private static final List<String> VALID_AIRLINES = List.of(
            AEROMEXICO.name(), INTERJET.name(), VIVAAEROBUS.name(), VOLARIS.name());

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && VALID_AIRLINES.contains(value.toUpperCase());
    }
}
