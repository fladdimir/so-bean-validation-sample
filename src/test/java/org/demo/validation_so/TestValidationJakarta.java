package org.demo.validation_so;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

// uncomment corresponding dependencies in build.gradle before executing the test
class TestValidationJakarta {

    @Test
    void testValidation() {

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Object objectVerif = new Object("ss");
        Set<ConstraintViolation<Object>> validationErrors = validator.validate(objectVerif);

        assertThat(validationErrors).hasSize(1); // only the jakarta constraint is validated by the jakarta validator
        assertThat(validationErrors.iterator().next().getMessage()).isEqualTo(
                "size must be between 4 and 14"); // standard jakarta constraint

        validationErrors.forEach(System.out::println);
    }

}
