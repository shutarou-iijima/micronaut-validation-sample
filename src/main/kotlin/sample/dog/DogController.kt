package sample.dog

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("dog")
class DogController {

    @Post("/postForm")
    fun postForm(@Body @Valid form: DogForm): String {
        return "OK"
    }
}

data class DogForm(
    @field:ValidDog
    val dog: Dog
)
