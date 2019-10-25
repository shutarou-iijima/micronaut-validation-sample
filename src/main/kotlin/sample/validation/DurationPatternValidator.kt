package sample.validation

import io.micronaut.context.ApplicationContext
import sample.Hello
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class DurationPatternValidator: ConstraintValidator<DurationPattern, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        val ctx = ApplicationContext.run()
        val h = ctx.getBean(Hello::class.java)
        return false
    }
}
