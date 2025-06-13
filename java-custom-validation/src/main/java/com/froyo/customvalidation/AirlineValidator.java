package com.froyo.customvalidation;

import com.froyo.customvalidation.constraints.AirlineConstraint;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

import static com.froyo.common.codevalues.AIRLINE.*;

@SuppressWarnings("ParameterNameDiffersFromOverriddenParameter")
public class AirlineValidator implements ConstraintValidator<AirlineConstraint, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return List.of(AEROMEXICO.name(), INTERJET.name(), VIVAAEROBUS.name(), VOLARIS.name()) //
                .contains(StringUtils.upperCase(value));
    }
}
