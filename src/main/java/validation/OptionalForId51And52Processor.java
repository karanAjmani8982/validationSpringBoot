package validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
public class OptionalForId51And52Processor {
        private final Validator validator;

        public OptionalForId51And52Processor() {
            this.validator = Validation.buildDefaultValidatorFactory().getValidator();
        }

        public <T> void processObject(T object, Integer tenderId) {
            Set<ConstraintViolation<T>> violations;
            if (tenderId == 51 || tenderId == 52) {
                violations = validator.validate(object, OptionalForId51And52.class);
            }
            else {
                violations = validator.validate(object);
            }

            if (!violations.isEmpty()) {
                log.info("Validation errors:");
                for (ConstraintViolation<T> violation : violations) {
                    System.out.println(violation.getPropertyPath() + " " + violation.getMessage());
                }
            } else {
                log.info("Object processed successfully: " + object);
            }
        }
}