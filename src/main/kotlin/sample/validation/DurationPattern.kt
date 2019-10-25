package sample.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [])
//@Constraint(validatedBy = [DurationPatternValidator::class])
annotation class DurationPattern(
    val message: String = "invalid duration ({validatedValue})",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
