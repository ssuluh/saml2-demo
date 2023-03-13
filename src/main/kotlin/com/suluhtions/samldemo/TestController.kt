package com.suluhtions.samldemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class TestController {
    @GetMapping ("/v1/test")
    fun getTestObject(): TestModel {
        return TestModel(UUID.randomUUID().toString(), "randomValue")
    }
}


class TestModel (public val id: String, public val value:String){
}