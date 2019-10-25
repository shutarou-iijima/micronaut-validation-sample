package sample

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import sample.validation.DurationPattern
import javax.validation.Valid

@Validated
@Controller("/")
class HelloController(
    private val service: HelloService
) {

    @Post("/postParameter")
    fun postParameter(@DurationPattern duration: String): String {
        return "OK"
    }

    @Post("/postForm")
    fun postForm(@Body @Valid form: Form): String {
        return "OK"
    }

    @Get("/method")
    fun method(): String {
        service.fn("duration")
        return "OK"
    }
}

data class Form(
    @field:DurationPattern
    val duration: String
)
