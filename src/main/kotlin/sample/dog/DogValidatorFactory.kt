package sample.dog

import io.micronaut.context.annotation.Factory
import io.micronaut.validation.validator.constraints.ConstraintValidator
import javax.inject.Singleton

@Factory
class DogValidatorFactory {

    @Singleton
    fun validDogValidator() : ConstraintValidator<ValidDog, Any> {
        return ConstraintValidator { value, annotation, context ->
            false
        }
    }
}
