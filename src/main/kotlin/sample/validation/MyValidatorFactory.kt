package sample.validation

import io.micronaut.context.annotation.Factory
import io.micronaut.validation.validator.constraints.ConstraintValidator
import javax.inject.Singleton


@Factory
class MyValidatorFactory {

    @Singleton
    fun durationPatternValidator() : ConstraintValidator<DurationPattern, Any> {
        return ConstraintValidator { value, annotation, context ->
            value == null || value.toString().matches("^PT?[\\d]+[SMHD]{1}$".toRegex())
        }
    }
}
