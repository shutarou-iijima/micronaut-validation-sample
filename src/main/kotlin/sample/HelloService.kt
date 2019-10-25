package sample

import sample.validation.DurationPattern
import javax.inject.Singleton

@Singleton
open class HelloService {

    open fun fn(@DurationPattern duration: String) {
        println(duration)
    }
}
