package org.demo.validation_so;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.junit.jupiter.api.Test;

// uncomment corresponding dependencies in build.gradle before executing the test
class TestValidationJavax {

    @Test
    void testValidation() {

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Object objectVerif = new Object("ss");
        Set<ConstraintViolation<Object>> validationErrors = validator.validate(objectVerif);

        assertThat(validationErrors).hasSize(1);
        assertThat(validationErrors.iterator().next().getMessage()).isEqualTo("test"); // own custom javax validation

        validationErrors.forEach(System.out::println);
    }

}
