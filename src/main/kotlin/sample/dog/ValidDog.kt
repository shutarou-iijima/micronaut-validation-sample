package sample.dog

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [])
annotation class ValidDog(
    val message: String = "invalid dog ({validatedValue})",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
